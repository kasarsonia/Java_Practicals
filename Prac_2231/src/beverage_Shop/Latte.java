package beverage_Shop;

public class Latte extends Coffee {
	String BType;
	public Latte(String bType)
	{
		super(null);
		//super(getVolume());
		this.BType = bType;
		//System.out.println("Beverage is "+this.getVolume()+" "+this.BType);
		System.out.println("Beverage is "+this.BType);
	}
}
