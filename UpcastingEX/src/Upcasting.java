class Person {
	String name;
	String id;
	
	public Person(String name){
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}

public class Upcasting {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("¿Ã¿ÁπÆ");
	}
}
