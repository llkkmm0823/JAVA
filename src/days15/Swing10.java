package days15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JTextFieldTest extends JFrame implements ActionListener{
	JTextField jtf;
	
	JTextFieldTest(){
		jtf = new JTextField(30);
		// 라벨이 화면에 메세지는 표시하지만 수정은 할 수 없는 안내문구만 가능하다면 
		// 텍스트 필드는 비어잇는 곳에 글자를 써넣을 수 있고, 쓰여진 글자도 수정가능
		
		JButton bt1 = new JButton("반갑습니다");
		JButton bt2 = new JButton("안녕하세요");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jtf);
		con.add(bt1);
		con.add(bt2);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		
		setTitle("텍스트 필드 테스트");
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s= jtf.getText(); // 원래 있던 글자를 따로 저장
		jtf.setText(s + e.getActionCommand()); // s를 추가함으로써 이전 글자와 새 글자가 이어붙이기 됨
	}
}


public class Swing10 {

	public static void main(String[] args) {
		new JTextFieldTest();
	}

}
