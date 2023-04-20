package days05;

import java.util.Scanner;

public class Controllop_while01 {

	public static void main(String[] args) {
		
		// while 반복문
		// for 반복문은 정해진 횟수의 반복을 괄호안에 미리 정의 해 놓고 반복하는 특징이 있습니다
		// while 문은 정해지지 않은 횟수의 반복을 처리하는데 주로 사용합니다.
		// 특정 조건이 만족할 때까지 무한 수행합니다.
		// while( true ){
		// }
		// -> 이 반복문은 종료되지 않습니다 : 무한반복
		
		
		// for을 이용해서 10회 반복실행
		int i;
		for (i = 1; i<=10;i++) {
			System.out.printf("for  ");
			
		}
			System.out.println();
			
	   //while을 이용해서 10회 반복하는 경우
		i = 1;
		while ( i<=10 ) {
			System.out.printf("while ");
			i++;
		
		}
		System.out.println();
		//괄호 안의 관계(비교)연산식의 참/거짓 유무를 먼저 판단한 후 반복을 계속할지 결정
		//i++연산이 반복 실행 유지에 관여해서 연산되고 있지만 , while문은 그런 연산보다는 
		//"특정상황발생"을 기준으로 반복이 계속될지 멈출지를 결정하는 것에 많이 사용됩니다
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("\n메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
		int input = sc.nextInt();
		
		while(input != 3) {
		switch(input) {
		      case 1:System.out.printf("저장했습니다");break;
		      case 2:System.out.printf("불러왔습니다");break;
		      // case 3:System.out.printf("종료합니다");break;
		}
		System.out.printf("\n메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
		input = sc.nextInt();
		}
		System.out.printf("종료합니다");
		
		// for문을 while문처럼 사용한 예------------------------------------------------------------------------------
		i=0;
		for(  ;  ;  ) {
			i++;
			System.out.printf("for  ");
			if(i>=10) break;
			
		}
		
		//-----------------------------------------------------------------------------------------------------------
		while(true) {
			System.out.printf("\n메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
			input = sc.nextInt();
			if(input==3)break;
			switch(input) {
			case 1: System.out.printf("저장했습니다");break;
			case 2: System.out.printf("불러왔습니다");break;
			}
		}
		System.out.printf("프로그램을 종료합니다\n\n");

		
		
		
	}

}
