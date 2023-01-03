package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import vehicle.Vehicle;

public class DataWriter {
	FileWriter write;
	File out_file;
	
	public void writeData(List<Vehicle> Veh)
	{
		try 
		{
			write = new FileWriter("output.txt");
			
			List<Vehicle> list = new ArrayList<>();
			list = Veh;
			System.out.println(list.size());
			for(Vehicle vehi:Veh)
			{
				try {
					write.write("Brand - "+vehi.getBrand()+"\tModel - "+vehi.getModel()+"\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			write.close();
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
