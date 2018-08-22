package PA;

public class B extends A {
	void set() {
		def = 1;
		pro = 2;
		//pri = 3; private 는 서브 클래스라도 사용 못한다.
		pub = 4;
	}
	public static  void main(String[] args){
		B b = new B();
		b.set();
	}

}
