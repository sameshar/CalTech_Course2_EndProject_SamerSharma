package resource;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBResource {
	static String jdbcURL = "jdbc:mysql://localhost:3306/Zumba";
    static String username = "root";
    static String password = "Sameer1!";
    
    static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con= DriverManager.getConnection(jdbcURL,username,password);
		}catch(Exception e) {
			System.err.println(e);
		}
	}
	public static Connection getDbConnection() {
		try {
			return con;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

}

