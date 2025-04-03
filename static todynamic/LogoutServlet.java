import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie userCookie = new Cookie("username", "");
        userCookie.setMaxAge(0); // Delete cookie
        response.addCookie(userCookie);

        response.sendRedirect("login.html");
    }
}
