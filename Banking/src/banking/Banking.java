package banking;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Banking {
	public static void main(String args[]) {
		Banking banking = new Banking();
		ArrayList<Account> bankAccounts = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		banking.banking(scanner, bankAccounts);
	}

	public void banking(Scanner scanner, ArrayList<Account> bankAccounts) {
		// Recursion Function
		int select = 0;
		System.out.println("\n<   Ticket Store   >");
		System.out.println("1   : Startup");
		System.out.println("2   : Startup(MinMax)");
		System.out.println("3   : Credit");
		System.out.println("4   : Dedit");
		System.out.println("5   : Check Balance");
		System.out.println("6   : Check Min and Max");
		System.out.println("99  : Finish");
		System.out.print("Go  > ");
		if (scanner.hasNextInt()) {
			select = scanner.nextInt();
		} else {
			select = 99;
			System.out.println("\n***Input Error***\n");
		}

		switch (select) {
		case 99:
			System.out.print("&& Program Finish &&");
			return;
		case 1:
			doStartup(scanner, bankAccounts);
			break;
		case 2:
			doStartupMinMax(scanner, bankAccounts);
			break;
		case 3:
			doCredit(scanner, bankAccounts);
			break;
		case 4:
			doDedit(scanner, bankAccounts);
			break;
		case 5:
			showBalance(scanner, bankAccounts);
			break;
		case 6:
			showMinMax(scanner, bankAccounts);
			break;
		default:
			System.out.println("\n***Input Error***\n");
			break;
		}
		banking(scanner, bankAccounts);
	}

	private void doStartup(Scanner scanner, ArrayList<Account> bankAccounts) {
		// TODO Auto-generated method stub
		System.out.println("\n\n  ******************************");
		System.out.println("              JOIN\n");
		System.out.print("  ID > ");
		String person = scanner.next();
		System.out.print("  Password > ");
		String password = scanner.next();
		int deposit = 0;
		try {
			System.out.print("  Deposit > ");
			deposit = scanner.nextInt();
		} catch (Exception ee) {
			System.out.println("\n***Input Error***\n");
			return;
		}
		
		boolean result = false;
		Account bankAccount;
		Iterator<Account> bankIT = bankAccounts.iterator();
		while (bankIT.hasNext()) {
			bankAccount = bankIT.next();
			if (bankAccount.person.equals(person)) {
				result = true;
				break;
			}
		}

		if (result) {
			System.out.println("  Fail!");
		} else {
			System.out.println("  Success!");
			bankAccount = new BankAccount(new Startup(person, password, deposit, getDate()));
			bankAccounts.add(bankAccount);
		}

		System.out.println("  ******************************\n");
		return;
	}

	private void doStartupMinMax(Scanner scanner, ArrayList<Account> bankAccounts) {
		// TODO Auto-generated method stub
		System.out.println("\n\n  ******************************");
		System.out.println("              JOIN\n");
		System.out.print("  ID > ");
		String person = scanner.next();
		System.out.print("  Password > ");
		String password = scanner.next();
		int deposit = 0;
		int max = 0, min = 0;
		try {
			System.out.print("  Deposit > ");
			deposit = scanner.nextInt();
			System.out.print("  Min > ");
			min = scanner.nextInt();
			System.out.print("  Max > ");
			max = scanner.nextInt();
		} catch (Exception ee) {
			System.out.println("\n***Input Error***\n");
			return;
		}
		
		boolean result = false;
		BankAccount bankAccount;
		Iterator<Account> bankIT = bankAccounts.iterator();
		while (bankIT.hasNext()) {
			bankAccount = (BankAccount) bankIT.next();
			if (bankAccount.person.equals(person)) {
				result = true;
				break;
			}
		}
		
		if (min <= deposit && deposit <= max) {
			result = false;
		}

		if (result) {
			System.out.println("  Fail!");
		} else {
			System.out.println("  Success!");
			bankAccount = new MinMaxAccount(new Startup(person, password, deposit, getDate()), min, max);
			bankAccounts.add(bankAccount);
		}

		System.out.println("  ******************************\n");
		return;
	}
	
	private void doCredit(Scanner scanner, ArrayList<Account> bankAccounts) {
		// FIXME Consider MinMax
		System.out.println("\n\n  ******************************");
		System.out.println("              Credit\n");
		System.out.print("  ID > ");
		String person = scanner.next();
		System.out.print("  Password > ");
		String password = scanner.next();
		int deposit = 0;
		try {
			System.out.print("  Amount(Add) > ");
			deposit = scanner.nextInt();
		} catch (Exception ee) {
			System.out.println("\n***Input Error***\n");
			return;
		}

		boolean result = false;
		BankAccount bankAccount;
		Iterator<Account> bankIT = bankAccounts.iterator();
		while (bankIT.hasNext()) {
			bankAccount = (BankAccount) bankIT.next();
			if (bankAccount.person.equals(person)) {
				bankAccount.credit(new Credit(person, password, deposit, getDate()));
				result = true;
				break;
			}
		}

		if (result) {
			System.out.println("  Success!");
		} else {
			System.out.println("  Fail!");
		}
		System.out.println("  ******************************\n");
		return;
	}

	private void doDedit(Scanner scanner, ArrayList<Account> bankAccounts) {
		// FIXME Consider MinMax
		System.out.println("\n\n  ******************************");
		System.out.println("              Dedit\n");
		System.out.print("  ID > ");
		String person = scanner.next();
		System.out.print("  Password > ");
		String password = scanner.next();
		int deposit = 0;
		try {
			System.out.print("  Amount(Substract) > ");
			deposit = scanner.nextInt();
		} catch (Exception ee) {
			System.out.println("\n***Input Error***\n");
			return;
		}

		boolean result = false;
		BankAccount bankAccount;
		Iterator<Account> bankIT = bankAccounts.iterator();
		while (bankIT.hasNext()) {
			bankAccount = (BankAccount) bankIT.next();
			if (bankAccount.person.equals(person)) {
				bankAccount.debit(new Debit(person, password, deposit, getDate()));
				result = true;
				break;
			}
		}

		if (result) {
			System.out.println("  Success!");
		} else {
			System.out.println("  Fail!");
		}
		System.out.println("  ******************************\n");
		return;
	}

	private void showBalance(Scanner scanner, ArrayList<Account> bankAccounts) {
		// TODO Auto-generated method stub
		System.out.println("\n\n  ******************************");
		System.out.println("           Show Balance\n");
		System.out.print("  ID > ");
		String person = scanner.next();
		System.out.print("  Password > ");
		String password = scanner.next();
		
		boolean result = false;
		int balance = 0;
		BankAccount bankAccount;
		Iterator<Account> bankIT = bankAccounts.iterator();
		while (bankIT.hasNext()) {
			bankAccount = (BankAccount) bankIT.next();
			if (bankAccount.person.equals(person) && bankAccount.password.equals(password)) {
				balance = bankAccount.getBalance();
				result = true;
				break;
			}
		}
		
		if (result) {
			System.out.println("  Balance > " + balance);
		} else {
			System.out.println("  Fail!");
		}
		System.out.println("  ******************************\n");
		return;
	}
	
	private void showMinMax(Scanner scanner, ArrayList<Account> bankAccounts) {
		// TODO Auto-generated method stub
		System.out.println("\n\n  ******************************");
		System.out.println("           Show Balance\n");
		System.out.print("  ID > ");
			String person = scanner.next();
			System.out.print("  Password > ");
		String password = scanner.next();
		
		boolean result = false;
		int min = 0, max = 0;
		MinMaxAccount bankAccount;
		Iterator<Account> bankIT = bankAccounts.iterator();
		while (bankIT.hasNext()) {
			try {
				bankAccount = (MinMaxAccount) bankIT.next();
				if (bankAccount.person.equals(person) && bankAccount.password.equals(password)) {
					min = bankAccount.getMin();
					max = bankAccount.getMax();
					result = true;
					break;
				}
			} catch (Exception ee) {
				result = false;
			}
		}
		
		if (result) {
			System.out.println("  Min > " + min);
			System.out.println("  Max > " + max);
		} else {
			System.out.println("  This is not MinMaxAccount!");
		}
		System.out.println("  ******************************\n");
		return;
	}
	
	private String getDate() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.format(date);
	}
}
