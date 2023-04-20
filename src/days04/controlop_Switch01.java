package days04;

import java.util.Scanner;

public class controlop_Switch01 {

	public static void main(String[] args) {

		int a;
		Scanner sc =new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		a = sc.nextInt();
		
		/*
		 if(a==1)System.out.println("1을 입력하셨습니다");
		else if(a==2)System.out.println("2을 입력하셨습니다");
		else if(a==3)System.out.println("3을 입력하셨습니다");
		else if(a==4)System.out.println("4를 입력하셨습니다");
		else System.out.println("1~4외의 값을 입력하셨습니다");
		 */
		
		// Switch문 : if문과 비슷한 구조
		// 변수값의 단순 참조일 때 사용. 변수 값이나 연산식의 결과값에 따라 실행할 명령이 선택됨
		switch( a ) {
		    case 1:
			    System.out.println("1을 입력하셨습니다");   break; // 멈춰
		    case 2: 
			    System.out.println("2을 입력하셨습니다");
			    break;
		    case 3:
			    System.out.println("3을 입력하셨습니다");
			    break;
		    case 4:
			    System.out.println("4를 입력하셨습니다");
			    break;
			default:
				System.out.println("1~4외의 값을 입력하셨습니다");
		}	
		//  break: 자신을 감싼 가장 가까운 switch, for(반복문), while(반복문) 등의 {}중괄호 영역을 빠져나가라는 명령
				

		
		
		
		
	}
}
