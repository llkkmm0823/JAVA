package days03;

import java.util.Scanner;

public class controlop_IF05 {

	public static void main(String[] args) {

		
		//출생년도를 입력받아서 나이를 계산하고 2023-입력한 년도 +1
		//12세미만 어린이, 12~18세 청소년, 19~25세 청년, 26세 이상(나머지)성년 입니다. 라고 출력하는 if문 작성
		
		int year;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("출생년도 입력 : ");
		year = ((2023-sc.nextInt())+1);
		
		if(year<12)System.out.println("어린이");
		else if (year<=18)System.out.println("청소년");
		else if (year<=25)System.out.println("청년");
		else System.out.println("성년");
		
	}

}
