
public class Triangle extends Shape{
	double c;
	Triangle(String name, double a, double b){
		this.a = a;
		this.b = b;
		this.name = name;
		c = Math.sqrt((a * a) + (b * b));
	}
	public void getArea(){
		this.area = (a * b) / 2;
	}
	public void getCircumference(){
		this.circumference = 2 * c + a;
	}
}
