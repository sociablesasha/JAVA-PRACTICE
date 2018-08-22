package banking;

public class Account {
	protected String person;
	protected String password;
	protected int amount;
	protected String date;

	public Account(String person, String password, int amount, String date) {
		this.person = person;
		this.password = password;
		this.amount = amount;
		this.date = date;
	}
}
