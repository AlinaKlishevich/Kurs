package Servlet;

import Logic.DatabaseHandler;
import Logic.Pay;
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

@WebServlet("/infopay")
public class InfoForPay extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ResultSet resSet=DatabaseHandler.infoPay();

            List pays= new ArrayList();
            while (resSet.next()) {
              Pay pay=new Pay();
                pay.setIdpay(resSet.getString(1));
                pay.setIdviolations(resSet.getString(2));
                pay.setSum(resSet.getString(3));



                pays.add(pay);
            }
            request.setAttribute("infopay", pays);
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/infopay.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}