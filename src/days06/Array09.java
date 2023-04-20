package days06;

import java.util.Scanner;

		public class Array09 {
			public static void main(String[] args) {
				

				Scanner sc = new Scanner(System.in);	
				System.out.printf("년도 입력 : ");
				int y =sc.nextInt();
				System.out.printf("월 입력 : ");
				int m = sc.nextInt();
				int days = 0;
				
				int [] mdays = {0,31,28,31,30,31,30,31,31,30,31,30,31};

				
		while(true) {
			//switch대신 사용가능
			if((y%4==0)&&(y%100!=0)||(y%400==0)) mdays[2] = 29;
			else mdays[2] = 28;
		//
				days = 365*(y-1);
				for(int i=1; i<=(y-1);i++)
					if( (i%4==0)&&(i%100!=0)||(i%400==0)) //i가 윤년인지 확인
						days++; //윤년이라면, 1일을 더해줘야함
				
				for(int i =1 ; i <=m-1; i++) 
				days = days +mdays[i];
				//switch대신 사용가능
				
					
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
				for(int day=1; day<=mdays[m];day++) {
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
