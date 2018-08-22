package ticket2;

public class Advance extends Regular {
	protected int period;
	
	public Advance(int number, int period) {
		super(number);
		if (19 < period) {
			this.price = 15;
		} else if (20 > period && 10 < period) {
			this.price = 20;
		} else {
			this.price = 40;
		}
		this.period = period;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printTicket() {
		// TODO Auto-generated method stub
		String printStr = null;
		printStr = "  --------Ticket--------\n";
		printStr += "    Type: " + this.getClass().getSimpleName() + "\n";
		printStr += "    Number: " + this.number + "\n";
		printStr += "    Price: $" + this.getPrice() + "\n";
		printStr += "    Period: " + this.period + "\n";
		printStr += "  ----------------------\n";
		System.out.println(printStr);
	}
	
}
