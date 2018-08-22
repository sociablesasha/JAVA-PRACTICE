
public class Rectangle extends Shape{
	Rectangle(String name, double a, double b){
		this.a = a;
		this.b = b;
		this.name = name;
	}
	public void getArea(){
			this.area = a * b;
	}
	public void getCircumference(){
		this.circumference = 2 * (a + b);
	}
}
