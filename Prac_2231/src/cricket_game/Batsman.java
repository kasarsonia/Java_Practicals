package cricket_game;

public class Batsman extends Player{
	
	Integer century;
	
	Batsman(Integer jersyNo, String name , Integer cent) {
		super(jersyNo, name);
		this.century = cent;
	}

	void hit(Ball b , Bat bat)
	{
		System.out.println("doing batting");
	}
	
	void D1()
	{
		System.out.println("Batsman is "+this.Name+"who had made "+this.century+"centuries.");
	}
}
