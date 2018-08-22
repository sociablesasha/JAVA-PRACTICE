
public class ShapeExtendTest {
	public static void main(String[] args){
		Cirle cirle = new Cirle("cirle", 3, 3); 
		Triangle triangle = new Triangle("triangle", 3, 3);
		Rectangle rectangle = new Rectangle("rectangle", 3, 3);

		cirle.getArea();
		cirle.getCircumference();
		cirle.Print();

		rectangle.getArea();
		rectangle.getCircumference();
		rectangle.Print();

		triangle.getArea();
		triangle.getCircumference();
		triangle.Print();
	}
}
