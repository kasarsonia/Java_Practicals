package beverage_Shop;

public abstract class Coffee extends Beverage{
	private Integer volume;
	private Integer coffeePowder;
	public Coffee(Integer Vol)
	{
		super();
		this.volume=Vol;
		System.out.println("Coffee : "+this.volume);
	}
	public Integer getTeaPowder() {
		return coffeePowder;
	}
	public void setTeaPowder(Integer coffeePowder) {
		this.coffeePowder = coffeePowder;
	}
	/*public static Integer getVolume() {
		return Volume;
	}
	public void setVolume(Integer volume) {
		Volume = volume;
	}*/

}
