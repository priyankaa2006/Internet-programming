import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServerServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get all parameter names
        Enumeration<String> paramNames = request.getParameterNames();

        out.println("<html><body>");
        out.println("<h2>Form Data Received:</h2>");

        // Display all parameters
        while (paramNames.hasMoreElements()) {
            String paramName = paramNames.nextElement();
            String paramValue = request.getParameter(paramName);
            out.println("<b>" + paramName + "</b>: " + paramValue + "<br>");
        }

        out.println("</body></html>");
    }
}
