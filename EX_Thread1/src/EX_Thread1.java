
public class EX_Thread1 {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		DerivedThread d1 = new DerivedThread();
		DerivedThread d2 = new DerivedThread();
		
		d1.start();
		d2.start();
		
		System.out.println("���α׷� ����");
	}
}
