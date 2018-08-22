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
			System.out.println(getTime() + "서버가 준비되었습니다.");
		} catch(IOException e) {
			//디버깅에 적합
			e.printStackTrace();
		}
		
		while(true) {
			try {
				System.out.println(getTime() + "연결 요청을 기다립니다.");
				Socket client = server_s.accept();
				System.out.println(getTime() + client.getInetAddress() + "로부터 연결 요청이 들어왔습니다.");
				OutputStream out = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("[Notice] Test Message from Server");
				System.out.println(getTime() + "데이터를 전송했습니다.");				
				
				InputStream in = client.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				System.out.println(getTime() + "클라이언트로 부터 받은 메세지 : " + dis.readUTF());
				
				dos.close();
				out.close();
				dis.close();
				in.close();
				
				System.out.println(getTime() + "연결을 종료합니다.");
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
