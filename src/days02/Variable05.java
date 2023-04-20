package days02;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {

		// 이름, 국어, 영어, 수학 점수를 입력 받아서 1명의 성적표를 총점 평균과 함께 기존 성적표 양식에 맞춰 출력하세요
		// 문자(이름)를 입력받는 명력 -> sc.nextLine()
		// 입력 받을 대 반드시 이름부터 입력받으세요 순서 : 이름, 국어, 영어, 수학
		// 평균은 소수점 첫째자리까지 출력합니다.
		// printf 또는 ln 자유
		
		int kor,eng,mat,total;
		double average;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("국어 성적을 입력하세요 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 성적을 입력하세요 : ");
		mat = sc.nextInt();
		
		System.out.print("수학 성적을 입력하세요 : ");
		eng = sc.nextInt();
		
		total = (kor + mat + eng);
		average = (kor + mat + eng)/3.0;
		
		System.out.println("\t"+name+"님의 성적표입니다.");
		System.out.println("\t\t###성적표###");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("1\t"+name+"\t\t"+kor+"\t"+mat+"\t"+eng+"\t"+total+"\t"+(int)(average*100)/100.0);
		//System.out.printf(%d\t%s\t\t%d\t%d\t%d\%d\t%.2f\n",1,name,kor,mat,eng,total,average);
		System.out.println("-----------------------------------------------------------------");


	}

}