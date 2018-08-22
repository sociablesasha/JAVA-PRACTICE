
class Car{
	String carname;
	String colar = "Black";
	int velocity;
	void speedUp(){
		velocity += 5;
	}
	void speedDown(){
		velocity -= 5;
	}
}
 
class Truck extends Car{
	public int ton;
}
 
public class CarExtendTruckTest {
	public static void main(String[] args){
		Truck mytruck = new Truck();
		mytruck.carname = "Grander";
		mytruck.ton = 3;
		System.out.println("나의 트럭은 " + mytruck.colar + "이다.");
		System.out.println(mytruck.carname + "는 " + mytruck.ton + "톤을 실을 수 있다.");
	}
}
