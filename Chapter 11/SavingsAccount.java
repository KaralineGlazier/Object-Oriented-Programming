
	public class SavingsAccount extends Account {
		SavingsAccount() {
			super();
		}
		SavingsAccount(int newId, double newBalance, double newAnnualInterestRate) {
			super(newId, newBalance, newAnnualInterestRate);
		}
		
		public double withdraw(double amount) {
			if (amount < balance ) {
				setBalance(balance - amount);
				return balance - amount;
			}
			else {
				return balance;
			}
		}
		
	}	

