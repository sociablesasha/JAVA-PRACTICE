class Person {
}

class Student extends Person {
}

class Researcher extends Person {
}

class Professor extends Researcher {
}

public class EX_instanceof {
	public static void main(String[] args){
		Person jee= new Student();
		Person kim = new Professor();
		Person lee = new Researcher();
	
		if(jee instanceof Student)
			System.out.println("jee는 Student 타입");
		if(jee instanceof Professor)
			System.out.println("jee는 Professor 타입");
		if(jee instanceof Researcher)
			System.out.println("jee는 Researcher 타입");
		
		if(kim instanceof Student)
			System.out.println("kim는 Student 타입");
		if(kim instanceof Professor)
			System.out.println("kim는 Professor 타입");
		if(kim instanceof Researcher)
			System.out.println("kim는 Researcher 타입");
		
		if(lee instanceof Student)
			System.out.println("lee는 Student 타입");
		if(lee instanceof Professor)
			System.out.println("lee는 Professor 타입");
		if(lee instanceof Researcher)
			System.out.println("lee는 Researcher 타입");
	}
}
