package banking;

public class BankAccount extends Account {
	public BankAccount(Startup bank) {
		super(bank.person, bank.password, bank.amount, bank.date);
		// TODO Auto-generated constructor stub
	}

	public void debit(Debit debitHistory) {
		if (this.person.equals(debitHistory.person) && this.password.equals(debitHistory.password)) {
			this.amount -= debitHistory.amount;
		}
	}

	public void credit(Credit creditHistory) {
		if (this.person.equals(creditHistory.person) && this.password.equals(creditHistory.password)) {
			this.amount += creditHistory.amount;
		}
	}
	
	public int getBalance() {
		return this.amount;
	}
}