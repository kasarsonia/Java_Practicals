package beverage_Order_shop;

public class Ice_Tea extends Tea {
	String BType;
	public Ice_Tea(String bType)
	{
		super(1);
		this.BType = bType;
		System.out.println("Beverage is "+" "+this.BType);
	}
	
}
