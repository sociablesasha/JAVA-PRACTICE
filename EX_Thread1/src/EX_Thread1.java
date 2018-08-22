
public class EX_Thread1 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		DerivedThread d1 = new DerivedThread();
		DerivedThread d2 = new DerivedThread();
		
		d1.start();
		d2.start();
		
		System.out.println("프로그램 종료");
	}
}
