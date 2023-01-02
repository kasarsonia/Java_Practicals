import java.util.ArrayList;
import java.util.List;

import utility.DataLoader;
import utility.DataWriter;
import vehicle.Vehicle;

public class clientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataLoader dlr = new DataLoader();
		
		List<Vehicle> list = new ArrayList<>();
		list = dlr.Load();
		
		DataWriter dwr = new DataWriter();
		dwr.writeData(list);
	}

}
