package days05;

import java.util.Scanner;

public class controllop_For12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int i, small,a;
		System.out.printf("첫 번째 정수를 입력 : ");
		num1 = sc.nextInt();
		System.out.printf("두 번째 정수를 입력 : ");
		num2 = sc.nextInt();

		//입력 받은 두 개의 정수들의 공약수들을 출력하세여
		//12 36을 입력한 경우 1 2 3 4 6 12
		if(num1<num2)small=num1;
		else small=num2;
		int k=0;
		System.out.printf("%d %d의 공약수 : ",num1,num2 );
		for(i=1;i<=small;i++) {
		if((num1%i==0)&&(num2%i==0)) {
			System.out.printf("%d ",i );
		//공약수가 모두 출력되었다면, 최대공약수를 따로 출력
		k=i;
	}
		}
		System.out.printf("\n최대공약수 : %d\n", k);
		
		
	}
}


