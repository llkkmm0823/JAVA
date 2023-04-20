package days16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calendars extends JFrame implements ActionListener{
	
	JTextField [] jt = new JTextField[42];
	JTextField y;
	JTextField m;
	
	
	Calendars(){
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		jp1.setLayout(new GridLayout(1,7)); // 요일이 표시될 부분
		jp2.setLayout(new GridLayout(6,7)); // 달력이 표시될 부분
		jp3.setLayout(new FlowLayout()); // 현재 달력의 년, 월과 이전달 다음달 표시될 부분
		
		Font f = new Font ("굴림",Font.BOLD,20);
		
		JButton b1 = new JButton("일");
		b1.setFont(f);
		JButton b2 = new JButton("월");
		b2.setFont(f);
		JButton b3 = new JButton("화");
		b3.setFont(f);
		JButton b4 = new JButton("수");
		b4.setFont(f);
		JButton b5 = new JButton("목");
		b5.setFont(f);
		JButton b6 = new JButton("금");
		b6.setFont(f);
		JButton b7 = new JButton("토");
		b7.setFont(f);
		
		jp1.add(b1).setForeground(Color.RED);//씌어지는 색깔, 배경색은 Background
		jp1.add(b2);
		jp1.add(b3);
		jp1.add(b4);
		jp1.add(b5);
		jp1.add(b6);
		jp1.add(b7).setForeground(Color.BLUE);
		
		con.add(jp1,BorderLayout.NORTH);
		
		for(int i=0;i<jt.length;i++) {
			jt[i] = new JTextField();
			jt[i].setFont(f); // 글자와 글자 크기 세팅
			//jt[i].setText((i+1)+""); // String.valueOf도 가능 _ 테스트용 코드
			jt[i].setHorizontalAlignment(SwingConstants.RIGHT); // 텍스트 오른쪽 정렬
			if(i%7==6)jt[i].setForeground(Color.BLUE); // 맨 오른쪽 끝열은 파란글자
			else if (i%7==0)jt[i].setForeground(Color.RED); // 왼쪽 빨간색 글자
			else jt[i].setForeground(Color.BLACK); // 나머지 검은색
			jt[i].setEditable(false); // 마우스 키보드 이용한 수정불가
			jt[i].setBackground(Color.WHITE);
			jp2.add(jt[i]);
		}
		con.add(jp2,BorderLayout.CENTER);
		
		JButton jb0 = new JButton("확인");
		JButton jb1 = new JButton("이전달");
		JButton jb2 = new JButton("다음달");
		jb0.setFont(f);
		jb1.setFont(f);
		jb2.setFont(f);
		
		JLabel jl1 = new JLabel("년");
		JLabel jl2 = new JLabel("월");
		jl1.setFont(f);
		jl2.setFont(f);
		
		y = new JTextField();
		m = new JTextField();
		
		y = new JTextField(6);
		y.setFont(f);
		y.setHorizontalAlignment(SwingConstants.CENTER);
		m = new JTextField(3);
		m.setFont(f);
		m.setHorizontalAlignment(SwingConstants.CENTER); //텍스트 필드
		
		jp3.add(jb1);
		jp3.add(y);
		jp3.add(jl1);
		jp3.add(m);
		jp3.add(jl2);
		jp3.add(jb0);
		jp3.add(jb2);
		con.add(jp3,BorderLayout.SOUTH);
		
		jb0.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);

		setTitle("스윙 캘린더");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Calendar today = Calendar.getInstance();
		y.setText(String.valueOf(today.get(Calendar.YEAR)));
		m.setText(String.valueOf(today.get(Calendar.MONTH)+1));
		// 화면에 표시될 달력은 y, m 텍스트 필드를 기준으로 작성될 예정이므로 그 숫자부터 기재될 수 있도록 함
		// 추 후에 다른달 달력을 출력할 때도 y, m을 수정 후 그 달을 기준으로 달력이 출력될 예정
		
		drawCalendar(); // 메서드 생성해서 할거임 코드 짱많음
	}
	public void drawCalendar() {//스태틱 만들 필요도 없음 멤버메서드니까
		int year = Integer.parseInt(y.getText());
		int month = Integer.parseInt(m.getText());// 텍스트 필드 값을 정수로 변환
		
		for(int i=0;i<42;i++)jt[i].setText("");//달력을 그리기 전에 달력의 내용을 모두 삭제하시오
		

		Calendar sDay = Calendar.getInstance(); // 시작 날짜 객체
		Calendar eDay = Calendar.getInstance(); // 말일자 객체
		sDay.set(year, month-1, 1); // 몇년 몇월 1일인지 세팅
		eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE)); // 몇년 몇월 말일자 세팅
//		eDay.set(year, month,1);
//		eDay.add(Calendar.DATE,-1); // 이렇게 해도됨
		
		//계산된 요일의 칸부터 출력(요일 결과가 1:일요일   0번째부터 1일로 출력되도록, 요일 결과가 2:월요일  1번째부터 1일로 출력)
		int startWeek = sDay.get(Calendar.DAY_OF_WEEK);  //1일자의 요일 (1 : 일요일 ~)
		
		for(int i=startWeek-1; sDay.before(eDay)||(sDay.equals(eDay)); sDay.add(Calendar.DATE, 1)) {
			//컴퓨터의 배열은 [0]부터 시작하기 때문에 startWeek-1을 해줘야 정상출력
			//ㄴ DAY_OF_WEEK는 1부터 일요일임
			//sDay.before(eDay)||(sDay.equals(eDay)) : 시작날짜가 말일보다 작거나 같다면
			//sDay.add(Calendar.DATE, 1) : 계속 시작날짜를 1일씩 덧셈하라
			//빈칸을 띄우거나 하는 동작없이 해당요일에 해당하는 i번째에 1일부터 출력
			int day = sDay.get(Calendar.DATE); // 시작날짜에 일자만 추출
			jt[i].setText(String.valueOf(day));
			i++; // i를 여기서 더함
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 이전달 다음달 버튼을 클릭하면 현재 달력이 이전달 다음달 달력으로 바뀌게 코딩
		// 새 달력이 출력될 때 하단에 표시된 년 월도 해당 년 월로 수정
		// y, m 텍스트 필드 기준으로 달력이 출력되고 있으니 그 날짜를 바꾸고 drawCalendar 호출
		
		String s = e.getActionCommand();
		int year = Integer.parseInt(y.getText());
		int month = Integer.parseInt(m.getText());
		switch(s) {
		case "다음달" :
			if(month==12) {year++; month=1;}
			else month++;
			y.setText( year + "");
			m.setText(month+"");  break;
			
		case "이전달" :
			if(month==1) {year--; month=12;}	
			else month--;
			y.setText( year + "");
			m.setText(month+"");  	break;
		
		case "확인" :
			JOptionPane aa = new JOptionPane();
			if(year<1||year>9999) {
				aa.showMessageDialog(null,"년도를 잘못 입력했습니다(1~9999)");
				y.setText(year+""); return;
			}
			if(month<1||month>12) {
				aa.showMessageDialog(null,"월을 잘못 입력했습니다(1~12)");
				m.setText(month+"");return;
			}
		}
		drawCalendar();
	}
}


public class Swing14 {

	public static void main(String[] args) {
			new Calendars();
			
	}

}
