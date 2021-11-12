package controller;

import models.Customer;
import models.Employee;
import repository.CustomerSerivceRepo;
import repository.impl.CustomerRepoImpl;
import service.CustomerSerivce;
import service.impl.CustomerServiceImpl;
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

@WebServlet(name = "CustomerServlet" ,urlPatterns = {"/customer" })
public class CustomerServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;
    private CustomerSerivce customerDAO;

    public void init() {
        customerDAO = new CustomerServiceImpl();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                  insertCustomer(request,response);
                    break;

                default:
                    listCustomer(request,response);
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
                    listCustomer(request,response) ;
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    private void showCreateForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        dispatcher.forward(request, response);
    }
    private void listCustomer(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Customer> customerList = customerDAO.selectAllCustomer();
        request.setAttribute("listCustomerServlet", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        dispatcher.forward(request, response);
    }

    private void insertCustomer(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String phoneError = null;
        String emailError = null;
        Boolean flag =false;
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        int cmnd = Integer.parseInt(request.getParameter("cmnd"));
        String gender = request.getParameter("gender");
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
        String type_customer = request.getParameter("type_customer");
        Customer customer = new Customer(name,age,gender,cmnd,phone,email,address,type_customer);
        if (flag) {
            request.setAttribute("phoneError", phoneError);
            request.setAttribute("emailError", emailError);
            request.setAttribute("customer", customer);
            showCreateForm(request, response);
        } else {
            customerDAO.insertCustomer(customer);
            listCustomer(request, response);
        }
    }
}
