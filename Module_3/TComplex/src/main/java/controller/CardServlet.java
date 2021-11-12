package controller;

import model.Book;
import model.BookCard;
import repository.IBookCardRepo;
import repository.impl.BookCardRepoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CardServlet", urlPatterns = "")
public class CardServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private IBookCardRepo cardDAO;

    public void init() {
        cardDAO = new BookCardRepoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "borrow":
                    insertCard(request,response);
                    break;


                default:
                    listBook(request,response);
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
                case "borrow":
                    showBorrow(request,response);
                    break;

                default:
                    listBook(request,response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Book> bookList = cardDAO.selectAllBook();
        request.setAttribute("listBookServlet", bookList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);
    }

    private void listBookCard(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<BookCard> bookCards = cardDAO.selectAllBookCard();
        request.setAttribute("listCardServlet", bookCards);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list_card.jsp");
        dispatcher.forward(request, response);
    }

    private void showBorrow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        request.setAttribute("name", name);
        request.getRequestDispatcher("borrow.jsp").forward(request,response);
    }
    private void insertCard(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Book> bookList = cardDAO.selectAllBook();
        String id = request.getParameter("id");
        String book = request.getParameter("book");
        String student = request.getParameter("student");
        String status = "1";
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        BookCard bookCard = new BookCard(id,book,student,status,start,end);
        for (Book b: bookList) {
            if (b.getName().equals(book)) {
                b.setAmount(b.getAmount() - 1);
            }
        }
            cardDAO.insertBookCard(bookCard);
            listBookCard(request, response);
    }
}
