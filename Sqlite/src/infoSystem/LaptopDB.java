package laptopdatasystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LaptopDB {
	
	private Map<String, Laptop> laptops;
	
	public LaptopDB() {
		super();
		this.laptops = new HashMap<>();
	}
	
	public List<Laptop> listAllLaptops() {
		return new ArrayList<Laptop>(this.laptops.values());
	}
	
	public List<Laptop> listLaptopsByBrandName(String brandName) {
		List<Laptop> searchList = new ArrayList<>();
		for(Laptop l : this.laptops.values())
			if(l.getBrandName().equals(brandName))
				searchList.add(l);
		return searchList;
	}
	
	public List<Laptop> listLaptopsByPrice(Boolean isLessThan, Integer sellingPrice) {
		List<Laptop> searchList = new ArrayList<>();
		for(Laptop l : this.laptops.values()) {
			if((isLessThan && l.getSellingPrice() < sellingPrice) ||
					(!isLessThan && l.getSellingPrice() >= sellingPrice))
				searchList.add(l);
		}
		return searchList;
	}
	
	public List<Laptop> filterLaptopsByDisplaySize(Integer displaySize) {
		List<Laptop> searchList = new ArrayList<>();
		for(Laptop l : this.laptops.values())
			if(l.getDisplaySize() == displaySize)
				searchList.add(l);
		return searchList;
	}
	
	public List<Laptop> filterLaptopsByMinStorageCapacityNeeded(Integer storageCapacity) {
		List<Laptop> searchList = new ArrayList<>();
		for(Laptop l : this.laptops.values())
			if(l.getStorageCapacity() >= storageCapacity)
				searchList.add(l);
		return searchList;
	}
	
	public List<Laptop> filterLaptopsByIsSSD(Boolean searchIsSSD) {
		List<Laptop> searchList = new ArrayList<>();
		for(Laptop l : this.laptops.values())
			if((searchIsSSD && l.getIsSSD()) ||
					(!searchIsSSD && !l.getIsSSD()))
				searchList.add(l);
		return searchList;
	}
	
	public List<Laptop> filterLaptopsByOperatingSystem(OperatingSystem operatingSystem) {
		List<Laptop> searchList = new ArrayList<>();
		for(Laptop l : this.laptops.values())
			if(l.getOperatingSystem().equals(operatingSystem))
				searchList.add(l);
		return searchList;
	}
	
	// getters & setters
	public Map<String, Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(Map<String, Laptop> laptops) {
		this.laptops = laptops;
	}
	
}
