import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyUtil {
	public static String readFromSTDIN(String target) {
		System.out.println("[" + target + "�� ���� �޼����� �Է��ϼ���.]");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		return str;
	}
	public static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
	public static void writeToSTDOUT(String from, String msg) {
		System.out.println(getTime() + from + msg);
	}
}
