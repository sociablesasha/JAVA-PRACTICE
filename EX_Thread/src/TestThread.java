public class TestThread {

	public static void main(String[] args) {
		TimerThread th = new TimerThread();
		th.start();
		try {
			Thread.sleep(1000 * 10);
		} catch(InterruptedException ee) {
			
		}
		th.interrupt();
	}
}
