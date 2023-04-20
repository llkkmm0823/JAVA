package days15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JImageTest extends JFrame implements ActionListener{
	
	JLabel result;
	
	JImageTest(){
		//이미지 파일을 불러와서 자바Swing 화면에 표시하려면 이미지 파일을 아이콘 형태로 변환하여 사용해야함
		ImageIcon ii1 = new ImageIcon("images/korea.gif");
		ImageIcon ii2 = new ImageIcon("images/germany9060.gif");
		ImageIcon ii3 = new ImageIcon("images/usa9060.gif");
		
		
		//버튼을 텍스트를 포함하여 이미지까지 표시하며 생성
		JButton korea = new JButton("대한민국",ii1);
		JButton germany = new JButton("독일",ii2);
		JButton usa = new JButton("미국",ii3);
		result = new JLabel("");
		
		Container con = getContentPane();
		con.setLayout (new FlowLayout());
		con.add(korea);
		con.add(germany);
		con.add(usa);
		con.add(result);
		
		korea.addActionListener(this);
		germany.addActionListener(this);
		usa.addActionListener(this);

		
		setTitle("이미지 아이콘 실습");
		setSize(600,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 액션리스너를 이용해서 버튼이 클릭되면 클릭된 버튼의 나라이름이 result 라벨에 쓰여지도록 코딩
		// 내용 : "독일을(를) 선택하셨습니다"
	}
	@Override
	public void actionPerformed (ActionEvent e) {
		String s = e.getActionCommand();//액션에 따라 글자를 갖고오는 메서드
		result.setText(s + "을(를) 선택하셨습니다.");
		//변수 선언안하고 e.getActionCommand()를 직접적으로 넣어도 됨 
	}
}

public class Swing04 {

	public static void main(String[] args) {
			new JImageTest();
	}

}
