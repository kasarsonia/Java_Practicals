package beverage_Shop;

public class Expresso extends Coffee {
	String BType;
	public Expresso(String bType)
	{
		super(null);
		this.BType = bType;
		System.out.println("Beverage is "+this.BType);
	}
}
