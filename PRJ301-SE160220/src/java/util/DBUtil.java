package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static final String DB = "Wish";
    public static final String USER_NAME = "sa";
    public static final String PASSWORD = "12345";
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
         Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + DB;
        conn = DriverManager.getConnection(url, USER_NAME, PASSWORD);
        return conn;
    }
}
