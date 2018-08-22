package ticket1;

public abstract class Ticket {
	protected int number;
	protected float price;
	
	public Ticket(int number) {
		this.number = number;
	}

	public float getPrice() {
		return this.price;
	}

	public abstract void printTicket();
}
