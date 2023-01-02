package beverage_Shop;

public class Filter_Coffee extends Coffee{
	String BType;
	public Filter_Coffee(String bType)
	{
		super(null);
		this.BType = bType;
		System.out.println("Beverage is "+this.BType);
	}
	
}
