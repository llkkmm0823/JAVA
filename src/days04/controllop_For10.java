package days04;

import java.util.Scanner;

public class controllop_For10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		//정수 하나를 입력 받아서 1부터 입력받은 정수까지 짝수의 합을 출력

		for(int i=2;i<=num;i+=2) {
			sum=sum+i;
		System.out.println("2부터"+i+"까지의 짝수들 합 : "+sum);
	}
	     System.out.println();
	     sum=0;
	     for(int i =1 ; i<=num; i++) {
	    	 if(i%2==0) {
	    		 sum=sum+i;
	    		 System.out.println("2부터"+i+"까지의 짝수들 합 : "+sum);
	    	 }
	     }
	
	     System.out.println();
	     sum=0;
	     for(int i = 1; i<=num; i++) {
	    	 if(i%2==1) continue; //반복실행의 명령을 다 실행하기 전에 현재 지점에서 실행중단 & 다음 반복으로 이동
	    	 //얘만 멈춰 = continue; / 이거 나오면 다 멈춰 = break;
	    		 sum=sum+i;
    		 System.out.println("2부터"+i+"까지의 짝수들 합 : "+sum);
	     }

	}

}
