
	public class CheckingAccount extends Account {
		private double overdraftLimit;
		
		CheckingAccount(){
			super();
			overdraftLimit = 100;
		}
		CheckingAccount(int newId, double newBalance, double newAnnualInterestRate, double overdraftLimit){
			super(newId, newBalance, newAnnualInterestRate );
			this.overdraftLimit = overdraftLimit;
		}
		public double withdraw(double amount) {
			if (amount < (overdraftLimit + balance)) {
				setBalance(balance - amount);
				return(balance - amount);
			}
			else {
				return balance;
			}
		}
		
		public void setOverdraftLimit(double overdraftLimit) {
			this.overdraftLimit = overdraftLimit;
		}
		
		public double getOverdraftLimit() {
			return overdraftLimit;
		}
		
		public String toString() {
			return super.toString() + " CheckingAccount: overdraft limit is " + overdraftLimit;
		}
		
	}
