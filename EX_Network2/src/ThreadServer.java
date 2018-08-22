import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ThreadServer {
	ServerSocket serverSocket = null;
//	public static HashMap<String, MyReceiver> clients = new HashMap<String, MyReceiver>();
	
	public ThreadServer() {
		try {
			serverSocket = new ServerSocket(SocketConfig.PORT_NO);
			MyUtil.writeToSTDOUT("" ," 서버가 준비되었습니다.\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				MyUtil.writeToSTDOUT("", " 연결 요청을 기다립니다.\n");
				Socket socket = serverSocket.accept();
				MyReceiver client = new MyReceiver(socket);
		//		clients.put(client.getPeerName(), client);
				client.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyReceiver extends Thread {
	Socket socket = null;
	String name = "";
	
	public MyReceiver (Socket s) {
		socket = s;
		name = s.getInetAddress().toString();
	}
	public String getPeerName() {
		return this.name;
	}
	
//	Iterator it = ThreadServer.clients.keySet().iterator();
//	MyReceiver temp = null;
	
	public void run() {
		OutputStream out = null;
		DataOutputStream dos = null;
		InputStream in = null;
		DataInputStream dis = null;
		
		System.out.println("\n\n" + socket.getInetAddress() + "로 부터 연결 요청이 들어왔습니다.");
		
		
		try {
			out = socket.getOutputStream();
			dos = new DataOutputStream(out);
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			System.out.println("Connecting Succesful");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		while(true) {
			try {
				String str = dis.readUTF();
				MyUtil.writeToSTDOUT("[From " + this.name + "] ", str);
				//str = MyUtil.readFromSTDIN("Client");
				//dos.writeUTF(str);
				//while(it.hasNext()) {
				//	dos.writeUTF(str);
				//}
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
		try {
			dos.close();
			dis.close();
			in.close();
			out.close();
		} catch(Exception ee) {
			ee.printStackTrace();
		}
	}
}