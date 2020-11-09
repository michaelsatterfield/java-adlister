import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       if (request.getSession().getAttribute("user") != null){
           response.sendRedirect("/profile");
           return;
       }
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
    // inside of a servlet

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        HttpSession session = request.getSession();

        if (validAttempt) {
            session.setAttribute("user", username);
            response.sendRedirect("/profile");

        } else {
            session.setAttribute("loginError", "Invalid username or password.");
            response.sendRedirect("/login");
        }
    }
}








//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/login.jsp").forward(request, response);
//    }


//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        if (request.getMethod().equalsIgnoreCase("post")) {
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
//            if (username.equals("admin") && password.equals("password")) {
//                response.sendRedirect("/profile");
//            }
//            request.setAttribute("username", username);
//            request.setAttribute("password", password);
//            request.getRequestDispatcher("/login.jsp").forward(request, response);
//        }
//
//    }
//}
