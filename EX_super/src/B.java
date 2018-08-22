
class B extends A {
	public B(){
		System.out.println("생성자B");
	}
	public B(int x){
		super(x); //무조건 첫 라인
		System.out.println("매개변수생성자B");
	}
}
