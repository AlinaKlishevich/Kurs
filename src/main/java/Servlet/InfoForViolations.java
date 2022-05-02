package Servlet;
import Logic.DatabaseHandler;
import Logic.Violations;

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


@WebServlet("/infoforviolations")
public class InfoForViolations extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ResultSet resSet = DatabaseHandler.infoViolations();
            List violations = new ArrayList();
            while (resSet.next()) {
                Violations vio = new Violations();
                vio.setIdviolations(resSet.getString(1));
                vio.setNumberauto(resSet.getString(2));
                vio.setArticle(resSet.getString(3));
                vio.setFine(resSet.getInt(4));
                vio.setViolationdate(resSet.getString(5));
                violations.add(vio);

            }
            request.setAttribute("infovio", violations);
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/infoviolations.jsp");
            requestDispatcher.forward(request, response);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
