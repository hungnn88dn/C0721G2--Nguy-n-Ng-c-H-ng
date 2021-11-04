package controller;

import models.Employee;
import models.Facility;
import repository.FacilityServiceRepo;
import repository.impl.FacilityRepoImpl;
import service.FacilityService;
import service.impl.EmployeeServiceImpl;
import service.impl.FacilityServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "FacilityServlet", urlPatterns = "/facility")
public class FacilityServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private FacilityService facilityDAO;

    public void init() {
        facilityDAO = new FacilityServiceImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                   insertFacility(request,response);
                    break;

                default:
                    listFacility(request,response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                showCreateForm(request,response);
                    break;

                default:
                    listFacility(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    private void listFacility(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Facility> facilityList = facilityDAO.selectAllFacility();
        request.setAttribute("listFacilityServlet", facilityList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("facility/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("facility/create.jsp");
        dispatcher.forward(request, response);
    }
    private void insertFacility(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        int rentalCost = Integer.parseInt(request.getParameter("rentalCost"));
        String standardRoom = request.getParameter("standardRoom");
        String description = request.getParameter("description");
        double poolArea = Double.parseDouble(request.getParameter("poolArea"));
        int floor =Integer.parseInt(request.getParameter("floor"));
        String rentalType = request.getParameter("rentalType");
        String serviceType = request.getParameter("serviceType");
        facilityDAO.insertFacility(new Facility(name,area,maxPeople,rentalCost,standardRoom,description,poolArea,floor,rentalType,serviceType));
        listFacility(request,response);
    }
}
