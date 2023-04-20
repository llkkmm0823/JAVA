package days15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// 액션리스너를 사용하지 않고 버튼 자체에 존재하는 이벤트 메서드 사용하여 만드는 법

class JButtonEvent extends JFrame{
	
	JButtonEvent(){
		ImageIcon korea = new ImageIcon("images/korea1.gif");
		ImageIcon germany = new ImageIcon("images/germany.gif");
		ImageIcon usa = new ImageIcon("images/usa.gif");
		
		JButton eventButton = new JButton(korea); // 버튼 세 개가 아니고 한 개만, 최초 디스플레이 되는 국기는 대한민국만
		
		eventButton.setRolloverIcon(usa); // 마우스가 아이콘에 올라가있으면 나와라
		eventButton.setPressedIcon(germany); // 버튼을 누르고 있으면 나와라
		
		Container con = getContentPane();
		con.setLayout (new FlowLayout());
		con.add(eventButton);
		
		setTitle("버튼 자체 이벤트 처리 실습");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}


public class Swing05 {

	public static void main(String[] args) {
		 new JButtonEvent();
	}

}
