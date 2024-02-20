package devmaster.edu.vn.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/lab4";
        String username = "root";
        String password = "";
        return DriverManager.getConnection(url, username, password);
    }
    
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Connection conn = getConnection();
        System.out.println("connection " + conn);
        System.out.println("done");
    }
}

