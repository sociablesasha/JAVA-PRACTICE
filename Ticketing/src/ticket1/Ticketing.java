package ticket1;

public class Ticketing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket[] tickets;		
		tickets = new Ticket[20];
		
		int totalProfit;
		totalProfit = 0;
		
		// TODO Data-reset
		tickets[0] = new Regular(1);
		tickets[1] = new Regular(2);
		tickets[2] = new Regular(3);
		tickets[3] = new Walkup(4);
		tickets[4] = new Walkup(5);
		tickets[5] = new Advance(6, 30);
		tickets[6] = new Advance(7, 15);
		tickets[7] = new Advance(8, 3);
		tickets[8] = new StudentAdvance(9, 30, "Yonghyun");
		tickets[9] = new StudentAdvance(10, 15, "Daehan");
		tickets[10] = new StudentAdvance(11, 3, "SeongRyun");
		tickets[11] = new Regular(12);
		tickets[12] = new Regular(13);
		tickets[13] = new Regular(14);
		tickets[14] = new Regular(15);
		tickets[15] = new Regular(16);

		// Print and Calculate
		System.out.println("<   Ticket  List   >\n");
		for (int ticketCnt = 0; ticketCnt < tickets.length && null != tickets[ticketCnt]; ticketCnt++) {
			totalProfit += tickets[ticketCnt].getPrice();
			tickets[ticketCnt].printTicket();
		}
		
		System.out.println("<Total Profit: $" + totalProfit + ">");
	}

}
