package util;
import java.sql.*;

public class DBConnection {
    private static final String url = "jdbc:mysql://localhost:3306/banking_system";
    private static final String user = "root";          // change to your MySQL username
    private static final String password = "Gnapika@0804";  // change to your MySQL password

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}