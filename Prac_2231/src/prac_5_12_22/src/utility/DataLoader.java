package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vehicle.Vehicle;

public class DataLoader {
	Scanner s;
	File infile;
	List<Vehicle> Veh = new ArrayList<>();
	String records;
	
	public List<Vehicle> Load()
	{
		infile = new File("input.txt");
		
		try
		{
			s=new Scanner(infile);
			while(s.hasNextLine())
			{
				String lines=s.nextLine();
				
				System.out.println("#"+lines);
				System.out.println("INPUT\n");
				
				String records[]= lines.split(",");
				Veh.add(new Vehicle(records[0],records[1]));
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.print("OUTPUT\n");
			for(Vehicle vehi : Veh)
			{
				System.out.println("Brand: "+vehi.getBrand()+"Model : "+ vehi.getModel());
			}
		}
		return Veh;
	}
}
