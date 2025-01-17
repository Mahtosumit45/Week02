

//write your code here...
import java.util.Scanner;
public class BankAccountClass {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Account holder : ");
		String accountHolder = input.nextLine();
		System.out.println("Account Number : ");
		String accountNumber = input.nextLine();
		System.out.println("Account balance : ");
		double balance = input.nextDouble();
       System.out.println("Amount withdrawal : ");
       double withdrawalAmount = input.nextDouble();
		System.out.println("Amount deposited : ");
		double depositeAmount = input.nextDouble();
 		BankAccount bankAccount = new BankAccount(accountHolder,accountNumber,balance);
		bankAccount.withdrawal(withdrawalAmount);
		bankAccount.deposite(depositeAmount);
		bankAccount.Display();
		input.close();
	}
}

class BankAccount {
	private String accountHolder;
	private String accountNumber;
	private double balance;

	public BankAccount (String accountHolder, String accountNumber, double balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void withdrawal(double withdrawalAmount) {
		if(withdrawalAmount > balance){
			System.out.println("Insufficient balance, withdrawal failed");
		}
		else{
			balance -= withdrawalAmount;
			System.out.println("Amount withdrawal : " + withdrawalAmount);
		}	
	}
	public void deposite(double depositeAmount) {
		balance += depositeAmount;
		System.out.println("Amount deposited : " + depositeAmount);
	}
	public void Display(){
		System.out.println("Account holder : " + accountHolder);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account balance : " + balance);
	}
}