class Point{
	int x, y;
	void set(int x, int y){
		this.x = x;
		this.y = y;
	}
	void showPoint(){
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColarPoint extends Point{
	String colar;
	void setColar(String colar){
		this.colar = colar;
	}
	void showColarPoint(){
		System.out.println(colar);
		showPoint();
	}

}

public class ColarPointTest {
	public static void main(String[] args){
		ColarPoint cp = new ColarPoint();
		cp.set(3, 4);
		cp.setColar("red");
		cp.showColarPoint();
	}
}
