package PB;
import PA.A;

public class B extends A {
	void set() {
		//def = 1; ���� Ŭ�������� ��� ����.
		pro = 2;
		//pri = 3; private �� ���� Ŭ������ ��� ����.
		pub = 4;
	}
	public static  void main(String[] args){
		B b = new B();
		b.set();
	}

}
