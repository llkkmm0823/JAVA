import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread{
	Socket socket;//main에서 전달해준 연결된 소켓을 받아서 저장, 활용될 통신 소켓
	DataOutputStream dos; // 생성자에서 객체가 만들어지고, run메서드에서 사용될 전송용 객체
	String name;
	Sender(Socket s){
		this.socket = s; //생성자에 전달된 연결소켓을 멤버변수로 저장
		try {
			OutputStream out = socket.getOutputStream();
			dos = new DataOutputStream(out);
			name = "["+socket.getInetAddress()+":"+socket.getPort() + "]"; // run에서 사용할 서버이름
			//run메서드에서 dos.writeUTF를 이용해서 name과 전송내용을 클라이언트에게 전송할 준비
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {//이 안에 뭔가 넣어놓으면 쓰레드가 모두 실행할것
		Scanner sc = new Scanner(System.in);
		while(dos != null) {//입력을 기다리고, 입력하면 클라이언트에 전송을 반복. dos가 소멸될 때까지 (->서버프로그램 종료 시)
			try {
				String message = sc.nextLine();
				dos.writeUTF(name + message);// 저장해둔 name(대화명)과 전송할 메세지를 전송
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	}
	
}
class Receiver extends Thread{
	Socket socket;
	DataInputStream dis;
	Receiver(Socket s){
		this.socket = s; //생성자에 전달된 연결소켓을 멤버변수로 저장
		try {
			InputStream in = socket.getInputStream();
			dis = new DataInputStream(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
	while(dis != null) { //메세지 받고 출력하기를 반복
		try {
			String message=dis.readUTF();
			System.out.println(message);
		} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}	
}

public class TcpIpClient031 {

	public static void main(String[] args) {
		ServerSocket sS = null;
		Socket s = null;
		try {
			sS = new ServerSocket(3333);
			System.out.println("서버가 준비되었습니다.");
			s=sS.accept();
			// 앞선 예제에서는 DataOutputStream / DataInputStream에 Socket을 사용하여 송수신
			// 그러나 본 예제는 s를 Sender와 Receiver의 생성자에 전달인수로 보내 현재 연결을 이용한 입력 출력을 양방향 자유롭게 가능하게 제작
			// 각 클래스는 Thread를 상속받아 동시실행이 가능하게 함
		Sender sender = new Sender(s);
		Receiver receiver = new Receiver(s);
		sender.start();
		receiver.start();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
