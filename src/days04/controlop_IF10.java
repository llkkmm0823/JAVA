package days04;

import java.util.Scanner;

public class controlop_IF10 {

	public static void main(String[] args) {

		//2023년에 한해서 월과 일을 입력받고, 요일을 출력하세요
		
		//1월 10일 입력했다면 1월 1일부터 10일까지 10일의 날짜가 계산됩니다
		//그를 7로 나눈 나머지를 구하면 3이고, 1:토요일 2: 일요일 3: 월요일 ,,,,
		//위와 같이 요일을 계산합니다 해당 입력일은 월요일
		// 2월 5일 입력했다면 1월에 해당하는 31일 + 입력한 일 5 -> 36
		// 36을 7로 나눈 나머지를 계산하면 1, 해당 입력일은 토요일이 됩니다.
		
		//1. 요일을 계산할 월과 일을 입력받습니다.
		Scanner sc = new Scanner(System.in);
		System.out.printf("월 입력 : ");
		int m = sc.nextInt();
		System.out.printf("일 입력 : ");
		int d = sc.nextInt();

		int days = 0;
		
		//2023년 1월 1일은 일요일
		
		//1. 입력받은 월의 바로 전 달까지 날짜 수를 계산
		
		if(m==1) days = 0;
		else if (m==2) days =31;
		else if (m==3) days = 31+28;
		else if (m==4) days =31+28+31;
		else if (m==5) days =31+28+31+30;
		else if (m==6) days =31+28+31+30+31;
		else if (m==7) days =31+28+31+30+31+30;
		else if (m==8) days =31+28+31+30+31+30+31;
		else if (m==9) days =31+28+31+30+31+30+31+31;
		else if (m==10) days =31+28+31+30+31+30+31+31+30;
		else if (m==11) days =31+28+31+30+31+30+31+31+30+31;
		else if (m==12) days =31+28+31+30+31+30+31+31+30+31+30;
		else{
				System.out.print("잘못입력하셨습니다. 프로그램이 종료됩니다.");
				 return; // 프로그램 종료 - 원래는 프로그램 종료 명령은 아니지만 지금은 종료역할 실행
		}
		
		// 2.입력된 일을 days에 합산합니다
		days = days + d; // days+=d
		
		int temp =days%7;
		
		if(temp==1) System.out.println("일요일입니다용");
		else if (temp==2) System.out.println("월요일입니다용");
		else if (temp==3) System.out.println("화요일입니다용");
		else if (temp==4) System.out.println("수요일입니다용");
		else if (temp==5) System.out.println("목요일입니다용");
		else if (temp==6) System.out.println("금요일입니다용");
		else if (temp==0) System.out.println("토요일입니다용");				 
				 
		
		//if의 각 경우의 수츼 처리할 변수의 명령이 초기화되지 않은 변수에 값을 넣고 동작시키면
		//각 경우의 수에 맞지 않는 경우 변수 값이 여전히 초기화되지 않으므로, else를 써서
		//변수값이 대입될 경우의 수를 만들어줍니다.
		//그렇지 않을 예정이라면 변수 선언 시 값을 넣어주는 방법을 쓸 수도 있습니다.
		
	}

}
