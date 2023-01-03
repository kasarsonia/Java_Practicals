package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
	//create connection return it
	private connect connect() {  
        // SQLite connection string  
		String url = "jdbc:sqlite:/home/soniakasar/Desktop/database/DATABASE.db";  
        connect conn = null;  
        try {  
            conn = (connect) DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
	
	//insert
	 public void insert(String name, double capacity) {  
	        String sql = "INSERT INTO employees(name, capacity) VALUES(?,?)";  
	   
	        try{  
	            connect conn = this.connect();  
	            PreparedStatement pstmt = ((Connection) conn).prepareStatement(sql);  
	            pstmt.setString(1, name);  
	            pstmt.setDouble(2, capacity);  
	            pstmt.executeUpdate();  
	        } 
	        catch (SQLException e) 
	        {  
	            System.out.println(e.getMessage());  
	        }  
	 }
}
