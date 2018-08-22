import javax.swing.*;

public class EX_JFrame {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		try {
			Thread.sleep(1000 * 5);
		} catch(InterruptedException ee) {}
	}
}

class MyFrame extends JFrame {
	MyFrame() {
		setTitle("메인이 클래스 외부에 있는 첫번째 프레임");
		setSize(300,300);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
