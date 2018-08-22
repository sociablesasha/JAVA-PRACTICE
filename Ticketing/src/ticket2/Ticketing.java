package ticket2;

import java.util.Scanner;

public class Ticketing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Ticketing ticketing = new Ticketing();
		TicketArray[] ticketArray = new TicketArray[16];
		ticketArray[0] = new TicketArray("Regular", 20, 40);
		ticketArray[1] = new TicketArray("Regular", 20, 40);
		ticketArray[2] = new TicketArray("Regular", 20, 40);
		ticketArray[3] = new TicketArray("Walkup", 20, 50);
		ticketArray[4] = new TicketArray("Walkup", 20, 50);
		ticketArray[5] = new TicketArray("Advance", 20, 15);
		ticketArray[6] = new TicketArray("Advance", 20, 20);
		ticketArray[7] = new TicketArray("Advance", 20, 40);
		ticketArray[8] = new TicketArray("StudentAdvance", 20, (float) 7.5);
		ticketArray[9] = new TicketArray("StudentAdvance", 20, 10);
		ticketArray[10] = new TicketArray("StudentAdvance", 20, 20);
		ticketArray[11] = new TicketArray("Regular", 20, 40);
		ticketArray[12] = new TicketArray("Regular", 20, 40);
		ticketArray[13] = new TicketArray("Regular", 20, 40);
		ticketArray[14] = new TicketArray("Regular", 20, 40);
		ticketArray[15] = new TicketArray("Regular", 20, 40);
		
		int ticketNumber;
		int userInput;
		ticketNumber = 1;
		while (-1 != (userInput = ticketing.printStore(scanner, ticketArray))) {
			// TODO method
			switch (userInput) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				ticketArray[userInput].AddTicket(ticketNumber);
				break;
			case 5:
				ticketArray[userInput].AddTicket(ticketNumber, 30);
				break;
			case 6:
				ticketArray[userInput].AddTicket(ticketNumber, 15);
				break;
			case 7:
				ticketArray[userInput].AddTicket(ticketNumber, 3);
				break;
			case 8:
				ticketArray[userInput].AddTicket(ticketNumber, 30, ticketing.inputID(scanner));
				break;
			case 9:
				ticketArray[userInput].AddTicket(ticketNumber, 15, ticketing.inputID(scanner));
				break;
			case 10:
				ticketArray[userInput].AddTicket(ticketNumber, 3, ticketing.inputID(scanner));
				break;
			}
			ticketNumber++;
		}
		return;
	}

	public int printStore(Scanner scanner, TicketArray[] ticketArray) {
		int selectStore;

		System.out.println("\n<   Ticket Store   >");
		System.out.println("0   : Regular" + getTicketStock(ticketArray[0]));
		System.out.println("1   : Regular" + getTicketStock(ticketArray[1]));
		System.out.println("2   : Regular" + getTicketStock(ticketArray[2]));
		System.out.println("3   : Walkup" + getTicketStock(ticketArray[3]));
		System.out.println("4   : Walkup" + getTicketStock(ticketArray[4]));	
		System.out.println("5   : Advance(30DAYS)" + getTicketStock(ticketArray[5]));
		System.out.println("6   : Advance(15DAYS)" + getTicketStock(ticketArray[6]));
		System.out.println("7   : Advance(3DAYS)" + getTicketStock(ticketArray[7]));
		System.out.println("8   : StudentAdvance(30DAYS)" + getTicketStock(ticketArray[8]));
		System.out.println("9   : StudentAdvance(15DAYS)" + getTicketStock(ticketArray[9]));
		System.out.println("10  : StudentAdvance(3DAYS)" + getTicketStock(ticketArray[10]));
		System.out.println("11  : Regular" + getTicketStock(ticketArray[11]));
		System.out.println("12  : Regular" + getTicketStock(ticketArray[12]));
		System.out.println("13  : Regular" + getTicketStock(ticketArray[13]));
		System.out.println("14  : Regular" + getTicketStock(ticketArray[14]));
		System.out.println("15  : Regular" + getTicketStock(ticketArray[15]));
		System.out.println("98  : Calculator");
		System.out.println("99  : Print Customer List");
		System.out.println("-1  : Finish");
		System.out.print("Go  > ");
		try {
			selectStore = scanner.nextInt();
		} catch (Exception ee) {
			selectStore = -1;
		}

		if (99 == selectStore) {
			PrintList(ticketArray);
			return printStore(scanner, ticketArray);
		} else if (98 == selectStore) {
			Calculator(ticketArray);
			return printStore(scanner, ticketArray);
		} else if (-1 > selectStore || 15 < selectStore) {
			System.out.println("\n***Input Error!***\n");
			return printStore(scanner, ticketArray);
		} else {
			return selectStore;
		}
	}

	public String inputID (Scanner scanner) {
		System.out.print("\nStudent ID> ");
		String ID = scanner.next();
		return ID;
	}
	
	public String getTicketStock (TicketArray ticketArray) {
		int ticketStock = ticketArray.getTicketStock();
		return "[" + ticketStock + "EA]";
	}
	
	public void Calculator(TicketArray[] ticketArray) {
		System.out.println("\n<   Calculator   >\n");
		int totalProfit = 0;
		for (int ticketCnt = 0; ticketCnt < ticketArray.length; ticketCnt++) {
			 totalProfit += ticketArray[ticketCnt].getTicketProfit();
		}
		System.out.println("  Total Profit: " + totalProfit);
		System.out.println("\n< Calculator End >\n");
	}

	public void PrintList(TicketArray[] ticketArray) {
		// TODO Implementation
		System.out.println("\n<   Print Customer List   >\n");
		Ticket[] tickets;
		int ticketList;
		ticketList = 0;
		for (int ticketCnt = 0; ticketCnt < ticketArray.length; ticketCnt++) {
			 tickets = ticketArray[ticketCnt].getTickets();
			 for (int ticketInnerCnt = 0; ticketInnerCnt < tickets.length && null != tickets[ticketInnerCnt]; ticketInnerCnt++) {
				tickets[ticketInnerCnt].printTicket();
				ticketList++;
			 }
		}
		System.out.println("  Ticket List Size: " + ticketList);
		System.out.println("\n< Print Customer List End >\n");
	}
}
