import java.awt.Toolkit;

public class TimerThread extends Thread{
	int n = 0;
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
				toolkit.beep();
			}
			catch (InterruptedException ee) {
				return;
			}
		}
	}
}
