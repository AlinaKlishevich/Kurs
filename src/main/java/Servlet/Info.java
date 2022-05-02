package Servlet;

import Logic.DatabaseHandler;
import Logic.TypeViolations;
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

@WebServlet("/info")
public class Info extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ResultSet resSet=DatabaseHandler.info();

            List typeviolations= new ArrayList();
            while (resSet.next()) {
                TypeViolations tv = new TypeViolations();
                tv.setArticle(resSet.getString(1));
                tv.setNameviolations(resSet.getString(2));
                tv.setBase(resSet.getString(3));



                typeviolations.add(tv);
            }
            request.setAttribute("info", typeviolations);
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/info.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
