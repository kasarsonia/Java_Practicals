package beverage_Shop;

public class Capaccino extends Coffee {
	String BType;
	public Capaccino(String bType)
	{
		super(1);
		this.BType = bType;
		System.out.println("Beverage is "+this.BType);
	}

}
