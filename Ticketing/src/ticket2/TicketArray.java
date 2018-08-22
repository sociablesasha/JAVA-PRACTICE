package ticket2;

public class TicketArray {
	private String ticketType;
	private int ticketStock;
	private int ticketSale;
	private float ticketPrice;
	private Ticket[] tickets;

	public TicketArray (String ticketType, int ticketStock, float ticketPrice) {
		if (0 < ticketStock) {
			this.ticketType = ticketType;
			this.ticketStock = ticketStock;
			this.ticketPrice = ticketPrice;
			this.ticketSale = 0;
			if (("Regular").equals(ticketType)) {
				tickets = new Regular[ticketStock];
			} else if (("Walkup").equals(ticketType)) {
				tickets = new Walkup[ticketStock];
			} else if (("Advance").equals(ticketType)) {
				tickets = new Advance[ticketStock];
			} else if (("StudentAdvance").equals(ticketType)) {
				tickets = new StudentAdvance[ticketStock];
			} else {
				System.out.println("\n***TicketType Error!***\n");
			}	
		} else {
			System.out.println("\n***TicketStock Error!***\n");
		}
	}
	
	public void AddTicket (int ticketNumber) {
		if (ticketSale < ticketStock) {
			if (("Regular").equals(ticketType)) {
				tickets[ticketSale++] = new Regular(ticketNumber);
			} else if (("Walkup").equals(ticketType)) {
				tickets[ticketSale++] = new Walkup(ticketNumber);
			} else {
				System.out.println("\n***TicketType Error!***\n");
			}	
		} else {
			System.out.println("\n***All Sold!***");
		}
	}
	
	public void AddTicket (int ticketNumber, int ticketPeriod) {
		if (ticketSale < ticketStock) {
			if (("Advance").equals(ticketType)) {
				tickets[ticketSale++] = new Advance(ticketNumber, ticketPeriod);
			} else {
				System.out.println("\n***TicketType Error!***\n");
			}	
		} else {
			System.out.println("\n***All Sold!***");
		}
	}
	
	public void AddTicket (int ticketNumber, int ticketPeriod, String ID) {
		if (ticketSale < ticketStock) {
			if (("StudentAdvance").equals(ticketType)) {
				tickets[ticketSale++] = new StudentAdvance(ticketNumber, ticketPeriod, ID);
			} else {
				System.out.println("\n***TicketType Error!***\n");
			}	
		} else {
			System.out.println("\n***All Sold!***");
		}
	}
	
	public Ticket[] getTickets () {
		return tickets;
	}

	public float getTicketProfit () {
		return ticketSale * ticketPrice;
	}
	
	public int getTicketStock () {
		return ticketStock - ticketSale;
	}
}
