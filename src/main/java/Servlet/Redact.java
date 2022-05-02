package Servlet;

import Logic.DatabaseHandler;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/redactrecord")
public class Redact extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean exist = false;
        String idviolations = request.getParameter("idviolations");

        try {
            exist = DatabaseHandler.Redact(idviolations);
            if(exist == true){
                RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/redactinput.jsp");
                requestDispatcher.forward(request,response);
            }
            else{
                response.sendRedirect("redact.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
