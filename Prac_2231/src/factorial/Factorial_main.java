package factorial;

public class Factorial_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int num=3;
		Factorial F = new Factorial();
		fact=F.factorial(num);
		System.out.println("Factorial of "+num+" is : "+fact);
	}

}
