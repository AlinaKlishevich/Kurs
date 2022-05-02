package Servlet;

import Logic.DatabaseHandler;
import Logic.Users;
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

@WebServlet("/infoforusers")
public class InfoForUsers extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ResultSet resSet=DatabaseHandler.infoUsers();

            List users= new ArrayList();
            while (resSet.next()) {
                Users us = new Users();
                us.setIdusers(resSet.getString(1));
                us.setLogin(resSet.getString(2));
                us.setPassword(resSet.getString(3));
                us.setAccess(resSet.getString(4));



                users.add(us);
            }
            request.setAttribute("infousers", users);
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/infousers.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
