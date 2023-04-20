package days04;

import java.util.Scanner;

public class controllop_For09 {

	public static void main(String[] args) {

		int sum=0,i,num;
		double avg;
		Scanner sc = new Scanner(System.in);
		//10개의 정수를 입력받아 그들의 합계와 평균을 출력하세요
		//10개를 입력하는 중간에 종료를 원하면 0을 입력하여 입력을 종료하고 최종 합계를 출력합니다
		
		//입력양식
		//입력 1 : XX
		//입력 2 : XX
		//입력 3 : XX
		//...
		//입력 10 : XX
		
		//출력양식
		//입력한 정수들의 합계 : XXX
		// 입력한 정수들의 평균 : XX.X
		
		// 중간에 0을 입력하면 입력이 종료되고 그 동안 입력한 데이터만으로 합계 평균을 출력하세요
		
		for(i=1;i<=10;i++) {
		System.out.println("입력"+ i +" :");
		num=sc.nextInt(); //이렇게 하면 입력1이후 입력 2입력하면 1값이 지워짐(변수의 값이 갱신되잖아)
		if(num==0)break; //반복실행은 break로 정해진 횟수를 다 채우지 않고 멈출 수 있습니다.
		sum=sum+num; //반복실행 속에 입력명령이 있다면 다음 입력으로 현재 입력이 사라질 수 있습니다.
		//sum에다가 계속 누적해서 더해놓는 것임. 그러면 지워져도 상관없음 알고있응게
		
		}
		System.out.println("입력된 정수의 합계 : "+sum);
		System.out.println("반복종료 후 i 값 : "+ i);
		System.out.println("입력한 정수들의 평균 : "+sum/(double)(i-1));//i-1하는 이유는 마지막에는 0이 입력되었기 때문이여
		

		
	}

}
