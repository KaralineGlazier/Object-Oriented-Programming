
	import java.util.Date;

	public class Account {
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
		double getBalance() {
			return balance;
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
		public String toString() {
			return "The account id is: " + id + ", the account balance is " + balance + ", the annual interest rate is " + annualInterestRate + ", and the account was created on " + dateCreated;
		}
	}
