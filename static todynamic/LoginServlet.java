import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String cardId = request.getParameter("cardId");

        // Simple hardcoded validation (Replace with real DB validation)
        if ("admin".equals(username) && "1234".equals(password) && "5678".equals(cardId)) {
            // Create a cookie
            Cookie userCookie = new Cookie("username", username);
            userCookie.setMaxAge(60 * 60); // 1 hour expiry
            response.addCookie(userCookie);

            // Redirect to success page
            response.sendRedirect("welcome");
        } else {
            response.getWriter().println("Invalid User! <a href='login.html'>Try Again</a>");
        }
    }
}
