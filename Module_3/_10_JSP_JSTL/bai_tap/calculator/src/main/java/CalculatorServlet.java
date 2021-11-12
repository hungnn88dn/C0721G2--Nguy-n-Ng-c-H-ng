import bean.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double a = Double.parseDouble(request.getParameter("first"));
        double b = Double.parseDouble(request.getParameter("second"));
        String operator = request.getParameter("operator");
        double result = 0.0;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        try {
            Calculator calculator = new Calculator(a, b);
            if (operator.contains("Addition")) {
                result = calculator.add();
            } else if (operator.contains("Subtraction")) {
                result = calculator.sub();
            }else if (operator.contains("Multiplication")) {
                result = calculator.mul();
            }else {
                result = calculator.div();
            }
                writer.println("<h1>" + result + "</h1>");
        }catch (Exception ex) {
            writer.println("<h1>"+ex.getMessage()+"</h1>");
        }
        writer.println("</html>");
    }
}
