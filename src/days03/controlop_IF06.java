package days03;

import java.util.Scanner;

public class controlop_IF06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int basic; // 기본급 저장 변수
		double total; 
		double bonus;
		System.out.printf("기본급을 입력하세요 : ");
		basic = sc.nextInt();
		// 기본급이 백만원 이상이라면 기본급의 50%를 보너스로 합산
		// 기본급이 백만원 미만이라면 기본급의 60%를 보너스로 합산
		// 총지급액을 출력하세요
		
		//1.
		
		if(basic>=1000000) {
			bonus=basic*0.5;
			total = basic+bonus;
			System.out.println("총 지급액은" + total + "입니다");
		}else {
				bonus=basic*0.6;
			    total = basic+bonus;
				System.out.println("총 지급액은"+total+"입니다");
		}
		//2.
		if(basic>=1000000)bonus=basic*0.5;
		else bonus = basic*0.6;
		total = basic+bonus;
		System.out.printf("기본급 : %d, 보너스 : %.1f, 총지급액 : %.1f\n",basic,bonus,total);
		
		
		
		
		
		
	}
}
