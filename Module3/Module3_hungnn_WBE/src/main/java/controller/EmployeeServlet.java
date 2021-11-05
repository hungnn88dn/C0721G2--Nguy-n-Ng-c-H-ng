package controller;

import models.Employee;
import models.Level;
import repository.impl.EmployeeRepoImpl;
import service.EmployeeService;
import service.impl.EmployeeServiceImpl;
import util.Validate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = {"/employee" })
public class EmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private EmployeeServiceImpl employeeDAO;

    public void init() {
        employeeDAO = new EmployeeServiceImpl();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                    insertEmployee(request,response);
                    break;

                default:
                    listEmployees(request,response);
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
                    listEmployees(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    private void listEmployees(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Employee> listEmployee = employeeDAO.selectAllEmployees();
        request.setAttribute("listEmployeeServlet", listEmployee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/create.jsp");
        dispatcher.forward(request, response);
    }
    private void insertEmployee(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String phoneError = null;
        String emailError = null;
        Boolean flag =false;
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        int cmnd = Integer.parseInt(request.getParameter("cmnd"));
        int salary = Integer.parseInt(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        if (!Validate.validateInput(String.valueOf(phone),Validate.PHONE)) {
            phoneError = "Phone khong dung dinh dang (09xxxxxxx)";
            flag = true;
        }
        String email = request.getParameter("email");
        if (!Validate.validateInput(String.valueOf(email),Validate.EMAIL)) {
            emailError = "Email khong dung dinh dang (abc@xyz.com(.vn))";
            flag = true;
        }
        String address = request.getParameter("address");
        String position = request.getParameter("position");
        String level = request.getParameter("level");
        String department = request.getParameter("department");
        String username = request.getParameter("email");
        Employee employee = new Employee(name,age,cmnd,phone,email,address,level,position,department,salary,username);
        if (flag) {
            request.setAttribute("phoneError", phoneError);
            request.setAttribute("emailError", emailError);
            request.setAttribute("employee", employee);
            showCreateForm(request, response);
        } else {
            employeeDAO.insertUser(employee);
            listEmployees(request, response);
        }
    }
}
