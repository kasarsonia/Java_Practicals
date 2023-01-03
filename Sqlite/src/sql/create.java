package sql;

import java.sql.Connection;  
import java.sql.DatabaseMetaData;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.Statement;

public class create {	  
	    public static void createNewDatabase(String fileName) {  
	   
	        String url = "jdbc:sqlite:/home/soniakasar/Desktop/database/DATABASE.db"; 
	   
	        try {  
	            Connection conn = DriverManager.getConnection(url);  
	            if (conn != null) {  
	                DatabaseMetaData meta = conn.getMetaData();  
	                System.out.println("The driver name is " + meta.getDriverName());  
	                System.out.println("A new database has been created.");  
	            }  
	   
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        }  
	    } 
	    
	    //create table
	    public static void createTable()
	    {
	    	String url = "jdbc:sqlite:/home/soniakasar/Desktop/database/DATABASE.db";
	    	
	    	String sql = "CREATE TABLE IF NOT EXISTS employees (\n"  
	                + " id integer PRIMARY KEY,\n"  
	                + " name text NOT NULL,\n"  
	                + " capacity real\n"  
	                + ");";  
	          
	        try{  
	            Connection conn = DriverManager.getConnection(url);  
	            Statement stmt = conn.createStatement();  
	            stmt.execute(sql);  
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        } 
	        System.out.println("create table...");
	    }   
}
