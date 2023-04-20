package days07;

import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {

		// 점수를 입력 받아서 해당 학점을 출력합니다.
		// if문을 이용하지 않습니다. 배열을 이용합니다.
		// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
		
		char [] grade = { 'F', 'F' , 'F' , 'F' , 'F' , 'F' , 'D' , 'C' , 'B' , 'A' , 'A' };
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요(0~100) : ");
		int score = Integer.parseInt(sc.nextLine());
		// 문자랑 숫자를 섞어서 입력받을 때 모두 정수로 변환시켜주니까 씀 안써도 될땐 안써도 됨
		// nextInt 써도 되는데 장기적으로 봤을 때 문자열로 받고 정수로 바꾸라는 것 같음
		int index = score / 10; //컴퓨터는 0부터 시작하니까 0부터 세셈!!!!!!!!!!!!
		
		System.out.println("입력한 점수의 학점은 "+ grade[index]+"입니다"); 
		// 배열의 첨자는 정수이므로 변수를 사용할 수도 있고 연산식을 넣어서 사용할 수도 있습니다.
		// ex) System.out.println("입력한 점수의 학점은 "+ grade[score / 10]+"입니다"); << 가능

		
		
		
		
	}

}
