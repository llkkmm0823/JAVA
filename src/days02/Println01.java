package days02;

public class Println01 {

	public static void main(String[] args) {

		System.out.println(10); // 정수 10 출력
		System.out.println(12.123); // 실수 12.123 출력
		System.out.println("Java Programming"); // 문자 String 출력
		// printf 는 따옴표안에서 출력할 내용을 입력하여 출력되나
		// println은 따옴표 없이 출력이 가능하며 줄바꿈도 자동으로 됨 (\n없이)
		
		// System.out.println()은 System.out.prinf("\n")와 같은 동작을 합니다
		// println은 \n이 없어도 모든 출력 후 줄바꿈을 한 번 실행해 줍니다.
		// System.out.println("\n"); <- 두 줄바꿈
		// printf 와 같이 format 양식 글자(%d, %f 등)를 사용하지 못합니다.
		// 다만 printf보다 출력이 간단합니다.
		
		// 1 홍길동 89 87 56 250 85.0
		System.out.println("1 홍길동 89 87 56 250 85.0");
		
		System.out.println(10 + 12.123);
		System.out.println(10 +"_" + 12.123);
		// 따옴표 안에서 구성하지 못하기 때문에 하나의 항목으로 구성하여 출력해야함 ("_")
		// '+' = 숫자끼리 연산은 산술연산, 문자와 다른 자료형의 연산은 이어붙이기 연산이 실행됩니다.
		// 10+"_" -> "10_" 가 됨, "10_" + 12.123 - > "10_12.123"
		// 문자+문자 = 문자문자 , 문자 + 숫자 = 문자숫자 , 숫자 + 숫자 = 계산 결과 , 숫자 + "숫자" =숫자숫자
		
		// 문자와 숫자가 다른점
		// 1. 표면상으로 그 둘은 따옴표 안에 쓰였냐 아니냐로 구분합니다.
		// 2. 123은 백이십삼이라고 읽지만, "123"은 일이삼이라고 읽습니다.
		// 3. 987은 1234보다 작지만, "987"은 "1234"보다 크다 라고 말합니다.
		//   - 문자들간의 비교는 첫 글자부터 하나씩 같은 위치의 글자와 비교합니다.
		//   - 첫 글자에서 크기가 결정되면 그 다음은 비교하지 않습니다.
		//   - 두 번째 글자를 비교하는 경우는 첫 번째 글자가 같은 글자일 때 한해서만 비교합니다.
		//   - 두 번째 글자도 같은 글자라면 세 번째 글자를 비교합니다.
		//   - 사전에서 찾았을 때 먼저 나오는 글자를 작다라고 하고 뒤에 나오는 글자를 크다라고 합니다.
		
		System.out.println();
		System.out.println("10" + "5");
		System.out.println("10" + 5);
		System.out.println(10 + "5");
		System.out.println(10 + 5); // 산술 덧셈
		System.out.println("Hello" + "World~!");
		
		// 10+5=15를 출력하고 싶을 때 쓸 수 있는 경우의 수
		System.out.println(10 + "+"+5+"="+(10+5));
		System.out.println("10+5"+"="+(10+5));
		System.out.println("10+5="+(10+5));
		System.out.println("10+5=1"+5);
		System.out.println("10+5=15");
		// 20과 30을 출력하고 싶을 때
		// 따옴표로 빈칸이라도 넣어줘야함
		System.out.println( 20 + "" + 30);
		
		

		

	}

}
