package beverage_Order_shop;

import java.util.ArrayList;

public class Shop {
	private String country;
	public Shop(String coun)
	{
		this.country=coun;
		System.out.println("Beverages Of "+this.country);
	}
	public ArrayList<Beverage> order(String beverageType , int i , int vol)
	{
		Beverage listBeverage[] = {
				new Coffee(1),
				new Tea(1)
		};
		
		ArrayList<Beverage> tasklist = new ArrayList<Beverage>();
	
		switch(i)
		{
			case 1 : tasklist.add(new Latte(beverageType));
			 		break;
			 		
			case 2 :tasklist.add(new Lemon_Tea(beverageType,null));
	 				break;
	 		
			case 3 :tasklist.add(new Ice_Tea(beverageType, null));
	 				break;
	 		
			case 4 :b2 =  new Capaccino(beverageType);
	 				break;
	 		
			case 5 :b2 =  new Lemon_Tea(beverageType,vol);
	 				break;
	 		
			case 6 :b2 =  new Ice_Tea(beverageType,vol);
	 				break;
	 		
			case 7 :b2 =  new Green_Tea(beverageType,vol);
	 				break;
	 		
		}
		
	
		
		
		return tasklist;	
	}
	
	

}
