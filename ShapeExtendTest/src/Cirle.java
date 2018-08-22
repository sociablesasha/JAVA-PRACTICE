
public class Cirle extends Shape{
	Cirle(String name, double a, double b){
		this.a = a;
		this.b = b;
		this.name = name;
	}
	public void getArea(){
		this.area = PI * a * b;
	}
	public void getCircumference(){
		this.circumference = PI * (a + b);
	}
}
