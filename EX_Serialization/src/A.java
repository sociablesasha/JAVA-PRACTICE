import java.io.Serializable;

public class A implements Serializable{
	static final long serialVersionID = 1;
	int field1;
	B field2 = new B();
	static int field3;
}

class B {
	int field1;
}