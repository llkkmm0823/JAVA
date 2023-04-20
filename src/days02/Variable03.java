package days02;

import java.util.Scanner;

public class Variable03 {

	public static void main(String[] args) {
		
		// 삼각형의 밑변과 높이를 입력받아서 넓이를 출력
		// 삼각형의 넓이 : 밑변 x 높이 x 0.5
		
		// 입력
		// 삼각형의 밑변 입력 : XX
		// 삼각형의 높이 입력 : XX
		
		// 출력
		// 입력하신 삼각형의 넓이는 XX.X입니다.
		
		int number1 , number2;
		double result;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("삼각형의 밑변을 입력하세요: ");
		number1 = sc.nextInt();		
		System.out.printf("삼각형의 높이를 입력하세요: ");
		number2 = sc.nextInt();
		result = number1*number2*0.5;
		System.out.printf("삼각형의 넓이는 %.1f 입니다.\n",result);
		
		
				
				
				
	}

}
