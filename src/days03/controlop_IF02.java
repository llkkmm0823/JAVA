package days03;

import java.util.Scanner;

public class controlop_IF02 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = a%2;
		
		if(b==0) {
			System.out.println("입력한 정수는 짝수(even)입니다");
			b=1;
		}else { // if내용물이 false일 경우에만 else를 봄, true일 경우 건너뜀
			System.out.println("입력한 정수는 홀수(odd)입니다");
		}
		
		System.out.println();
		int kor=70, eng=98, mat=95;
		double avg = (kor+eng+mat)/3.0;
		//평균이 80 이상이라면 합격 그렇지 않으면 불합격이라고 출력
		
		if(avg>=80) {
			System.out.println("합격입니다");
		}else{
			System.out.println("불합격입니다");
		}
		//if(avg >=80.0) System.out.println("평균 80이상 합격");
		
		System.out.println();
		//평균이 60이상이거나 영어점수가 80이상이라면 합격, 아니면 불합격
		if ((avg>=60||eng>=80))
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		// 년도 하나를 입력받아서 변수에 저장하고 입력한 년도가 윤년인지 평년인지를 출력하도록 if문을 작성하세요
		System.out.printf("년도를 입력하세요 : ");
		int year = sc.nextInt();
		//윤년의 조건 : 해당년도가 4의 배수이면서, 100의 배수가 아니거나, 400의 배수인 해
		//result = (year2%4==0)&&(year2%100!=0)||(year1%400==0);
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		System.out.println("윤년입니다");
		else
			System.out.println("평년입니다");

		
		
		
		
		
		}
	}

