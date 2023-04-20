package days18;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer01 {

	public static void main(String[] args) {
		
		// 서버와 클라이언트의 연결을 가능하게 해주는 클래스
		ServerSocket ss = null; // 참조변수 생성
		// 클라이언트의 요청이 오면 연결해주겠다는 뜻이 있는 클래스
		// 소켓 : 연결이 필요한

		
		
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		//클라이언트에게 보낼 현재 시각의 양식
		
	while(true) { 
	// 한명의 클라이언트만 접속 요청 수락 , 메세지 출력 후 끝나는 것이 아닌 포트 번호를 알고 있다면 계속 접속을 요청/access를 위해 while문 사용
		try {
			ss = new ServerSocket(3333); // 서버소켓의 객체 생성 & 접속 대기
			// 위 문장이 실행되면 서버가 클라이언트의 연결 요청을 대기, 수락할 준비가 완료된 상태
			// 7777 : 클라이언트가 접속요청하는 포트번호 
			// 포트번호를 알고 있는 클라이언트만 접속하게 할 수 있음
			// ㄴ 포트번호는 반드시 7777이 아니어도 됨, 자유롭게 설정가능
			System.out.println(f.format(new Date()) +"서버가 준비되었습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
		//서버 소켓은 준비 완료 이 후 클라이언트의 연결요청이 올 때까지 실행을 잠시 멈추고 계속 기다림
		System.out.println(f.format(new Date()) +"연결 요청을 기다립니다.");
		// 현 위치에서 접속이 있을 때까지 대기
		Socket s = ss.accept(); // 서버 소켓이 연결을 기다리다가 요청을 감지하면 accept()가 실행됨
		// accept()가 실행되고, 클라이언트 소켓과 통신할 새로운 통신용 소켓(s)을 연결정보와 함께 생성
		// 소켓이 요청받은 클라이언트 연결정보를 전달
		System.out.println(f.format(new Date()) +s.getInetAddress()+"로 부터 연결요청이 들어왔습니다");
		
		//s 소켓에서 연결된 클라이언트에게 보낼 메세지를 클라이언트로 출력해줄 출력 전송 스트림 객체를 생성
		OutputStream out = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out); // 최종 통신 출력 도구 :dos
		dos.writeUTF("[공지] 연결 성공~!! 204호 02번 서버에 접속되셨습니다.");
	
		System.out.println(f.format(new Date()) +" 메세지를 전송했습니다. ");
		dos.close();
		s.close();
		// 요청을 받기위해 생성한, 메세지 전달을 위해 생성한 객체들 모두 close 처리
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
//		try {
//			if(ss!=null)ss.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	}

}
