package prac_31_10;

public class Bike {
	private String brand;
	String model;
	Integer price;
	double engine;
	Integer tyre_size;
	Boolean isAutomatic;
	String fuel;
	/*public Bike(String brand, String model, String price, double e, int tyre_size, String isAutomatic,String fuel) 
	{
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.engine = e;
		this.tyre_size = tyre_size;
		this.isAutomatic = isAutomatic;
		this.fuel = fuel;
	}*/
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getEngine() {
		return (int) engine;
	}
	public void setEngine(Integer engine) {
		this.engine = engine;
	}
	public Integer getTyre_size() {
		return tyre_size;
	}
	public void setTyre_size(Integer tyre_size) {
		this.tyre_size = tyre_size;
	}
	public String getIsAutomatic() {
		return isAutomatic;
	}
	public void setIsAutomatic(String isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
}
