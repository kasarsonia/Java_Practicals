package cricket_game;

public class Bowler extends Player{
	Integer NoOfWickets;
	String Brand;
	Bowler(Integer jersyNo, String name,Integer No_Wickets, String B) {
		super(jersyNo, name);
		this.NoOfWickets = No_Wickets;
		this.Brand=B;
	}

	void Throw(Ball b) 
	{
		System.out.println("Ball is thrown by bowler");
	}
	void D2()
	{
		System.out.println("Bowler is "+this.Name+" who had "+this.NoOfWickets+" wickets.");
		System.out.println("BAll brand is : "+this.Brand);
	}

}
