package cricket_game;

public class Player 
{
	Integer JersyNo;
	String Name;
	
	Player(Integer jersyNo,String name)
	{
		this.JersyNo=jersyNo;
		this.Name=name;
	}
	void print()
	{
		System.out.println("Player with JersyNo "+this.JersyNo+ " is :"+this.Name);
	}
}
