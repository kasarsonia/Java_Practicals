package prac2_class;

public class Computer 
{
	String name="DESKTOP-DK4S1EG";
	String rAM = "8.00 GB";
	Integer type = 64; 
	Integer volume = 100;
	
	public void display(String Apps)
	{
		System.out.println("Name of Computer: "+name+"\nRam:"+rAM+"\nType: "+type);
		System.out.println("Apps using is : "+Apps);
	}
	
	public void volume()
	{
		System.out.println("Full volume you can increase is : "+volume);
	}

}
