package cricket_game;

public class Umpire {
	Integer No_Matches;
	String Name;
	Umpire(Integer matches,String n)
	{
		this.No_Matches=matches;
		this.Name=n;
	}
	void D7()
	{
		System.out.println("Umpire is "+this.Name+"who had played "+this.No_Matches+"matches.");
	}
}
