package beverage_Order_shop;

public class Lemon_Tea extends Tea {
	String BType;
	public Lemon_Tea(String bType)
	{
		super(null);
		this.BType = bType;
		System.out.println("Beverage is "+" "+this.BType);
	}
	

}
