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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calendars2 extends JFrame implements ActionListener{
	
	JTextField [] jt = new JTextField[42];
	
	JComboBox<String> y;
	JComboBox<String> m;
	
	Calendars2(){
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
			jt[i].setFont(f); 
			jt[i].setHorizontalAlignment(SwingConstants.RIGHT); 
			if(i%7==6)jt[i].setForeground(Color.BLUE); 
			else if (i%7==0)jt[i].setForeground(Color.RED);
			else jt[i].setForeground(Color.BLACK); 
			
			jt[i].setEditable(false); 
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
		
		// y, m에 콤보상자 인스턴스를 만들고, y는 1900~2030 년까지  m은 1~12로 표시
		y = new JComboBox<String>();
		m = new JComboBox<String>();
		for(int i =1900;i<=2030;i++)  y.addItem(i + "");
		for(int i =1;i<=12;i++)  m.addItem(i + "");
	
		
		
		y.setFont(f);
		m.setFont(f);
		
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
		
		y.setSelectedIndex(today.get(Calendar.YEAR)-1900);
		m.setSelectedIndex(today.get(Calendar.MONTH));
		
	drawCalendar(); 
	}
	public void drawCalendar() {
		int year = Integer.parseInt((String)y.getSelectedItem());
		int month = Integer.parseInt((String)m.getSelectedItem());
	
		for(int i=0;i<42;i++)jt[i].setText("");//달력을 그리기 전에 달력의 내용을 모두 삭제하시오
		

	Calendar sDay = Calendar.getInstance(); 
		Calendar eDay = Calendar.getInstance();
		sDay.set(year, month-1, 1); 
		eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE)); 
		eDay.set(year, month,1);
		//eDay.add(Calendar.DATE,-1); // 이렇게 해도됨
		
		int startWeek = sDay.get(Calendar.DAY_OF_WEEK);  //1일자의 요일 (1 : 일요일 ~)
	
		for(int i=startWeek-1; sDay.before(eDay)||(sDay.equals(eDay)); sDay.add(Calendar.DATE, 1)) {
			int day = sDay.get(Calendar.DATE); 
			jt[i].setText(String.valueOf(day));
		i++;
		}
	}
 @Override
 public void actionPerformed(ActionEvent e) {
		
		String s = e.getActionCommand();
		int year = Integer.parseInt((String)y.getSelectedItem());
		int month = Integer.parseInt((String)m.getSelectedItem());
		
		switch(s) {
		case "다음달" :
			if(month==12) {year++; month=1;}
			else month++; break;
		case "이전달" :
			if(month==1) {year--; month=12;}	
			else month--;break;
		case "확인" :
			}
		y.setSelectedIndex(year-1900);
		m.setSelectedIndex(month-1);
		drawCalendar();
	}
}
public class Swing19 {

	public static void main(String[] args) {
		new Calendars2();
	}

}
