import java.util.HashMap;
import java.util.List;
import java.util.Map;

import infoSystem.Laptop;
import infoSystem.LaptopDB;
import infoSystem.OperatingSystem;

public class ClientApp_info {

	public static void main(String[] args) {
		Map<String, Laptop> laptops = new HashMap<String, Laptop>() {
			{
				put("LENOVO_ThinkPad-E14", new Laptop("LENOVO", "ThinkPad-E14", 60000, 14, 500, true, OperatingSystem.WindowsOS));
				put("DELL_XPS-12", new Laptop("DELL", "XPS-12", 80000, 12, 256, true, OperatingSystem.WindowsOS));
				put("APPLE_Macbook-Pro", new Laptop("APPLE", "Macbook-Pro-13", 120000, 13, 256, true, OperatingSystem.MacOS));
				put("DELL_Vostro-14", new Laptop("DELL", "Vostro-14", 48000, 14, 1000, false, OperatingSystem.LinuxOS));
				put("LENOVO_Ideapad-330S", new Laptop("LENOVO", "Ideapad-330S", 45000, 15, 1000, false, OperatingSystem.LinuxOS));
				put("DELL_Inspiron-15", new Laptop("DELL", "Inspiron-15", 38000, 15, 1000, false, OperatingSystem.WindowsOS));
			}
		};
		
		LaptopDB system = new LaptopDB();
		system.setLaptops(laptops);
		
		System.out.println("** LIST ALL LAPTOPS **");
		printListLaptop(system.listAllLaptops());
		
		System.out.println("** LIST LAPTOPS BY BRAND = DELL **");
		printListLaptop(system.listLaptopsByBrandName("DELL"));
		
		System.out.println("** LIST LAPTOPS BY SELLING-PRICE < 50,000 **");
		printListLaptop(system.listLaptopsByPrice(true, 50000));
		
		System.out.println("** LIST LAPTOPS BY SELLING-PRICE > 50,000 **");
		printListLaptop(system.listLaptopsByPrice(false, 50000));
		
		System.out.println("** FILTER LAPTOPS BY DISPLAY-SIZE = 14 **");
		printListLaptop(system.filterLaptopsByDisplaySize(14));
		
		System.out.println("** FILTER LAPTOPS BY STORAGE-CAPACITY > 320 **");
		printListLaptop(system.filterLaptopsByMinStorageCapacityNeeded(320));
		
		System.out.println("** FILTER LAPTOPS IF SSD **");
		printListLaptop(system.filterLaptopsByIsSSD(true));
		
		System.out.println("** FILTER LAPTOPS WITH OS = WINDOWS **");
		printListLaptop(system.filterLaptopsByOperatingSystem(OperatingSystem.WindowsOS));
	}
		
	
	public static void printListLaptop(List<Laptop> listing) {
		for(Laptop item : listing)
			System.out.println(item.getBrandName() + " | " + item.getModelName());
		System.out.println("    ###...###    ");
	}
	
}

