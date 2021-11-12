package controller;

import models.Contract;
import models.Customer;
import repository.ContractServiceRepo;
import repository.impl.ContactRepoImpl;
import service.ContractService;
import service.CustomerSerivce;
import service.impl.ContactServiceImpl;
import service.impl.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private ContractService contractDAO;

    public void init() {
        contractDAO = new ContactServiceImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                    insertContract(request, response);
                    break;

                default:
                    listContract(request, response);
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
                    showCreateForm(request, response);
                    break;

                default:
                    listContract(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/create.jsp");
        dispatcher.forward(request, response);
    }

    private void insertContract(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String startDay = request.getParameter("startDay");
        String endDay = request.getParameter("endDay");
        int deposit = Integer.parseInt(request.getParameter("deposit"));
        int totalPrice = Integer.parseInt(request.getParameter("totalPrice"));
        String employee = request.getParameter("employee");
        String customer = request.getParameter("customer");
        String service = request.getParameter("service");
        contractDAO.insertContract(new Contract(startDay, endDay, deposit, totalPrice, employee, customer, service));
          listContract(request,response);
    }

    private void listContract(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Contract> contractList = contractDAO.selectAllContract();
        request.setAttribute("listContractServlet", contractList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/list.jsp");
        dispatcher.forward(request, response);
    }
}
