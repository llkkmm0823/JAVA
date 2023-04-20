package days03;

import java.util.Scanner;

public class controlop_IF07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String level; // 직급을 저장할 변수
		int pay; //판매실적금액 변수
		double r, total=0.0;
		
		System.out.printf("직급입력(과장/대리/사원) : ");
		level = sc.nextLine();
		
		System.out.printf("판매실적금액 입력 : ");
		pay = sc.nextInt();
		
		//판매 실적 금액에 과장 50%, 대리 25%, 사원 15%의 활동비를 합산하여 출력
		
		if(level.equals("과장")) 
			r=0.5;
		else if(level.equals("대리")) 
			r=0.25;
	    else r=0.15;
		
			total= pay + pay*r;
			System.out.println("활동비는"+(int)total+"입니다");
			
			
			
			
		}
}
