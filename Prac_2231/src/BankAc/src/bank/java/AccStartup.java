package bank.java;
import java.util.Scanner;
public class AccStartup
{

	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter your account number");
		int an = a.nextInt();
		System.out.println("Enter amount you to deposit");
		int amt = a.nextInt();
		BankAcc S = new BankAcc(10000 , an);
		S.deposit(amt);
		int j = S.getBalance();
		//System.out.println("balance: ");
		System.out.println("Enter amount you want to withdraw");
		int w = a.nextInt();
		S.withdraw(w);
		//System.out.println("Balance after withdrawing; ");
		int y = S.getBalance();
		//System.out.println("Balance after transfer; ");
		S.transfer(y);
		//System.out.println(S.getBalance());
		
	}

}
