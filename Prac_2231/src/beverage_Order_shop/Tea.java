package beverage_Order_shop;

public class Tea extends Beverage {
	private Integer TeaPowder;
	private Integer Volume;
	public Tea(Integer Vol)
	{
		super();
		this.Volume = Vol;
		System.out.println("Tea : "+this.Volume);
	}
	public Integer getTeaPowder() {
		return TeaPowder;
	}
	public void setTeaPowder(Integer teaPowder) {
		this.TeaPowder = teaPowder;
	}
	/*public static Integer getVolume() {
		return Volume;
	}
	public void setVolume(Integer volume) {
		Volume = volume;
	}*/

}
