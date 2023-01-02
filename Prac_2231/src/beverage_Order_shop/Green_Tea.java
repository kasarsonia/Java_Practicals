package beverage_Order_shop;

public class Green_Tea extends Tea {
	String BType;
	public Green_Tea(String bType)
	{
		super(1);
		this.BType = bType;
		System.out.println("Beverage is "+" "+this.BType);
	}
	
}
