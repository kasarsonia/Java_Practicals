package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import vehicle.Vehicle;

public class DB_sqlite {
	public void database(List<Vehicle> Veh) throws Exception
	{
		String url = " ";
		Connection conn = null;
		try
		{
			conn = DriverManager.getConnection(url);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		Statement stat = conn.createStatement();
		
		stat.executeUpdate("drop table if exists database;");
	}
}
