package days03;

import java.util.Scanner;

public class controlop_IF08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int kor, eng, mat,tot;
		double avg;
		System.out.printf("국어점수 : ");
		kor = sc.nextInt();
		System.out.printf("영어점수 : ");
		eng = sc.nextInt();
		System.out.printf("수학점수 : ");
		mat = sc.nextInt();
		tot=kor+eng+mat;
		avg = tot/3.0;
		//평균 60점 이상이면서 모든 과목 40이상이면 합격
		//그렇지 않다면 불합격을 출력하되,
		//해당되는 불합격 사유(평균미달, 국어과락, 영어과락, 수학과락)를 모두 함께 출력
		
	
		
		if((avg>=60)&&(kor>=40)&&(eng>=40)&&(mat>=40)) System.out.print("합격");
		else System.out.printf("불합격\n불합격 사유 : ");
		if(avg<60) System.out.printf("\t평균미달");
		if(kor<40) System.out.printf("\t국어 과락");
		if(eng<40) System.out.printf("\t영어 과락");
		if(mat<40) System.out.printf("\t수학 과락");



	
		
		
		
		
		


		
		
	}

}
