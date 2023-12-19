import java.util.Date;
import java.sql.*;

public class TestAccount {
	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000, 4.5);
		System.out.println("The new account balance is $" + account1.withdraw(2500));
		System.out.println("The new account balance is $" + account1.deposit(3000));
		System.out.println("The monthly interest is $" + account1.getMonthlyInterest());
		System.out.print("Account Created on: " + account1.dateCreated);
	}
}
class Account {
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
	Date dateCreated = new Date();
	Account(){
		
	}
	Account(int newId, double newBalance, double newAnnualInterestRate){
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	void setId(int newId){
		id = newId;
	}
	void setBalance(double newBalance){
		balance = newBalance;
	}
	void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	void setDateCreated(Date newDateCreated){
		dateCreated = newDateCreated;
	}
	double getMonthlyInterestRate(){
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	double getMonthlyInterest(){
		return (balance * getMonthlyInterestRate()) / 100;
	}
	double withdraw(double amount){
		balance = balance - amount;
		return balance;
	}
	double deposit(double amount){
		balance += amount;
		return balance;
	}
}