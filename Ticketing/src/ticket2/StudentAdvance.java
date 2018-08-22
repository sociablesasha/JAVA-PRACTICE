package ticket2;

public class StudentAdvance extends Advance {
	protected String ID;

	public StudentAdvance(int number, int period, String ID) {
		super(number, period);
		if (19 < period) {
			this.price = (float) 7.5;
		} else if (20 > period && 10 < period) {
			this.price = 10;
		} else {
			this.price = 20;
		}
		this.ID = ID;
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
		printStr += "    ID: $" + this.ID + "\n";
		printStr += "----------------------\n";
		System.out.println(printStr);
	}

}
