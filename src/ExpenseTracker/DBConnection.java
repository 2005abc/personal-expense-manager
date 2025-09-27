package ExpenseTracker;

import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/expense_tracker";
       String user = System.getenv("DB_USER");   
       String pass = System.getenv("DB_PASS");  

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
