import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyServer {
	public static void main(String[] args) {
		ServerSocket server_s = null;
		
		try {
			server_s = new ServerSocket(SocketConfig.PORT_NO);
			System.out.println(getTime() + "������ �غ�Ǿ����ϴ�.");
		} catch(IOException e) {
			//����뿡 ����
			e.printStackTrace();
		}
		
		while(true) {
			try {
				System.out.println(getTime() + "���� ��û�� ��ٸ��ϴ�.");
				Socket client = server_s.accept();
				System.out.println(getTime() + client.getInetAddress() + "�κ��� ���� ��û�� ���Խ��ϴ�.");
				OutputStream out = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("[Notice] Test Message from Server");
				System.out.println(getTime() + "�����͸� �����߽��ϴ�.");				
				
				InputStream in = client.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				System.out.println(getTime() + "Ŭ���̾�Ʈ�� ���� ���� �޼��� : " + dis.readUTF());
				
				dos.close();
				out.close();
				dis.close();
				in.close();
				
				System.out.println(getTime() + "������ �����մϴ�.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
