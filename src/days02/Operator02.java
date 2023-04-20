package days02;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {

		
		// (입력) 갖고있는 사과의 총 갯수입력 : XX
		// (입력) 상자 하나에 담길 사과의 갯수 입력 : XX
		
		// (출력) 입력조건으로 포장했을 때, 포장된 박스 갯수, 남은 사과 갯수 출력
		// 박스 갯수 : XX
		// 남은 사과 : XX
		
		int a, b, rs1,rs2;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("갖고있는 사과의 총 갯수를 입력하세요 : ");
		a = sc.nextInt(); // 총 갯수
		
		System.out.print("상자 하나에 담길 사과의 갯수를 입력하세요 : ");
		b = sc.nextInt(); // 상자에 넣을 수 있는 사과 갯수
		
		rs1= a / b;
		System.out.printf("포장된 박스 갯수 : %d 개\n",rs1);
		rs2=a%b;
		System.out.printf("남은 사과 갯수 : %d 개",rs2);

		
	}

}
