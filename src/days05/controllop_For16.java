package days05;

import java.util.Scanner;

public class controllop_For16 {

	public static void main(String[] args) {

		// 정수하나를 입력 받아서 그 숫자가 소수(prime number)인지 아닌지를 출력
		//prime number : 1과 자기자신으로만 나눠떨어지는 숫자
		/*	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//1부터 자기 자신까지의 숫자로 모두 나눠보고 나눠떨어지는 횟수가 딱 2번인 경우
		int count=0;
		//나눠떨어지는 횟수를 카운트하기 위한 변수, 나눠떨어질 때마다 count++연산으로 횟수를 카운트
		
		int i;
		for(i=1;i<=num;i++) {
			if(num%i==0)count++; }
		if(count==2) System.out.println("입력한 정수 " + num + "은 소수(prime number)입니다");
		else System.out.println("입력한 정수 " + num + "은 소수(prime number)가 아닙니다");
		*/
		
		// 1부터 100 사이의 소수를 모두 출력해주세요
		int i,j;
		for(i=2; i<=100; i++) {
			int count=0; // 카운트는 계속 누적이 되기 때문에 0이라고 설정
			for(j=2; j<=i/2; j++) { // i 값을 1~i 값을 갖는 j로 모두 나눠봅니다
				// 반 이상 가면 의미가 없음 어차피 1번밖에 못들어가니께
			if(i%j==0)count++; }
		if(count==0)System.out.printf("%d " ,i);
		
		// 연산을 최대한 줄여주어야 속도가 빨라짐
		
		
		}
		
		
		
		
		
	}

}
