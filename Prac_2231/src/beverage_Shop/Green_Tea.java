package beverage_Shop;

public class Green_Tea extends Tea {
	String BType;
	Integer volume;
	public Green_Tea(String bType,Integer vol)
	{
		super();
		this.volume= vol;
		this.BType = bType;
		System.out.println("Beverage is "+" "+this.BType+"of volume "+this.volume);
	}
	
}
