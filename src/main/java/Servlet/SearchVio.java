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

@WebServlet("/searchvio")
public class SearchVio extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idviolations = request.getParameter("idviolations");
        String data = null;


        try {
            data = DatabaseHandler.fingvio(idviolations);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (data != DatabaseHandler.fingvio(idviolations)) {


                String[] strings = data.split("\\ ");
                int sum = Integer.parseInt(strings[1]) * 35;
                String s=Integer.toString(sum);

                request.setAttribute("1", strings[0]);
                request.setAttribute("2", strings[1]);
                request.setAttribute("3", s);


                RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/foundvio.jsp");
                requestDispatcher.forward(request, response);
              //  RequestDispatcher requestDispatcher1 = getServletContext().getRequestDispatcher("/payvio.jsp");
                //requestDispatcher1.forward(request, response);
            } else {
                response.sendRedirect("notfoundrecord.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
