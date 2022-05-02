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

@WebServlet("/searchrecord")
public class SearchRecord extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberauto = request.getParameter("numberauto");
        String data = null;


        try {
            data = DatabaseHandler.fingRecord(numberauto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(data != DatabaseHandler.fingRecord(numberauto)) {
                String[] strings = data.split("\\ ");

                request.setAttribute("1", strings[0]);
                request.setAttribute("2", strings[1]);
                request.setAttribute("3", strings[2]);
                request.setAttribute("4", strings[3]);
                request.setAttribute("5", strings[4]);


                RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/foundrecord.jsp");
                requestDispatcher.forward(request, response);
            }
            else{
              response.sendRedirect("notfoundrecord.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
