package days02;

public class Variable01 {

	public static void main(String[] args) {

		// 35 + 38 = 73
		System.out.println(35 + "+" + 38 + "=" + (35+38));
		System.out.println(35 + "-" + 38 + "=" + (35-38));
		System.out.println(35 + "x" + 38 + "=" + (35*38));
		System.out.println(35 + "/" + 38 + "=" + (35/38.0));
		
		// 변수(Variable) : 프로그램 실행 중 발생 또는 입력되는 데이터를 저장할 목적으로 만든 임시 저장장소
		// 프로그램 생성명령 실행 시 생성되고, 프로그램 종료 시 소멸됩니다.
		
		int a; // a라는 이름의 변수를 생성 ( 정수를 저장하기 위한 변수 )
		// int : 정수를 저장할 공간을 생성하는 명령
		// a : 생성된 변수를 프로그램 내에서 지칭하는 이름
		int b; // b라는 이름의 변수를 생성 ( 정수를 저장하기 위한 변수 )
		int plusResult,minusResult,multiplyResult; // 한 번에 여러 변수를 생성 ( 정수를 저장하기 위한 변수 )
		double divideResult;  //divideResult라는 이름의 변수 생성 ( 실수를 저장하기 위한 변수 )
		String n;
		
		//변수의 이름을 만드는 규칙
		/* 인터넷 사이트의 회원가입 시 만드는 아이디 이름 규칙과 비슷
		 * 영문과 숫자, 그리고 일부 특수문자(_)를 섞어서 사용가능
		 * 첫 글자는 반드시 영문으로 사용
		 * 중간에 공백이 있을 수 없음
		 * 너무 짧지 않게 약간의 의미를 부여해서 이름을 생성하는 편
		 * 변수의 이름이 너무 짧으면, 변수의 갯수가 많아졌을 때 서로의 용도를 구분하기 어려움
		 * 변수의 이름이 너무 길면, 사용할 때 마다 그 긴 이름을 다 타이핑해야만 하는 불편함 존재
		 * 두 가지 의미의 단어가 조합되어 변수 이름이 만들어 진다면 첫 단어는 소문자로, 두 번째 단어는 첫 글자 대문자로 생성
		 * ex) plusResult : 덧셈의 결과를 저장할 변수 이름
		 * 변수는 자료형(정수,실수,문자)에 따라 만드는 명령이 다름
		 * int : 정수 / double : 실수 / String : 문자 등
		 * int a; // 정수형 변수 a가 생성
		 * double b; // 실수형 변수 b
		 * String c; // 문자형 변수 c _ 앞글자가 혼자 대문자인 이유 : 형식임 그냥 외워......
		 */

		
		a = 10;
		// 직접 값을 넣을 때. 이 명령이 실행된 이 후로 a 변수에 다른 값이 다시 저장되거나 프로그램이 종료되기 전까지는 10이라는 값이 보관됨.
		// = <- 같다의 뜻X 오른쪽에 있는 데이터를 왼쪽에 넣어라 라는 뜻
		
		// 정수형 데이터는 4바이트, 실수형 데이터는 8바이트까지 저장 가능
		b = 10123; // 실수를 정수형 변수에 저장하면서 데이터 손실을 유발하므로 에러
		divideResult = 100; // 정수를 실수형 변수에 저장하는 건 데이터 손실이 없으므로 정상 실행됨
		
		boolean b1; // 참(true) 또는 거짓(false) 중 하나를 저장하는 자료형(변수)
		b1 = true; // 또는 false 를 저장할 수 있습니다.
		
		System.out.printf("변수 b1의 값 : %b\n",b1);
		System.out.println("변수 b1의 값 :"+b1);
		//boolean 자료를 printf로 출력할 때 %b를 사용
		
		// int - 정수형 자료형 4 Byte형 정수
		// long - 정수형 자료형 8 Byte형 정수
		// float - 실수형 자료형 4 Byte형 실수
		// double - 실수형 자료형 8 Byte형 실수
		// char (캐릭터) - 문자(글자) 자료형 ",'a','b'    2 Byte - String과 다름
		// String - 문자열 자료형 "","a","abc" 0글자에서 글자갯수 제한 없이 저장할 수 있는 자료형
		// ㄴString은 현재는 자료형이라고 부르지만 엄밀히 자료형이라기보다 클래스(객체)라고 부르는게 정확한 표현
		
		// 저장용량 단위 - 1과 0중 하나를 저장할 수 있는 단위  1 bit
		// 1 bit는 1과 0중에 하나를 저장할 수 있다 라고 하고, 다른 말로 2가지 정보를 표현할 수 있다.
		// 2 bit 00 01 10 11 네개중 하나를 저장 0~3 4개의 정보를 표현
		// 3 bit 000 001 010 011 100 101 110 111 여덟개중 하나를 저장 0~7 8개의 정보를 표현
		// 4 bit = 16개 5 bit = 32개 6 bit = 64개 7 bit= 128개  ~중 하나를 저장, ~개의 정보를 표현
		// ★8 bit (1 Byte) = 256개의 정보 00000000~11111111 중 한 개를 저장 0~255개의 정보를 표현★
		// 16 bit (2 Byte) = 65,536개의 정보 
		// 예전 시스템의 int - 2 Byte ( -32,768 ~32,767 )
		// 현재 시스템의 int - 4 Byte ( -2,147,483,648 ~ 2,147,483,647 )
		
		// double - 8byte 0.00002  ->  0.2 x 10의 -4승  ->  변수에 2와 -4를 값과 지수로 저장
		// double은 다른 숫자와 계산할 때, 저장할 때 변환하는 과정이 필요함, int대신 double을 쓰는 이유는 저장용량 때문
		
		char c;
		c= 'A';
		System.out.printf("변수 c의 값 : %c\n",c);
		System.out.println("변수 c의 값 : "+c);
		
		String s;
		s = "ABCD";
		System.out.printf("변수 s의 값 : %s\n",s);
		System.out.println("변수 s의 값 : "+s);
		
		a=16;
		b=52;
		c='+';  //변수에 값을 보관
		
		//plusResult = 16+52;
		plusResult = a+b;  // 변수를 이용해서 연산을 하고, 결과를 또 다른 변수에 저장
		
		System.out.printf("%d%c%d=%d\n",a,c,b,plusResult);
		
		c = '-'; // 무언가 보관된 변수에 새로운 값을 다시 넣으면 이전 값이 사라지고 현재 넣은 값이 새롭게 보관됨
		minusResult = a-b;
		System.out.printf("%d%c%d=%d\n",a,c,b,minusResult);
		c='x';
		multiplyResult = a*b;
		System.out.printf("%d%c%d=%d\n",a,c,b,multiplyResult);
		c='÷';
		divideResult = a/b;
		System.out.printf("%d%c%d=%f\n",a,c,b,divideResult);
		//정수와 정수의 사칙연산은 결과도 정수, 실수변수로 들어가면서 소숫점이 나옴
		divideResult = a/(double)b;
		System.out.printf("%d%c%d=%f\n",a,c,b,divideResult);
		//피 연산자 둘 중 하나만 실수이면 연산의 결과는 실수가 됨
		// (double)_캐스팅연산 : 현재 위치에서 잠시 double로 변환. 이 명령이 지나면 다시 int형으로.
		
		// 위의 네개의 출력을 println으로 바꿔서 출력하세요.
		a=16;
		b=52;
		c='+';
		
		plusResult = a+b;
		System.out.println(a+""+c+""+b+"="+plusResult);
		c = '-';
		minusResult = a-b;
		System.out.println(a+""+c+""+b+"="+minusResult);
		c='x';
		multiplyResult = a*b;
		System.out.println(a+""+c+""+b+"="+multiplyResult);
		c='÷';
		divideResult = a/b;
		System.out.println(a+""+c+""+b+"="+divideResult);
		System.out.println(a+""+c+""+b+"="+(int)(divideResult * 100) / 100.0);
		
		
		// 64.66666
		// 64.66666 * 100  -> 6466.666
		// (int)6466.66 -> 6466
		// 6466 / 100 -> 64.66
		
		// (int)(64.66666666666 * 100) /100.0;
		// (int)(divideResult * 100) /100.0;
		
		
		
		
		
		
		
		
		
	}
}
