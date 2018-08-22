class DObject {
	public DObject next;
	
	public DObject() {
		next = null;
	}
	public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends DObject {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends DObject {
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverringEX {
	public static void main(String[] args) {
		DObject obj = new DObject();
		Line line = new Line();
		DObject p = new Line();
		DObject r = new Line();
		// 메소드 오버라이딩 -> 동적 바인딩 -> 출력
		obj.draw();
		line.draw();
		p.draw();
		r.draw();

		DObject rect = new Rect();
		DObject circle = new Circle();
		
		rect.draw();
		circle.draw();
	}
}
