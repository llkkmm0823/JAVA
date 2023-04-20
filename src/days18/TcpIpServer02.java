package days18;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer02 {

	public static void main(String[] args) {
		
		ServerSocket ss = null;
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		
		try {
			ss=new ServerSocket(3333);
		System.out.println(f.format(new Date()) +"서버가 준비되었습니다.");
	}catch (IOException e) {
		e.printStackTrace();
		return;
	}
	
		while(true) {
			try {
				System.out.println(f.format(new Date())+"연결 요청을 기다립니다.");
				ss.setSoTimeout(15000); // 15초
				//서버소켓이 클라이언트 요청을 기다리는 시간 설정
				//설정된 시간이 지날 때까지 요청이 없으면SocketTimeoutException 예외가 발생
				Socket s = ss.accept();
				System.out.println(f.format(new Date())+" "+s.getInetAddress()+"이(가) 연결요청하였습니다");
				OutputStream out = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out); 
				dos.writeUTF("[연결완료] 204호 02번 서버에 접속되셨습니다.");
				System.out.println(f.format(new Date()) +" 데이터를 전송했습니다. ");
				dos.close();
				s.close();
			}catch (SocketTimeoutException e) {
				System.out.println(f.format(new Date()) + "접속시간 초과. 서버를 종료합니다");
				System.exit(0); // return대신 사용할 수 있는 프로그램 종료명령
				}catch (IOException e) {
					e.printStackTrace();
			}
		}
}
}
