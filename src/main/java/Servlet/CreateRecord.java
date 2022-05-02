package Servlet;

import Logic.DatabaseHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/createrecord")
public class CreateRecord extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String numberauto=request.getParameter("numberauto");
        String  article=request.getParameter("article");
        String violationdate =request.getParameter("violationdate");
        String fine=request.getParameter("fine");

        String statement = DatabaseHandler.recordAdd(numberauto,article,violationdate,fine);
        response.sendRedirect("result.jsp");

    }
}
