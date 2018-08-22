abstract class DObject {
	public DObject next;
	
	public DObject() { next = null; }
	abstract public void draw();
}

class Line extends DObject {
	public void  draw() {
		System.out.println("Line");
	}
}

class Rect extends DObject {
	public void  draw() {
		System.out.println("Rect");
	}
}

class Circle extends DObject {
	public void  draw() {
		System.out.println("Circle");
	}
}

public class EX_abstract {
	public static void main(String[] args) {
		Line line = new Line();
		line.draw();
	}
}
