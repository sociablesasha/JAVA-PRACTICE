import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		int time;
		int hour;
		int min;
		int sec;
		Scanner sc = new Scanner(System.in);
		
		time = sc.nextInt();
		hour = (time / 60) / 60;
		min = (time / 60) % 60;
		sec = time % 60;
		
		System.out.println(hour + ":" + min + ":" + sec);
		}
}
