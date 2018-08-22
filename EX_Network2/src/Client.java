import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			System.out.println("Connecting to Server IP : " + SocketConfig.SERVER_IP);
			Socket client = new Socket(SocketConfig.SERVER_IP, SocketConfig.PORT_NO);
			
			OutputStream out = null;
			DataOutputStream dos = null;
			InputStream in = null;
			DataInputStream dis = null;
			try {
				out = client.getOutputStream();
				dos = new DataOutputStream(out);
				in =  client.getInputStream();
				dis = new DataInputStream(in);
				
				System.out.println("Connceting Succesful");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			String str;
			
			while(true) {
				try {
					str = MyUtil.readFromSTDIN("Server");
					dos.writeUTF(str);
					str = dis.readUTF();
					MyUtil.writeToSTDOUT("Server ", str);
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
			client.close();
		} catch (ConnectException e) {
			e.printStackTrace();
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}

