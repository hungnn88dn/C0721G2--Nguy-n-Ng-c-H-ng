import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet",urlPatterns = "/calculator")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double listPrice = Double.parseDouble(request.getParameter("ListPrice"));
        double percent =  Double.parseDouble(request.getParameter("DiscountPercent"));
        double result = listPrice * percent * 0.01;
        request.setAttribute("resultCalculator",result);
        request.getRequestDispatcher("test.jsp").forward(request,response);
    }
}
