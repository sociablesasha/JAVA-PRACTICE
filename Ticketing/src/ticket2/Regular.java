package ticket2;

public class Regular extends Ticket {
	
	public Regular(int number) {
		super(number);
		this.price = 40;
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
		printStr += "  ----------------------\n";
		System.out.println(printStr);
	}

}
