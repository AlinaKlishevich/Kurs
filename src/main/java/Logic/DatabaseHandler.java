package Logic;


import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DatabaseHandler extends Configs {

    public static final String USER_TABLE = "users";

    public static final String USERS_ID = "idusers";
    public static final String USER_LOGIN = "login";
    public static final String USER_PASSWORD = "password";
    public static final String USER_ACCESS = "access";

    public static final String VIOLATIONS_TABLE = "violations";
    public static final String VIOLATIONS_ID = "idviolations";
    public static final String VIOLATION_DATE = "violationdate";
    public static final String VIOLATIONS_FINE = "fine";
    public static final String VIOLATIONS_NUMBERAUTO = "numberauto";
    public static final String VIOLATIONS_ARTICLE = "vioarticle";

    public static final String DRIVER_TABLE = "drivers";
    public static final String DRIVER_SURNAME = "surname";
    public static final String DRIVER_NAME = "name";
    private static final String DRIVER_PATRONYMIC = "patronymic";
    public static final String DRIVER_PASSPORT = "passport";
    public static final String DRIVER_ADDRESS = "address";
    public static final String DRIVER_BIRTHDAY = "birthday";

    public static final String AUTO_TABLE = "auto";
    public static final String AUTO_BRAND = "brand";
    public static final String AUTO_NUMBER = "numberauto";

    public static final String TYPEVIOLATIONS_TABLE = "typeviolations";
    public static final String TYPEVIOLATIONS_ARTICLE = "article";
    public static final String TYPEVIOLATIONS_NAMEVIOLATIONS = "nameviolations";

    public static final String TYPEVIOLATIONS_BASE = "base";

    public static final String PAY_TABLE = "pay";
    public static final String PAY_ID = "idpay";
    public static final String PAY_PAYMENTCARD = "paymentcard";
    public static final String PAY_EXPIRATIONDATE = "expirationdate";
    public static final String PAY_SUM = "sum";
    public static final String PAY_CVV = "cvv";


    public static Connection getDbConnection()
            throws ClassNotFoundException, SQLException {

        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName + "?" + "autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&characterEncoding=utf8";
        Class.forName("com.mysql.jdbc.Driver");

        Connection dbConnection = DriverManager.getConnection(connectionString,
                dbUser, dbPass);
        return dbConnection;

    }

    public static boolean userAdd(String reglogin, String regpassword) throws IOException, ClassNotFoundException, SQLException {
        ResultSet resSet = null;
        boolean flag = true;

        String select = "SELECT * FROM " + USER_TABLE + " WHERE " + USER_LOGIN + "=?" + USER_PASSWORD + "=?";
        System.out.println(select);
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, reglogin);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (resSet != null && resSet.next()) {
            flag = false;
        } else {
            String insert = "INSERT INTO " + USER_TABLE + "(" +
                    USER_LOGIN + "," + USER_PASSWORD + ")" +
                    "VALUES(?, ?)";
            try {
                PreparedStatement prSt = getDbConnection().prepareStatement(insert);
                prSt.setString(1, reglogin);
                prSt.setString(2, regpassword);
                prSt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

    public static boolean adminEnter(String adminlogin, String adminpassword) throws SQLException, ClassNotFoundException {
        Statement statement = getDbConnection().createStatement();
        boolean result = false;

        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + USER_TABLE);
        while (resultSet.next()) {
            String logCheck = resultSet.getString(2);
            String passCheck = resultSet.getString(3);
            int accessCheck = resultSet.getInt(4);
            if (adminlogin.equals(logCheck) && adminpassword.equals(passCheck) && accessCheck == 0) {
                result = true;
            }
            //System.out.println(result);
        }
        return result;
    }

    public static boolean userEnter(String userlogin, String userpassword) throws SQLException, ClassNotFoundException {
        Statement statement = getDbConnection().createStatement();
        boolean result = false;

        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + USER_TABLE);
        while (resultSet.next()) {
            String logCheck = resultSet.getString(2);
            String passCheck = resultSet.getString(3);
            int accessCheck = resultSet.getInt(4);
            if (userlogin.equals(logCheck) && userpassword.equals(passCheck) && accessCheck == 1) {
                result = true;
            }
            //System.out.println(result);
        }
        return result;
    }
public  static String pay(String idviolations, String paymentcard, String experationdate, String cvv, String sum){

        String insert=" INSERT INTO " + PAY_TABLE + "("+ VIOLATIONS_ID + ","+ PAY_PAYMENTCARD + "," + PAY_EXPIRATIONDATE + "," + PAY_CVV + "," + PAY_SUM   + ")" + "VALUES(?,?,?,?,?)";
try {
    PreparedStatement prSt=getDbConnection().prepareStatement(insert);
    prSt.setString(1,idviolations);
    prSt.setString(2,paymentcard);
    prSt.setString(3,experationdate);
    prSt.setString(4,cvv);
    prSt.setString(5,sum);
    prSt.executeUpdate();
} catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }

    String statement = "Данные записаны успешно";
        return statement;
}


    public static String recordAdd(String numberauto, String article, String violationdate, String fine) {
        ResultSet resSet = null;
        String insert = "INSERT INTO " + VIOLATIONS_TABLE + "(" + AUTO_NUMBER + "," + TYPEVIOLATIONS_ARTICLE + "," + VIOLATION_DATE + "," + VIOLATIONS_FINE + ")" +
                "VALUES( ?, ?, ?, ?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);

            prSt.setString(1, numberauto);
            prSt.setString(2, article);
            prSt.setString(3, violationdate);
            prSt.setString(4, fine);

            prSt.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        String statement = "Данные записаны успешно";
        return statement;
    }


    public static boolean delUser(String delLogin) throws SQLException {
        ResultSet resSet = null;
        boolean result;
        int resSet1;
        String select = " ";

        String selectCheck = "SELECT * FROM " + USER_TABLE + " WHERE " + USER_LOGIN + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(selectCheck);
            prSt.setString(1, delLogin);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (resSet != null && resSet.next()) {
            select = "DELETE FROM " + USER_TABLE + " WHERE " + USER_LOGIN + "=?";
            try {
                PreparedStatement prSt = getDbConnection().prepareStatement(select);
                prSt.setString(1, delLogin);
                resSet1 = prSt.executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static boolean delRecord(String delidviolations) throws SQLException {
        ResultSet resSet = null;
        boolean result;
        int resSet1;
        String select = " ";

        String selectCheck = "SELECT * FROM " + VIOLATIONS_TABLE + " WHERE " + VIOLATIONS_ID + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(selectCheck);
            prSt.setString(1, delidviolations);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (resSet != null && resSet.next()) {

            select = "DELETE FROM " + VIOLATIONS_TABLE + " WHERE " + VIOLATIONS_ID + "=?";

            try {
                PreparedStatement prSt = getDbConnection().prepareStatement(select);
                prSt.setString(1, delidviolations);
                resSet1 = prSt.executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            result = true;
        } else {
            result = false;
        }

        return result;
    }


    public static ResultSet infoDriver() {
        ResultSet resSet = null;
        String select = "SELECT * FROM " + DRIVER_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        String arr = "";

        return resSet;

    }

    public static ResultSet infoViolations() {
        ResultSet resSet = null;
        String select = "SELECT * FROM " + VIOLATIONS_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        String arr = "";

        return resSet;

    }

    public static ResultSet infoPay() {
        ResultSet resSet = null;
        String select = "SELECT * FROM " + PAY_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
      } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        String arr = "";

        return resSet;

    }

    public static ResultSet infoAuto() {
        ResultSet resSet = null;
        String select = "SELECT * FROM " + AUTO_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        String arr = "";

        return resSet;

    }

    public static ResultSet infoUsers() {
        ResultSet resSet = null;
        String select = "SELECT * FROM " + USER_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        String arr = "";

        return resSet;

    }

    public static ResultSet info() {
        ResultSet resSet = null;
        String select = "SELECT * FROM " + TYPEVIOLATIONS_TABLE;

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        String arr = "";

        return resSet;

    }

    public static String fingRecord(String numberauto) throws SQLException {
        ResultSet resSet = null;

        String select = "SELECT * FROM " + VIOLATIONS_TABLE + " WHERE " + AUTO_NUMBER + "=?";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, numberauto);
            resSet = prSt.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String arr = "";
        while (resSet.next()) {
            String a =
                    resSet.getString("idviolations") + " " +
                            resSet.getString("numberauto") + " " +
                            resSet.getString("article") + " " +
                            resSet.getString("fine") + " " +
                            resSet.getString("violationdate");
            arr += a;
        }
        return arr;
    }

    public static String fingvio(String idviolations) throws SQLException {
        ResultSet resSet = null;

                String select = "SELECT * FROM " + VIOLATIONS_TABLE + " WHERE " + VIOLATIONS_ID + "=?";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, idviolations);
            resSet = prSt.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String arr = "";
        while (resSet.next()) {
            String a =
                    resSet.getString("idviolations") + " " +
                            resSet.getInt("fine");
            arr += a;
        }

        return arr;
    }

    public static boolean Redact(String idviolations) throws SQLException {
        ResultSet resSet = null;
        boolean result;
        int resSet1;
        String select = " ";
        String selectCheck = "SELECT * FROM " + VIOLATIONS_TABLE + " WHERE " + VIOLATIONS_ID + "=?";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(selectCheck);
            prSt.setString(1, idviolations);
            resSet = prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (resSet != null && resSet.next()) {
            select = "DELETE FROM " + VIOLATIONS_TABLE + " WHERE " + VIOLATIONS_ID + "=?";

            try {
                PreparedStatement prSt = getDbConnection().prepareStatement(select);
                prSt.setString(1, idviolations);
                resSet1 = prSt.executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}



