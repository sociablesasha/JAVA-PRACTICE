abstract class MyPoint {
	int x;
	int y;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	protected abstract void move(int x, int y);
	protected abstract void reverse();
	protected void show() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class MyColorPoint extends MyPoint {
	String Color;
	
	public MyColorPoint(int x, int y) {
		super(x, y);
	}
	public MyColorPoint(int x, int y, String Color) {
		super(x, y);
		this.Color = Color;
	}
	protected void move(int x, int y) {
		super.x = x;
		super.y = y;
	}
	protected void reverse() {
		int temp = super.x;
		super.x = super.y;
		super.y = temp;
	}
	protected void show() {
		System.out.println(Color);
		System.out.println("(" + x + "," + y + ")");
	}
}
public class Java_304_5 {
	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2, 3, "Black");
		p.move(3, 4);
		p.reverse();
		p.show();
	}
}
