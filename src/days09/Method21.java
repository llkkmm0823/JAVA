package days09;

import java.util.Scanner;

public class Method21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	

			int [] mdays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			
			int y = inputYear(sc);//
			int m = inputMonth(sc);//
			int input = 0;
						
				while(true) {
					if((y%4==0)&&(y%100!=0)||(y%400==0)) mdays[2] = 29;
					else mdays[2] = 28;
					int days = sumDaysYear(y);// 입력한 년도의 전 년도까지의 날짜 합 계산
					days += sumDaysMonth (m, mdays);// 입력한 월의 전 월까지의 날짜 합 계산
					days+=1; // 날짜는 1일자 기준 합산
					int temp =days%7;
					prnCalendar(y,m,mdays,temp);//
					

						System.out.printf("\n\n[1.이전달]\t[2.다음달]\t[3.종료]");
						input = sc.nextInt();
						if(input==3)break;
						
						if(input==1) {
							if(m==1) {
								y--; m=12;
							}else m--;
						}else if(input==2) {
					    	if(m==12) {
					    		y++; m=1;
					    	}else
					    		m++;
						}
						}
				         System.out.println();
				         System.out.println("종료되었습니다");
	}
	public static int inputYear(Scanner sc) {
		System.out.printf("년도 입력 : ");
		return sc.nextInt();
	}
	public static int inputMonth(Scanner sc) {
		System.out.printf("월 입력 : ");
		return sc.nextInt();
	}
	public static int sumDaysYear(int y) {
		int days = 365*(y-1);
		for(int i=1; i<=(y-1);i++)
			if( (i%4==0)&&(i%100!=0)||(i%400==0)) days++; 
		return days;
	}
	public static int sumDaysMonth(int m , int [] mdays) {
		int days =0;
		for(int i=1;i<m;i++)
			days+=mdays[i];
			return days;
	}
	public static void prnCalendar(int y, int m, int[]mdays,int temp) {
		System.out.printf("%d 년 %d 월\n",y , m);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		System.out.println("-----------------------------------------------------------------------");
		for(int i=1;i<=temp;i++)System.out.printf("        ");
		for(int day=1; day<=mdays[m];day++) {
			System.out.printf("%d \t", day);
			if((day+temp)%7==0)	System.out.println();

		 }
		System.out.println("\n"+"-----------------------------------------------------------------------");
	}
}