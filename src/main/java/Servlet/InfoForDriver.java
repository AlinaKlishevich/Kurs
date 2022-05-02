package Servlet;

import Logic.DatabaseHandler;
import Logic.Drivers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/infofordriver")
public class InfoForDriver extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
           ResultSet resSet=DatabaseHandler.infoDriver();

            List drivers= new ArrayList();
            while (resSet.next()) {
                Drivers dr = new Drivers();
                dr.setSurname(resSet.getString(1));
                dr.setName(resSet.getString(2));
                dr.setPatronymic(resSet.getString(3));
                dr.setPassport(resSet.getString(4));
                dr.setBirthday(resSet.getString(5));

                dr.setAddress(resSet.getString(6));


                drivers.add(dr);
            }
            request.setAttribute("info", drivers);
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/infodriver.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
