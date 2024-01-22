
		public class TestAccounts {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Account account = new Account(1, 500, 4.5);
				SavingsAccount account1 = new SavingsAccount(2, 5000, 4.5);
				CheckingAccount account2 = new CheckingAccount(3, 1000, 4.5, 100);
				
				account.withdraw(100);
				account1.withdraw(200);
				account2.withdraw(200);
				
				account.deposit(500);
				account1.deposit(600);
				account2.deposit(600);
				
				System.out.println(account.toString());
				System.out.println(account1.toString());
				System.out.println(account2.toString());
				
			}

		}
