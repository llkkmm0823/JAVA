package days07;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {

		// 정수 하나를 입력받아서 그 정수에 해당하는 구구단을 출력하세요
		// 구구단 출력은 메서드를 이용해서 출력합니다. 메서드 이름 googoodan
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int dan = sc.nextInt();
		googoodan(dan);
	}
	public static void googoodan(int dan) { // d???????????????
		for(int i=1;i<=9;i++)
			System.out.printf("%d x %d = %2d\n",dan,i,(dan*i));
	}

}
