package days15;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//이미지 apple.jpg  persimmon.jpg  pear.jpg  banana.jpg  cherry.jpg
//다섯개의 이미지를 아이콘으로 만들고 버튼 다섯개를 이미지와 함께 생성
// 그리드 레이아웃을 이용하여 3행 2열로 배치

//액션리스너를 붙여 버튼 클릭 시 이미지에 해당하는 과일 이름이 result라벨에 나오도록 작성
//생성할 클래스 이름은 GridFruits

class GridFruits extends JFrame implements ActionListener{
	JLabel result;
	GridFruits(){
		
		Container con = getContentPane();
		con.setLayout(new GridLayout( 3, 2));
		ImageIcon a = new ImageIcon("images/apple.jpg");
		ImageIcon p1 = new ImageIcon("images/persimmon.jpg");
		ImageIcon p2 = new ImageIcon("images/pear.jpg");
		ImageIcon b = new ImageIcon("images/banana.jpg");
		ImageIcon c = new ImageIcon("images/cherry.jpg");

		JButton apple = new JButton("사과",a);
		JButton persimmon = new JButton("감",p1);
		JButton pear = new JButton("배",p2);
		JButton banana = new JButton("바나나",b);
		JButton cherry = new JButton("체리",c);
		result = new JLabel("");

		con.add(apple);
		con.add(persimmon);
		con.add(pear);
		con.add(banana);
		con.add(cherry);	
		con.add(result);
		
		apple.addActionListener(this);
		persimmon.addActionListener(this);
		pear.addActionListener(this);
		banana.addActionListener(this);
		cherry.addActionListener(this);
		
		setTitle("과일 선택하기 실습");
		setSize(260,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	@Override
	public void actionPerformed (ActionEvent e) {
		result.setText(e.getActionCommand() );
	}
}
public class Swing09 {

	public static void main(String[] args) {
		new GridFruits ();
		

	}

}
