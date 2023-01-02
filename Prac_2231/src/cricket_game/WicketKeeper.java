package cricket_game;

public class WicketKeeper extends Player {
	
	Integer numberOfCatches;
    Integer numberOfStumpings;
	
	WicketKeeper(Integer jersyNo, String name,Integer numOfCatches,Integer numOfStumping) {
		super(jersyNo, name);
		this.numberOfCatches=numOfCatches;
		this.numberOfStumpings=numOfStumping;
	}

	void WK_Catch(Ball b)
	{
		
	}
	void D3()
    {    
        super.print();
        System.out.print(" He also keeps the wickets and has " +this.numberOfCatches + " catches and " +this.numberOfStumpings + " stumpings in his account.");
    }

}
