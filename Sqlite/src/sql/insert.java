package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
	//create connection return it
	private Connection connect() {  
        // SQLite connection string  
		String url = "jdbc:sqlite:/home/soniakasar/Desktop/database/DATABASE.db";  
		Connection conn = null;  
        try {  
            conn = (Connection) DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
	
	//insert
	 public void insert(String name, double capacity) {  
	        String sql = "INSERT INTO employees(name, capacity) VALUES(?,?)";  
	   
	        try{  
	            Connection conn = this.connect();  
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
