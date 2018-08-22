import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {
		try {
			System.out.println("������ ���� ���Դϴ�. ���� IP : " + SocketConfig.SERVER_IP);
			Socket client = new Socket(SocketConfig.SERVER_IP, SocketConfig.PORT_NO);
			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println("������ ���� ���� �޼��� : " + dis.readUTF());
			System.out.println("������ �����մϴ�.");
			
			dis.close();
			is.close();
		} catch (ConnectException e) {
			e.printStackTrace();
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
