package cricket_game;

public class Crease {
	Bails bails;
	Stumps stumps;
	Wicket wicket;
	
	Crease(Bails b , Stumps s , Wicket w)
	{
		this.bails=b;
		this.stumps=s;
		this.wicket=w;
				
	}
	void D6()
	{
		System.out.println("No of Bails in cricket : "+bails.No_bails);
		System.out.println("No of stumps in cricket : "+stumps.No_stumps);
		System.out.println("No of wickets : "+wicket.No_wicket);
		
	}
}
