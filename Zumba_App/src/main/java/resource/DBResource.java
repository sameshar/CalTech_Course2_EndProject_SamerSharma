package resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBResource {
	static String jdbcURL = "jdbc:mysql://localhost:3306/Zumba";
    static String username = "root";
    static String password = "Sameer1!";
    
    static Connection connection = null;
    
    static {
    	try {
        // Establishing the connection
        connection = DriverManager.getConnection(jdbcURL, username, password);
        System.out.println("Connection established successfully!");

    } catch (SQLException e) {
        // Handling SQL exception
        System.out.println("Error while connecting to the database.");
        e.printStackTrace();
    } finally {
        // Closing the connection
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                System.out.println("Error while closing the connection.");
                e.printStackTrace();
            }
	}
        	}
    	}
    public static Connection getDBConnection() {
    	try {
			return connection;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
    }
}

