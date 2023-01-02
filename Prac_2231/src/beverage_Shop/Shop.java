package beverage_Shop;


public class Shop {
	private String country;
	public Shop(String coun)
	{
		this.country=coun;
		System.out.println("Beverages Of "+this.country);
	}
	public Beverage order(String beverageType, int i , Integer vol)
	{
		String item = beverageType;
		Beverage b2 = null;
		switch(i)
		{
			case 1 :b2 =  new Latte(beverageType);
			 		break;
			 		
			case 2 :b2 = new Filter_Coffee(beverageType);
	 				break;
	 		
			case 3 : b2 =  new Expresso(beverageType);
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
		i=0;
		/*if(true)
		{
			System.out.println("Hello");
		}*/
		return b2;	
	}
	
	

}
