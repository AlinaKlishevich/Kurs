package Servlet;

import Logic.DatabaseHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/payvio")
public class PayVio extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String idviolations = request.getParameter("idviolations");
        String paymentcard = request.getParameter("paymentcard");
        String experationdate = request.getParameter("experationdate");
        String cvv = request.getParameter("cvv");
        String sum = request.getParameter("sum");
        String statement = DatabaseHandler.pay(idviolations, paymentcard, experationdate, cvv, sum);
        response.sendRedirect("result.jsp");

    }

    }