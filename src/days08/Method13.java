package days08;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {

		int kor, eng, mat, tot;
		double avg;
		// String grade;
		
		kor = myInput(1); // 점수 입력
		eng = myInput(2);
		mat = myInput(3);
		
		tot = sum(kor, eng, mat); // 총점 계산
		avg = avg(kor, eng, mat); // 평균 계산
		//grade = selectGrade(avg);
		
		prnTitle();
		prnScore(kor, eng, mat, tot, avg ); //번호 이름 출력 생략
		System.out.println("----------------------------------------------------------");
	}
	public static int myInput (int a) {
		Scanner sc = new Scanner(System.in);
		if(a==1)System.out.print("국어 점수를 입력하세요 : ");
		else if (a==2)System.out.print("영어 점수를 입력하세요 : ");
		else if (a==3)System.out.print("수학 점수를 입력하세요 : ");
		return sc.nextInt();
	}
	public static int sum ( int a, int b, int c) {
		int tot = a+b+c;
		return tot;
	}
	public static double avg (int a, int b, int c) {
	return (a+b+c)/3.0;
	}
	public static void prnTitle() {
		System.out.printf("\t\t### 성적표 ###");
		System.out.printf("\n----------------------------------------------------------\n");
		System.out.printf("\t국어\t영어\t수학\t총점\t평균\n");	
		}
	public static void prnScore(int a, int b, int c, int t , double avg) {
		System.out.printf("\t%d\t%d\t%d\t%d\t%.1f\n",a,b,c,t,avg);
}
}