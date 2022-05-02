package Servlet;

import Logic.DatabaseHandler;
import Logic.Auto;

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

@WebServlet("/infoforauto")
public class InfoForAuto extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ResultSet resSet=DatabaseHandler.infoAuto();

            List auto= new ArrayList();
            while (resSet.next()) {
                Auto au = new Auto();
                au.setNumberauto(resSet.getString(1));
                au.setBrand(resSet.getString(2));
                au.setPassport(resSet.getString(3));



                auto.add(au);
            }
            request.setAttribute("infoauto", auto);
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/infoauto.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
