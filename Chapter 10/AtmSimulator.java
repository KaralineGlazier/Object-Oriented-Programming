import java.util.Scanner;
import java.util.Date;
public class AtmSimulator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Account[] account = new Account[10];
		initialBalance(account);
		while (true) {
			System.out.println("Enter account user id: ");
			int userId = input.nextInt();
			
			if (validID(userId) == true ) {
				int choice = 0;
				while (true) {
					menu();
					choice = input.nextInt();
					if (choice == 1) {
						System.out.println(account[userId].balance);
					} 
					else if (choice == 2) {
						System.out.println("Enter an amount to withdraw: ");
						double withdrawAmount = input.nextDouble();
						account[userId].withdraw(withdrawAmount);
						continue;
					}
					else if (choice == 3) {
						System.out.println("Enter an amount to deposit: ");
						double depositAmount = input.nextDouble();
						account[userId].deposit(depositAmount);
						continue;
						
					}
					else if (choice == 4) {
						break;
					}
		
					else {
						System.out.println("Invalid choice. Choose a valid choice: ");
						continue;
					}
					
				}
				continue;
			}
			else {
				System.out.println("Invalid ID. Enter a correct ID. ");
			}
		}
	}
	public static void menu(){
		Scanner input = new Scanner(System.in);
		System.out.println(" Main Menu  ");
		System.out.println("1: Check Balance");
		System.out.println("2: Withdraw");
		System.out.println("3: Deposit");
		System.out.println("4: Exit");
		System.out.println("Enter a choice: ");
		
	}
	public static boolean validID(int userId) {
		if (userId >= 0 || userId <= 9){
			return true;
		}
		else {
			return false;
		}
	}
	public static void initialBalance(Account[] account) {
		for (int i = 0; i < account.length; i++) {
			account[i] = new Account(i, 100);
		}
	}
}
	class Account {
		int id = 0;
		double balance = 0;
		Date dateCreated = new Date();
		Account(){
			
		}
		Account(int newId, double newBalance){
			id = newId;
			balance = newBalance;
		}
		void setId(int newId){
			id = newId;
		}
		void setBalance(double newBalance){
			balance = newBalance;
		}
		void setDateCreated(Date newDateCreated){
			dateCreated = newDateCreated;
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