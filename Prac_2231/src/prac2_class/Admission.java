package prac2_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Admission {


	public static void main(String[] args) {
	
		Date date = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
		String stringDate = DateFor.format(date);
		System.out.print(stringDate+"\n");
		String d = "15/9/2022";
		student s = new student();
		s.display(d);
		//student b = new student();
	}
}
