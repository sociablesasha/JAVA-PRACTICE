package banking;

public class MinMaxAccount extends BankAccount {
	private int min;
	private int max;

	public MinMaxAccount(Startup bank, int min, int max) {
		super(bank);
		this.min = min;
		this.max = max;
		// TODO Auto-generated constructor stub
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}
