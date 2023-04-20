package days05;

import java.util.Scanner;

public class Controllop_while04 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);	
		System.out.printf("년도 입력 : ");
		int y =sc.nextInt();
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		int days = 0;
	
		
while(true) {
		days = 365*(y-1);
		for(int i=1; i<=(y-1);i++)
			if( (i%4==0)&&(i%100!=0)||(i%400==0)) //i가 윤년인지 확인
				days++; //윤년이라면, 1일을 더해줘야함
		
		switch(m) {
		case 12:days=days+30; // 11월의 날짜 수 30일을 합산
		case 11:days=days+31;
		case 10:days=days+30;
		case 9:days=days+31;
		case 8:days=days+31;
		case 7:days=days+30;
		case 6:days=days+31;
		case 5:days=days+30;
		case 4:days=days+31;
		case 3: //월에 해당하는 날짜 수 계산 시 입력한 년도(y)가 윤년이라면 29를, 아니라면 28을 더하도록 설정
		if( (y%4==0)&&(y%100!=0)||(y%400==0))  days=days +29;//윤년이면 29 더하기
		else days=days+28;//아니라면 28 더하기
		case 2:days=days+31;
		case 1:break;//디폴트가 들어가서 케이스 1을 써야함
		default: System.out.print("잘못입력하셨습니다. 프로그램이 종료됩니다.");return;

		}
			
		days = days + 1; 
		int temp =days%7,lastday;
		
		switch(m) {
		case 1:case 3:case 5:case 8:case 10:case 12:lastday = 31; break;
		case 4:case 6:case 9:case 11:lastday = 30;break;
		case 2:	if((y%4==0)&&(y%100!=0)||(y%400==0)) lastday=29; else lastday=28;
		}
		
		System.out.printf("%d 년 %d 월\n",y , m);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		System.out.println("-----------------------------------------------------------------------");
		
		for(int i=1; i<=temp; i++) System.out.printf("\t");
		for(int day=1; day<=31;day++) {
			System.out.printf("%d \t", day);
			 if((day+temp)%7  ==  0  ) 
				 System.out.println();
		 }
		System.out.println("\n"+"-----------------------------------------------------------------------");

		System.out.printf("\n\n[1.이전달]\t[2.다음달]\t[3.종료]");
		int input = sc.nextInt();
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
 }

