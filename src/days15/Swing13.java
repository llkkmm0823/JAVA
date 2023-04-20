package days15;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//컨테이너의 레이아웃 : 5행 1열의 GridLayout

//1행 : JPanel p1 배치 -> p1에는 GridLayout으로 TextField 한 개 배치
//2행 : JPanel p2 배치 -> p2에는 GridLayout으로 버튼 네개 (7,8,9,+)
//3행 : JPanel p3 배치 -> p3에는 GridLayout으로 버튼 네개 (4,5,6,-)
//4행 : JPanel p4 배치 -> p4에는 GridLayout으로 버튼 네개 (1,2,3,x)
//5행 : JPanel p5 배치 -> p5에는 GridLayout으로 버튼 네개 (C,0,=,÷)


class Calculator extends JFrame implements ActionListener{
	JTextField jt;
	
	int firstNumber;
	int secondNumber;
	String operator;

	Calculator(){
		Container con = getContentPane();
		con.setLayout(new GridLayout(6,1));
		
		JPanel p0 = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();

		
		p0.setLayout(new GridLayout( 1,1));
		p1.setLayout(new GridLayout( 1,4));
		p2.setLayout(new GridLayout( 1,4));
		p3.setLayout(new GridLayout( 1,4));
		p4.setLayout(new GridLayout( 1,4));
		p5.setLayout( new GridLayout(1,4)); // 계산기에 추가기능 추가하기
		
		jt =new JTextField(15);
		p0.add(jt);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		JButton bplus = new JButton("+");
		JButton bminus = new JButton("-");
		JButton bmul = new JButton("x");
		JButton bdiv = new JButton("÷");
		JButton bc = new JButton("C");
		JButton be = new JButton("=");
		JButton bs = new JButton("<-");
		JButton bsqr = new JButton("sqr");
		JButton b1x = new JButton("1/x");
		JButton bxx = new JButton("x*x");
	
		p1.add(bxx);
		p1.add(bsqr);
		p1.add(b1x);
		p1.add(bs);
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(bmul);
		
		p3.add(b4);
		p3.add(b5);
		p3.add(b6);
		p3.add(bminus);
		
		p4.add(b7);
		p4.add(b8);
		p4.add(b9);
		p4.add(bplus);
		
		p5.add(bc);
		p5.add(b0);
		p5.add(be);
		p5.add(bdiv);
		
		con.add(p0);
		con.add(p1);
		con.add(p2);
		con.add(p3);
		con.add(p4);
		con.add(p5);
		
				//폰트 객체 생성
				Font f = new Font("굴림",Font.BOLD,20);
				jt.setFont(f);; // 폰트 적용
				jt.setHorizontalAlignment(SwingConstants.RIGHT); // 오른쪽 정렬
				jt.setEditable(false); // 편집 불가능으로 설정
				jt.setText("0"); // 최초 텍스트 0으로 설정

				b0.setFont(f);
				b1.setFont(f);
				b2.setFont(f);
				b3.setFont(f);
				b4.setFont(f);
				b5.setFont(f);
				b6.setFont(f);
				b7.setFont(f);
				b8.setFont(f);
				b9.setFont(f);
				bplus.setFont(f);
				bminus.setFont(f);
				bmul.setFont(f);
				bdiv.setFont(f);
				be.setFont(f);
				bc.setFont(f);
				bs.setFont(f); 
				bsqr.setFont(f); 
				b1x.setFont(f); 
				bxx.setFont(f);
		
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
		 b5.addActionListener(this);
		 b6.addActionListener(this);
		 b7.addActionListener(this);
		 b8.addActionListener(this);
		 b9.addActionListener(this);
		 b0.addActionListener(this);
		 
		 be.addActionListener(this);
		 bc.addActionListener(this);
		 bs.addActionListener(this);
		 
		 bxx.addActionListener(this);
		 bsqr.addActionListener(this);
		 b1x.addActionListener(this);
		 
		 bplus.addActionListener(this);
		 bminus.addActionListener(this);
		 bmul.addActionListener(this);
		 bdiv.addActionListener(this);
		 
		setTitle("계산기 실습");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
public void actionPerformed(ActionEvent e) {
		//0~9 버튼을 클릭하면 최촛값 0은 지워지고 클릭되는 숫자들이 입력되어 쌓이도록 코딩
		//switch이용
		String s= e.getActionCommand();
		String oldText ="";
		oldText = jt.getText();
		DecimalFormat df = new DecimalFormat("0.####"); // 소수점 자리조정
		double temp; // 더블형 임시 변수

		switch(s) {
			case "0" :case "1" :case "2" :case "3" :case "4" :case "5" :case "6" :case "7" :case "8" :case "9" :
				if(oldText.equals("0")) oldText = "";
				jt.setText(oldText + s);
				break;
				
			case "C" : jt.setText("0");
							break;
							
			// 현재 텍스트의 글자 갯수를 얻는 메서드 : length()
			// 현재 텍스트의 일부 글자를 추출하는 메서드 : substring()
			// "123456" -> "12345"
			//←버튼을 입력하면 맨 오른쪽 글자를 제외한 나머지 글자를 취해서 다시 jt에 넣기
			case "<-" :
				if(oldText.length()==1) jt.setText("0");
				else {
				int strNum = oldText.length();
				String newText = oldText.substring(0,strNum-1);
				jt.setText(newText);	
			}break;
			
			case "+":case "-":case "x":case "÷":
				operator =s;
				firstNumber = Integer.parseInt(jt.getText());
				jt.setText("0");
				break;
				
			case "=" :
				secondNumber = Integer.parseInt(jt.getText());
				switch(operator) {
				case "+" :
					jt.setText(String.valueOf( firstNumber+secondNumber )); break;
				case "-" :
					jt.setText(String.valueOf( firstNumber-secondNumber )); break;
				case "x" :
					jt.setText(String.valueOf( firstNumber*secondNumber )); break;
				case "÷" :
					jt.setText(String.valueOf(df.format( firstNumber/(double)secondNumber ))); break;
					//jt.setText((df.format( firstNumber/(double)secondNumber )+""); break; 이것도 맞음
					//String.valueOf말고 +"" 로 대신해도 됨
				}break;
				
			case "sqr" : // 현재 숫자 0일 때는 계산 X _ 아무일도 일어나지 않도록
				// 제곱근을 구하는 버튼으로 구현
				secondNumber= Integer.parseInt(jt.getText());
				if(secondNumber==0) return;
				temp = Math.sqrt(secondNumber);
				jt.setText(String.valueOf(df.format(temp)));break;
				
			case "1/x" :// 현재 숫자 0일 때는 계산 X _ 아무일도 일어나지 않도록
				// 화면에 있는 숫자로 1을 나눈 몫을 출력
				secondNumber= Integer.parseInt(jt.getText());
				if(secondNumber==0) return;
				temp = 1.0/secondNumber;
				jt.setText(String.valueOf(df.format(temp)));break;
				
			case "x*x" :
				// 입력된 숫자의 제곱을 출력
				secondNumber= Integer.parseInt(jt.getText());
				jt.setText(String.valueOf(secondNumber*secondNumber));break;
		}
	}
}

public class Swing13 {

	public static void main(String[] args) {
		new Calculator();
	}
}
