package days04;

import java.util.Scanner;

public class controllop_For04 {

	public static void main(String[] args) {

		//입력한 숫자의 구구단을 출력하세요
		//2x1=2
		//2x2=4
		//...
		//2x9=18
		
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.printf("출력할 단을 입력하세요(2~9) : ");
		dan = sc.nextInt();
		
		int a;
		int i;
		for(i=1;i<=9;i++) {
			a=dan*i;
			System.out.println(dan+"x"+i+"="+a);
			
			
		}
	}

	}
