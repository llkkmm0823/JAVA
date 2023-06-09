package days15;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JGridLayout extends JFrame{
	JGridLayout(){
		
		Container con = getContentPane();
		
		con.setLayout(new GridLayout( 3, 5, 20, 20));
		//화면의 배치를 행과 열의 갯수로 배치하고 조절
		// 3행 5열의 가로 세로 간격 20px씩 배치
		
		for(int i=1;i<=15;i++)
			con.add(new JButton("버튼"+i)); // 반복실행문 활용 버튼 연속만들기
		
		setTitle("그리드 레이아웃 실습");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		
	}
}


public class Swing08 {

	public static void main(String[] args) {
			new JGridLayout();
	}

}
