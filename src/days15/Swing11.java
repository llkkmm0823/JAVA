package days15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 윈도우에 텍스트 필드 1 버튼 1 버튼 2 텍스트필드 2 순서로 배치
// 버튼 1의 표면에는 ▶ 글자 표시, 버튼 2의 표면에는 ◀ 글자 표시
// 버튼 1을 클릭하면 텍스트 필드1의 글자가 텍스트필드 2로 옮겨지게
// 버튼 2를 클릭하면 텍스트 필드2의 글자가 텍스트필트 1로 옮겨지게
// 글자가 없는 상태에서 버튼을 클릭하면 아무일도 안일어나게
// 윈도 클래스 이름은 TextFieldEx로 제작
// 윈도우의 가로세로크기는 적절히

class TextFieldEx extends JFrame implements ActionListener {
	JTextField t1;
	JTextField t2;
	JButton b1;
	JButton b2;
	
	TextFieldEx(){
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		
		b1 = new JButton("▶");
		b2 = new JButton("◀");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(t1); con.add(b1);con.add(b2); con.add(t2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setTitle("텍스트 필드 테스트");
		setSize(600,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand(); //s는 클릭한 버튼
		
		if(s.equals("▶")) {
			if(!(t1.getText().equals(""))) {
				String s2 = t1.getText();
				t2.setText(s2);
				t1.setText("");
				}
		}else {
			if(!(t2.getText().equals(""))) {
				String s2 = t2.getText();
				t1.setText(s2);
				t2.setText("");
			}
		}	
	}
}
public class Swing11 {

	public static void main(String[] args) {
		new TextFieldEx();
	}
}
