package Servlet;

import Logic.DatabaseHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@javax.servlet.annotation.WebServlet("/registration")
public class Registration extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        boolean flag;
        String reglogin = request.getParameter("reglogin");
        String regpassword = request.getParameter("regpassword");
        //System.out.println("login = " + reglogin + " password = " + regpassword);
        try {
            flag = DatabaseHandler.userAdd(reglogin, regpassword);
            if(!flag){
                response.sendRedirect("error.jsp");
            }
            else{
                response.sendRedirect("result.jsp");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
