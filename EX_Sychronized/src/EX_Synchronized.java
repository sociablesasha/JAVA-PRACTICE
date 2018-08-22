public class EX_Synchronized {
	public static void main(String[] args) {
		SyncObject obj = new SyncObject();
		Thread th1 = new Synchronized_EX("kitae", obj);
		Thread th2 = new Synchronized_EX("hyoson", obj);
		th1.start();
		th2.start();
	}
}

class Synchronized_EX extends Thread {
	SyncObject sObj;
	Synchronized_EX(String name, SyncObject sObj) {
		super(name);
		this.sObj = sObj;
	}
	
	public void run() {
		int i = 0;
		while(i < 100000) {
			sObj.add();
			i++;
		}
		String name = Thread.currentThread().getName();
		System.out.println(name + ":" +sObj.getSum());
	}
}

class SyncObject {
	int sum = 0;
	synchronized void add() {
		int n = sum;
		n += 10;
		sum = n;
	}
	int getSum() { return sum;}
}