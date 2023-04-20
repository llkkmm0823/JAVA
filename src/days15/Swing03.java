package days15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonEvent extends JFrame implements ActionListener{//상속은 한 번에 하나 밖에 안되기 때문에 implements(인터페이스형식)사용
	//1. ActionListener를 implements 함
	//2. 적용할 컨트롤에 addActionListener 메서드로 감시설정함
	//3. 해당 컨트롤에 이벤트가 발생하면 호출되는 ActionPerformed 메서드를 오버라이드
	
	JLabel result; // 버튼 이벤트와 그 밖에서도 사용하기 위해서 포괄적으로 선언
	
	ButtonEvent(){
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel ("당신의 성별은 ?");
		result = new JLabel (""); // 버튼 클릭에 의해서 결과가 담겨질 비어있는 최초의 라벨
		
		Container con = getContentPane();
		con.setLayout (new FlowLayout());
		con.add(label);
		con.add(male);
		con.add(female);
		con.add(result);
		
		male.addActionListener(this);
		female.addActionListener(this);
		// 구체적인 이벤트 감시대상을 설정
		// 위 두개의 버튼 중 하나가 클릭되면 actionPerformed가 호출
		
		setTitle("버튼 이벤트 테스트");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed (ActionEvent e) { // 클릭되면 호출이 되는 것
		//Listener가 설정된 컨트롤에 이벤트가 일어나면 자동 호출되는 메서드 : 이벤트가 일어난 내용이 e에 전달
		
		String s = e.getActionCommand(); // 이벤트가 일어난 컨트롤에 표시된 텍스트를 얻음
		//System.out.println(s);
		result.setText(s + " 를 선택하셨습니다.");
		
	}
}

public class Swing03 {

	public static void main(String[] args) {
		new ButtonEvent();
		
	}

}
