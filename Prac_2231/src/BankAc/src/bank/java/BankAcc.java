package bank.java;

import java.util.Scanner;

public class BankAcc
{
	int balance;
	int AcNo;
	
BankAcc(int bal, int d) 
{
	balance = bal;
	AcNo = d;
}
public void deposit(int amount)
{
	balance = balance + amount;
	System.out.println("Balance: " +balance);
}

public void withdraw(int amount)
{
	balance = balance - amount;
	System.out.println("Balance: "+ balance);	
}

public int getBalance()
{
	return balance;
}

public void transfer(int amount)
{
	if (amount > balance)
		{
			System.out.println();
			System.out.println("Error: Insufficient balance");
			
		}
	else
	{
		balance = balance - amount;
		deposit(amount);
	}
}	
}