package PA;

public class B extends A {
	void set() {
		def = 1;
		pro = 2;
		//pri = 3; private �� ���� Ŭ������ ��� ���Ѵ�.
		pub = 4;
	}
	public static  void main(String[] args){
		B b = new B();
		b.set();
	}

}
