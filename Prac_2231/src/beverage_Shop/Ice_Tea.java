package beverage_Shop;

public class Ice_Tea extends Tea {
	String BType;
	Integer volume;
	public Ice_Tea(String bType,Integer vol)
	{
		super();
		this.volume= vol;
		this.BType = bType;
		System.out.println("Beverage is "+" "+this.BType +"of volume "+this.volume);
	}
	
}
