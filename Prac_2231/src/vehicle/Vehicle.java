package vehicle;

public class Vehicle {
	private String brand;
	private String model;
	
	public Vehicle(String brand,String model)
	{
		super();
		this.setBrand(brand);
		this.setModel(model);
	}

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

}
