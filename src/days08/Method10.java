package days08;

import java.util.Scanner;

public class Method10 {

	public static void main(String[] args) {

		
		int ban;
		double n , d;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 :" );
		ban = sc.nextInt();
		
		n = caculate1(ban); // 원의 넓이를 구하는 메서드
		d = caculate2(ban); // 원의 둘레를 구하는 메서드
		prn(n, d); //넓이와 둘레를 출력하는 메서드
	}
	public static double caculate1 (int b) {
		// double n = b*b*3.141592;
		// return n;
		return b*b*3.141592;
	}
	public static double caculate2 (int b) {
		return 2*b*3.14;				
	}
	public static void prn (double n , double d) {
		System.out.printf( "입력한 원의 넓이 : %.2f\n",n);
		System.out.printf( "입력한 원의 둘레 : %.2f\n",d);

	}

}
