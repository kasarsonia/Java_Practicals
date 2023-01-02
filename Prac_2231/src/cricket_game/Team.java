package cricket_game;

public class Team {
	Player  player;//aggregation
	Coach coach;
	Manager manager;
	
	Team (Player  p , Coach c, Manager m)
	{
		this.coach=c;
		this.manager=m;
		this.player=p;
	}
	void D5()
	{
		System.out.println("Player : "+player.Name);
		System.out.println("Coach : "+coach.Name);
		System.out.println("Manager : "+manager.Name);
		
	}

}
