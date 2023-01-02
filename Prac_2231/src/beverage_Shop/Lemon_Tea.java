package beverage_Shop;

public class Lemon_Tea extends Tea {
	String BType;
	Integer volume;
	public Lemon_Tea(String bType,Integer vol)
	{
		super();
		this.volume= vol;
		this.BType = bType;
		System.out.println("Beverage is "+" "+this.BType+"of volume "+this.volume);
	}
	

}
