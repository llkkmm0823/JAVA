package days16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

class MiniGame extends JFrame implements ActionListener{
	
	JLabel com;
	JLabel user;
	ImageIcon comi;
	ImageIcon useri;
	JLabel result;
	
	MiniGame(){
		
		Container con = getContentPane();
		con.setLayout(new BorderLayout() );
		
		JPanel p1 =new JPanel(); 
		// North - JLabel 1개 "준비가 되면 아래 가위바위보 중 하나를 선택하세요"
		// FlowLayout 가운데 정렬
		JPanel p2 =new JPanel(); 
		// Center  - JLabel 세 개 : 컴퓨터가 낸 이미지 vs 사용자가 낸 이미지 
		// FlowLayout 가운데 정렬
		JPanel p3 =new JPanel();
		// South - 버튼 세 개 "가위" "바위" "보"
		// FlowLayout 가운데 정렬

		JLabel title1 = new JLabel("가위/바위/보");
		JLabel title2 = new JLabel(" - 준비가 되면 아래 가위바위보 중 하나를 선택하세요");
		
		Font f1 = new Font("굴림", Font.BOLD,30);
		title1.setFont(f1);
		Font f2 = new Font("굴림", Font.BOLD,18);
		title2.setFont(f2);
		
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.add(title1);
		p1.add(title2);
		con.add(p1,BorderLayout.NORTH);
		
		com = new JLabel();
		user = new JLabel();
		comi = new ImageIcon("images/0.jpg");
		useri = new ImageIcon("images/0.jpg");
		com.setIcon(comi);
		user.setIcon(useri);
		JLabel vs = new JLabel("VS");
		vs.setFont(f1);
		Border b = new BevelBorder(BevelBorder.RAISED); // 튀어나와보이는 효과를 주는 형식
		com.setBorder(b);
		user.setBorder(b);
		
		
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		p2.add(com);
		p2.add(vs);
		p2.add(user);
		con.add(p2,BorderLayout.CENTER);
		
		
		JLabel l3 = new JLabel("안내면 진거");
		l3.setFont(f1);
		JButton s = new JButton("가위");
		s.setFont(f1);
		JButton r = new JButton("바위");
		r.setFont(f1);
		JButton p = new JButton("보");
		p.setFont(f1);
		result = new JLabel(""); // 결과가 입력될 라벨
		result.setFont(f1);
		result.setForeground(Color.RED);

		p3.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		p3.add(l3);
		p3.add(s);
		p3.add(r);
		p3.add(p);
		p3.add(result);
		con.add(p3,BorderLayout.SOUTH);
		
		s.addActionListener(this);
		r.addActionListener(this);
		p.addActionListener(this);

		
		setTitle("가위바위보");
		setSize(800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String userString = e.getActionCommand();
		String resultString;
		
		int comInt = (int)(Math.random()*3);
		String comString;
		//컴퓨터 랜덤 입력 설정

		if(comInt == 0) comString = "가위";
		else if(comInt == 0) comString = "바위";
		else comString = "보";
		
		ImageIcon comi;
		ImageIcon useri;

		
		if(comString.equals("가위")) comi = new ImageIcon("images/1_1.jpg");
		else if(comString.equals("바위"))comi = new ImageIcon("images/2_1.jpg");
		else comi = new ImageIcon("images/3_1.jpg");
		com.setIcon(comi);
		
		if(userString.equals("가위")) useri = new ImageIcon("images/1_2.jpg");
		else if(userString.equals("바위")) useri = new ImageIcon("images/2-2.jpg");
		//스스로 함정을 팠다....파일 이름 복붙하기2_2인줄알았는데 2-2였음 파일이름은 걍 복붙하셈....
		else useri = new ImageIcon("images/3_2.jpg");
		user.setIcon(useri);
		
		//사용자와 컴퓨터가 낸 가위바위보 이미지를 표시
		
		
		if(comString.equals("가위")&&userString.equals("바위"))resultString = "승리";
		else if(comString.equals("바위")&&userString.equals("보"))resultString = "승리";
		else if(comString.equals("보")&&userString.equals("가위"))resultString = "승리";
		else if(comString.equals(userString))resultString = "무승부";
		else resultString ="패배";
		
		
		result.setText(resultString);
		if(resultString.equals("승리")) result.setForeground(Color.RED);
		else if(resultString.equals("패배")) result.setForeground(Color.BLUE);
		else result.setForeground(Color.YELLOW);

		
	}
}

public class Swing20 {

	public static void main(String[] args) {
		new MiniGame();
	}

}
