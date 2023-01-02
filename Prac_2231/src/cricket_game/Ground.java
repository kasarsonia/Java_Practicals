package cricket_game;

public class Ground 
{
	Umpire umpire;
	Boundary boundary;
	Crease crease;
	
	Ground(Umpire U , Boundary B , Crease c)
	{
		this.boundary=B;
		this.crease=c;
		this.umpire=U;
	}
	
	void D8()
	{
		System.out.println("Boundary : "+boundary.len);
		System.out.println("Coach : "+);
		System.out.println("Manager : "+);
	}
}
