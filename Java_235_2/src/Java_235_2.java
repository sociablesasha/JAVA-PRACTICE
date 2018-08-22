
public class Java_235_2 {
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1, 1, 2, 3);
		
		r.show();
		s.show();
		
		System.out.println(s.square());
		r.set(-2, -2, -1, 4);
		r.show();
		System.out.println(r.square());
		System.out.print("�� �簢���� ���̴�");
		if(r.equals(s))
			System.out.println(" �����ϴ�.");
		else
			System.out.println(" �ٸ��ϴ�.");
	}
}

class Rectangle{
	private int x1, y1, x2, y2;
	//������ �������̵�
	Rectangle(){}
	Rectangle(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	//set
	public void set(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	//show
	public void show(){
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		System.out.println("���� = " + (Math.abs(x1-x2) * Math.abs(y1-y2)));
	}
	//square
	public int square(){
		return (Math.abs(x1-x2) * Math.abs(y1-y2));
	}
	//equals
	public boolean equals(Rectangle temp){
		if(this.square() == temp.square()){
			return true;
		}
		else
			
			return false;
	}
}