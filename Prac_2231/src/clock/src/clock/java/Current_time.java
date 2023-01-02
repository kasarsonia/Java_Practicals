package clock.java;

public class Current_time 
{
	private int hours , minutes , sec;
	private int date , month , year;
	private char a;
	
Current_time(int h , int m , int s , char b , int d , int mo , int y)
{
	hours = h;
	minutes = m;
	sec = s;
	a = b;
	
	this.date = d;
	this.month = mo;
	this.year = y;
	System.out.println("Date: " + this.date + "/" + this.month + "/" + this.year);
	System.out.println("Time;: " + hours + ":" + minutes + ":" + sec + " " + a);
}

public void timeDateAfter(int h , int m , int s , char b , int d , int mo , int y)
{
	if ((h==12) && (m==59) && (s==59))
	{
		hours = 1 ;
		minutes = 0 ;
		sec = 0 ;
		a = b ;
		System.out.println("time after 1 sec = " + hours + ":" + minutes + ":" + sec + " " + a);
	}
	else
		if((h==11) && (m==59) && (s==59))
		{
				this.hours = ++h;
				this.minutes = 0;
				this.sec = 0;
				if(b=='P')
				{
					b = 'A';
					System.out.println("time after 1 sec: " + this.date + ":" + this.month + ":" + this.year + " " + a) ;
				}
				
		
				else 
					if((mo%2!=0) && (d==30))
					{
						this.date = ++d;
						this.month = mo;
						this.year = y;
						System.out.println("Next Date: " + this.date + "/" + this.month + "/" + this.year);
								
					}
					else if((mo%2!=0) && (d==31))
					{
						this.date = 1 ;
						this.month = ++mo;
						this.year = y;
						System.out.println("Next Date: " + this.date + "/" + this.month + "/" + this.year);
					}
					else if ((mo==2) && (d==28))
					{
						this.date = 1;
						this.month = +mo;
						this.year = y;
						System.out.println("Next Date: " + this.date + "/" + this.month + "/" + this.year);
					}
					else if((mo%2==0) && (d==30) && (mo!=2) && (mo!=12))
						{
							this.date = 1;
							this.month = ++mo;
							this.year = y;
							System.out.println("Next Date: " + this.date + "/" + this.month + "/" + this.year);
							
						}
						else
						{
							this.date = ++d;
							this.month = mo;
							this.year = y;
							System.out.println("Next Date: " + this.date + "/" + this.month + "/" + this.year);
						}
				if(b == 'A')
					{
						b = 'P';
						System.out.println("time after 1 sec: " + this.hours + ":" + this.minutes + ":" + this.sec + "noon");
						System.out.println("Next Date: " + this.date + "/" + this.month + "/" + this.year);
					}
				
				
	}
		else
			if((m==59) && (s==59))
			{
				hours = ++h;
				minutes = 0;
				sec = 0;
				System.out.println("time after 1 sec = " + hours + ":" + minutes + ":" + sec + " " + a);
			}
		else
			if(s==59)
			{
				hours = h ;
				minutes = ++m;
				sec = 0;
				System.out.println("time after 1 sec = " + hours + ":" + minutes + ":" + sec + " " + a);
			}
		else
		{
			hours = h ;
			minutes = m;
			sec = ++s;
			System.out.println("time after 1 sec = " + hours + ":" + minutes + ":" + sec + " " + a);
		}
	
}

}
