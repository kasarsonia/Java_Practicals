package beverage_Shop;

import java.util.Scanner;

public class Shop_main {

	public static void main(String[] args) {
		

		Shop shop1 = new Shop("India");
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("----Menu----\n 1. Latte \n 2. Filter Coffee \n 3. Expresso \n 4. Capaccino \n 5. Lemon_Tea \n 6. Ice_Tea \n 7. Green_Tea \n");
		Beverage o1 = null;
		while(i==1)
		{
			System.out.println("Enter item: ");
			String item = sc.next();
			System.out.println("Enter num: ");
			int k = sc.nextInt();
			System.out.println("Enter volume: ");
			int vol = sc.nextInt();
			o1 = shop1.order(item, k,vol);
			System.out.println("Do you want order more items? 1/0 \n");
			i=sc.nextInt();
		}
		 o1.consumed();
	}

}
