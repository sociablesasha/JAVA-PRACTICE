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
		setTitle("������ Ŭ���� �ܺο� �ִ� ù��° ������");
		setSize(300,300);
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
