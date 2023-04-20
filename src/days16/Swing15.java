package days16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTextFieldTextArea extends JFrame implements ActionListener{
	JTextField jtf;
	JTextArea jta;
	
	JTextFieldTextArea(){
		
		jtf = new JTextField(10); // 최대 표시 10글자(가로크기)....텍스트필드
		jta = new JTextArea(7,20); // 7행 20열(20글자)이라곤 하지만 더 넘어서 쓸 수 있음
		Font f = new Font("굴림",Font.BOLD,20);
		jtf.setFont(f);
		jta.setFont(f);
		JButton k = new JButton("확인");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jtf);
		con.add(jta);
		con.add(k);
		
		setTitle("텍스트 필드 텍스트 에리어");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			String s = jtf.getText();
			jta.append(s+"\n"); //텍스트 필드의 텍스트 에리어 뒷쪽에 내용을 이어붙이기
			jtf.setText("");
	}
}

public class Swing15 {

	public static void main(String[] args) {
		new JTextFieldTextArea();
	}

}
