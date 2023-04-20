package days04;

import java.util.Scanner;

public class controllop_For07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i=1; 
		int k;
		System.out.printf("출력할 팩터리얼을 입력하세요 : ");
		k=sc.nextInt();
		
		// 6을 입력했다면
		// 6! = 6x5x4x3x2x1 = 720 거꾸로 출력
		
		System.out.printf("%d ! =",k);
		for(i=k;i>1;i--) {// 7을 입력했다면
			System.out.printf("%dx", i);//7x6x5x4x3x2x 출력
			fact = fact *i;
		}
		System.out.printf("1=%d",fact);//1=결과 출력
	}

}
