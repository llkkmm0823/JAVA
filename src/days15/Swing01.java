package days15;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;

// 윈도우 프로그래밍에 필요한 윈도우 구성요소를 보유한 클래스(JFrame)를 상속받아 추가 기능 탑재 형식의 개발을 진행
class ButtonTest extends JFrame{
	
	// 생성자에서 최초화면을 구성
	ButtonTest(){
		
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		// 생성자에 입력된 텍스트를 한 가운데 표시한 버튼을 생성
		// 생성만 했으므로 화면에 배치하거나 보여주는 단계는 아직 아님 
		// 버튼 또는 그 외 컨트롤들은 윈도우에 배치되고 위치를 잡아 올라가고 윈도우가 화면에 보여질 때 같이 표시됨

		
		// 라벨, 이름표, 명찰등의 역할을 하는 안내문구 표시용 텍스 도구
		JLabel label = new JLabel ("당신의 성별은?");
		
		// 윈도우 위에 생성된 컨트롤 객체를 올려놓을 수 있게 해주는 객체를 준비
		Container con = getContentPane(); // 윈도우에 올라갈 컨트롤들을 담을 받침대 정도의 객체
		
		con.setLayout (new FlowLayout()); // 컨트롤들의 배치방식을 설정
		// FlowLayout() : 올라가는 순서대로 일직선상에 배치하는 레이아웃
		
		//컨테이너에 생성된 컨트롤을 순서에 맞춰 올려놓으면 화면에 표시될 준비가 완료됨
		con.add(label);
		con.add(male);
		con.add(female);
		
		setTitle( "버튼테스트"); // 윈도우의 좌측 상단에 표시될 타이틀의 내용 설정
		setSize(300,200); // 윈도우 크기 설정 : 단위(픽셀)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 현재 윈도우 종료 시 프로그램까지 종료하는 것으로 설정
		
		setVisible(true); //화면에 윈도우를 출현시키는 메서드, 보통 가장 마지막에 표시
		
	}
	// 화면에 표시하는 명령을 맨 마지막에 실행하는 형식
}
public class Swing01 {

	public static void main(String[] args) {
		new ButtonTest();

	} // 대부분 실행할 때는 만들어져 있는 클래스 혹은 인터페이스를 끌어와서 실행시킴. 다 만들어져 있는 경우가 다반사
}
