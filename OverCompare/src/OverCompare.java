class Person {
	String phone;
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public String getPhone(int i) {
		System.out.println("---Person:getPhone(int)");
		return phone;
	}
}

class Professor extends Person {
	public String getPhone(){
		return "Professor : " + super.getPhone();
	}
	public String getPhone(double d) {
		System.out.println("Professor : getPhone(d)");
		return phone;
	}
}

public class OverCompare {
	public static void main(String[] args) {
		Professor a = new Professor();
		a.setPhone("011-123-1234");
		System.out.println(a.getPhone());
		Person p = a;
		System.out.println(p.getPhone());
		p.getPhone(1);
		a.getPhone(2.0);
	}
}