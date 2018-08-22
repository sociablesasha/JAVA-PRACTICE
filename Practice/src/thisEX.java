
public class thisEX {
	int id;
	public thisEX(int x) {
		this.id = x;
	}
	public thisEX() {
		this(0);
		System.out.println("»ý¼º");
		//this(0);
	}
	
	public static void main(String[] args) {
		thisEX th = new thisEX();
	}
}
