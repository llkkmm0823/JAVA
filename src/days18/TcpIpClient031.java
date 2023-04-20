import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread{
	Socket socket;//main���� �������� ����� ������ �޾Ƽ� ����, Ȱ��� ��� ����
	DataOutputStream dos; // �����ڿ��� ��ü�� ���������, run�޼��忡�� ���� ���ۿ� ��ü
	String name;
	Sender(Socket s){
		this.socket = s; //�����ڿ� ���޵� ��������� ��������� ����
		try {
			OutputStream out = socket.getOutputStream();
			dos = new DataOutputStream(out);
			name = "["+socket.getInetAddress()+":"+socket.getPort() + "]"; // run���� ����� �����̸�
			//run�޼��忡�� dos.writeUTF�� �̿��ؼ� name�� ���۳����� Ŭ���̾�Ʈ���� ������ �غ�
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {//�� �ȿ� ���� �־������ �����尡 ��� �����Ұ�
		Scanner sc = new Scanner(System.in);
		while(dos != null) {//�Է��� ��ٸ���, �Է��ϸ� Ŭ���̾�Ʈ�� ������ �ݺ�. dos�� �Ҹ�� ������ (->�������α׷� ���� ��)
			try {
				String message = sc.nextLine();
				dos.writeUTF(name + message);// �����ص� name(��ȭ��)�� ������ �޼����� ����
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
		this.socket = s; //�����ڿ� ���޵� ��������� ��������� ����
		try {
			InputStream in = socket.getInputStream();
			dis = new DataInputStream(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
	while(dis != null) { //�޼��� �ް� ����ϱ⸦ �ݺ�
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
			System.out.println("������ �غ�Ǿ����ϴ�.");
			s=sS.accept();
			// �ռ� ���������� DataOutputStream / DataInputStream�� Socket�� ����Ͽ� �ۼ���
			// �׷��� �� ������ s�� Sender�� Receiver�� �����ڿ� �����μ��� ���� ���� ������ �̿��� �Է� ����� ����� �����Ӱ� �����ϰ� ����
			// �� Ŭ������ Thread�� ��ӹ޾� ���ý����� �����ϰ� ��
		Sender sender = new Sender(s);
		Receiver receiver = new Receiver(s);
		sender.start();
		receiver.start();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
