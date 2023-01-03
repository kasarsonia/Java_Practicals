package prac2_class;

public class student {
	String s_name = "Gandhar";
	String course = "MCA";
	Integer s_rollno = 2251;
	
	public void display(String date) {
		System.out.println(" Name of student: "+s_name+"\nStudent RollNo: "+s_rollno+"\nCourse Name: "+course);
		System.out.println("Admission closses on: " +date);
	}

}

