package days02;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {

		// 반지름을 입력받아서 원의 넓이와 둘레의 길이를 출력합니다.
		// 입력1, 출력2
		// 필요한 변수의 이름은 임의로 지어서 사용
		
		//출력양식
		//입력한 원의 넓이 : XX.XX,  둘레의 길이 : XX.XX
		
		//넓이=반지름x반지름x3.141592 둘레=2x반지름x3.141592
		//결과는 소수점 둘 째자리까지만 표시, println printf 본인선택
		
		int num1;
		double num2;
		double result1,result2;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("원의 반지름을 입력하세요 : ");
		
		num1 = sc.nextInt();
		num2 = 3.141592;
		
		result1 = num1*num1*num2;//넓이
		result2 = 2*num1*num2;//둘레
		
		System.out.printf("원의 넒이는 %.2f 입니다.\n", result1);
		System.out.printf("원의 둘레는 %.2f 입니다.\n", result2);
		//System.out.println("원의 넓이는 " + (int)(result1*100)/100.0);
		//System.out.println("원의 둘레는 " + (int)(result2*100)/100.0);
		
	}

}
