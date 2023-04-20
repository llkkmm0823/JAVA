package days18;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpServer03 {

	public static void main(String[] args) {

		String serverip ="192.168.0.93";
		
		try {
			Socket s = new Socket(serverip,3333);
			System.out.println("서버가 준비되었습니다");
			
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s);
			sender.start();
			receiver.start();
	
	}catch ( UnknownHostException e ) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}		
}
}