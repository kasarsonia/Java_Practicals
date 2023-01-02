package clock.java;

import java.util.Scanner;

public class Clock_Start {



	public static void main(String[] args) {

		Scanner r = new Scanner(System.in);

		System.out.println("Enter time");

		System.out.println("hours ");

		int h = r.nextInt();

		System.out.println("minutes ");

		int m = r.nextInt();

		System.out.println("second ");

		int s = r.nextInt();

		System.out.println("AM = A or PM = P ");

		char x = r.next().charAt(0);

		System.out.println("Enter Date");

		System.out.println("Day ");

		int d = r.nextInt();

		System.out.println("Month");

		int mo = r.nextInt();

		System.out.println("Year");

		int y = r.nextInt();

		Current_time C = new Current_time(h , m , s , x , d , mo , y);

		C.timeDateAfter(h , m , s , x , d , mo , y);



	}



}

