package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class participantsdao {
		
		//db connection
	
		String jdbcURL = "jdbc:mysql://localhost:3306/Zumba";
	    String username = "root";
	    String password = "Sameer1!";
	    private static Connection con;
	    
	    
	    try {
	        // Establishing the connection
	        con = DriverManager.getConnection(jdbcURL, username, password);
	        System.out.println("Connection established successfully!");

	    } catch (SQLException e) {
	        // Handling SQL exception
	        System.out.println("Error while connecting to the database.");
	        e.printStackTrace();
	    } finally {
	        // Closing the connection
	        if (con != null) {
	            try {
	                con.close();
	                System.out.println("Connection closed.");
	            } catch (SQLException e) {
	                System.out.println("Error while closing the connection.");
	                e.printStackTrace();
	            }
		
	}}}}
