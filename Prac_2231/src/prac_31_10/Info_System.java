package prac_31_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Info_System {
	
	public Map <String,Bike> data(Map <String,Bike> Data)
	{
		Map <String,Bike> bikes_data=new HashMap<String , Bike>();
		 for (Map.Entry<String,Bike> entry : Data.entrySet()) {
	            bikes_data.put(entry.getKey(),entry.getValue());
	        }
		return bikes_data;
	}
	public Bike listByBrand(String brand)
	{
		
		List<String> numbers = Arrays.asList(brand);
		return (Bike) numbers;
	}
	
	public Bike listByPrice(boolean ans ,Integer price)
	{
		List<Integer> numbers = Arrays.asList(price);
		return (Bike) numbers;
			
		
		
	}
	
	public Bike filter_brand(String brand)
	{
	    
		return null;
		
	}

}
