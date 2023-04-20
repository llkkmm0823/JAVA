package days03;

import java.util.Scanner;

public class controlop_IF01 {

	public static void main(String[] args) {
		
		// 정수를 하나 입력 받아서 그 정수가 짝수이면 "짝수입니다', 홀수이면 "홀수입니다"라고 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : " );
		int num = sc.nextInt();
		
		int a = num%2;
		boolean b = a==0;
		// true / false가 선택 저장될 연산 ==, !=, > .. 등 이지만
		// 짝수입니다 / 홀수입니다 를 선택저장할 연산은 현재 없음
		// 그걸 가능하게 해주는 명령 -> if
		
		// 관계(비교)연산의 결과에 의해서 지정한 명령(들)을 실행할지 하지 않을지를 결정하는 명령
		if(a==0){
		 System.out.println("짝수입니다");
		}
		// 관계(비교)연산 또는 그 결과값(논리값)은 ()괄호안에, 실행할지 하지 않을지를 결정하는 명령들은 {}중괄호 안에 넣기
		if(a==1) {
		 System.out.println("홀수입니다");
		}
		
		// if문의 특징
		// ()안의 연산의 결과 또는 값이 true이면 {} 안의 명령을 실행, false이면 실행하지 않는 명령
		// ()안의 값이 true이면 실행해야 할 명령이 두 개 이상일 수 있으므로,
		// {}로 그 경계를 구분_실행하거나 실행하지 않을 영역 구분
		// ()안의 값이 true일 때 실행할 명령이 한 개라면, 중괄호{} 생략가능
		// 만약 ()안에 일부러 true를 썼다면 -> if(true){} _{}안의 내용은 무조건 실행됨
		// 반대의 경우 if(false){} 무조건 {}안의 내용을 실행하지 않고 건너뜀
		// ()안에는 비교연산과 논리연산이 조합된 복합연산식 표현이 가능
		// ㄴ if((x==0&&(y!=0)||(z==0)){}
		// ()안에는 비교연산대신 true / false 값을 갖고 있는 boolean 변수도 기입 가능
		
		boolean result = a == 0;
		if(result)
			System.out.println("짝수입니다");
		if(num%2==0)System.out.println("짝수입니다");
		if(result == true)System.out.println("짝수입니다");
		
		if(result == false)System.out.println("홀수입니다");
		if(!result)System.out.println("홀수입니다");
		// a==0의 결과가 false일 때 if에 귀속된 명령실행
		if(num%2!=0)System.out.println("홀수입니다");
		if(a%2==0)System.out.println("홀수입니다");
		if(a!=0)System.out.println("홀수입니다");

		


		
		
		

	}

}
