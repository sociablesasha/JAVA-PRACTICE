import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {
		try {
			System.out.println("서버에 연결 중입니다. 서버 IP : " + SocketConfig.SERVER_IP);
			Socket client = new Socket(SocketConfig.SERVER_IP, SocketConfig.PORT_NO);
			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println("서버로 부터 받은 메세지 : " + dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
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
