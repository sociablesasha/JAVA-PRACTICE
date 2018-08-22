import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyClient {
	public static void main(String[] args) {
		try {
			System.out.println(getTime() + "������ ���� ���Դϴ�. ���� IP : " + SocketConfig.SERVER_IP);
			Socket client = new Socket(SocketConfig.SERVER_IP, SocketConfig.PORT_NO);
			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String message = dis.readUTF();
			System.out.println(getTime() + "������ ���� ���� �޼��� : " + message);
			
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(message);
			System.out.println(getTime() + "�����͸� �����߽��ϴ�.");	
			
			dis.close();
			is.close();
			dos.close();
			os.close();
			
			System.out.println(getTime() + "������ �����մϴ�.");
		} catch (ConnectException e) {
			e.printStackTrace();
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
