import java.util.Scanner;

public class Java_111_1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char alphabet = sc.nextLine().charAt(0);
		
		if('A' <= alphabet && alphabet <= 'Z') {
			System.out.println((char)(alphabet + 32));
		}
		else if('a' <= alphabet && alphabet <= 'z') {
			System.out.println((char)(alphabet - 32));
		}
		else
			System.out.println("영문자가 아닙니다.");
	}
}
