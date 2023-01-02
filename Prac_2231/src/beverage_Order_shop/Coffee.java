package beverage_Order_shop;

public class Coffee extends Beverage{
	private Integer Volume;
	private Integer CoffeePowder;
	public Coffee(Integer Vol)
	{
		super();
		this.Volume=Vol;
		System.out.println("Coffee : "+this.Volume);
	}
	public Integer getTeaPowder() {
		return CoffeePowder;
	}
	public void setTeaPowder(Integer coffeePowder) {
		this.CoffeePowder = coffeePowder;
	}
	/*public static Integer getVolume() {
		return Volume;
	}
	public void setVolume(Integer volume) {
		Volume = volume;
	}*/

}
