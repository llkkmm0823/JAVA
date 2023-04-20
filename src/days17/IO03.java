package days17;

import java.io.IOException;

public class IO03 {

	public static void main(String[] args) throws IOException {
		
		//System.in 객체를 사용하여 더하기 연산을 수행하는 프로그램을 작성
		//첫 번째 정수 : 123, 두 번째 정수 : 25, 결과 : 123 + 25 = 148
		
		byte [] firstNumber = new byte[10];
		byte [] secondNumber = new byte[10];
//		배열 자료형이 byte라는건 한 칸에 128~127까지 입력이 가능하냐는 말인데
//		우리는 System.in.read로 읽어낸 내용을 저장할 예정이므로
//		한 칸 들어가는 값은 입력받은 문자의 아스키코드들이 됨
		
		System.out.print("첫 번째 정수 : ");
		int size1 = System.in.read(firstNumber);
		System.out.print("두 번째 정수 : ");
		int size2 = System.in.read(secondNumber);
		
		System.out.println("size1 :  "+size1);
		for(int i=0;i<size1;i++)
			System.out.printf("%c",(char)firstNumber[i]);
		System.out.println("size2 :  "+size2);
		for(int i=0;i<size2;i++)
		System.out.printf("%c",(char)secondNumber[i]);

		// |6|7|5|1|2| - 입력된 글자
		// |0|1|2|3|4| - 배열의 인덱스
		// firstNumber[4]*1  firstNumber[3]*10  firstNumber[2]+100  firstNumber[1]*1000  firstNumber[0]*10000		
		// 첨자는 4 3 2 1 0 순서로 진행되고, 곱할 숫자는 1 10 100 1000 10000 순서로 진행되는 반복실행문을 사용
		// 글자수 5개, size는 7, 맨 마지막 다섯번 째 글자(첨자로는 네 번째) 부터 반복이 실행되면 7(size)-3부터 시작
		int m =1; 
		int n1 =0;
		for(int i = size1-3;i>=0;i--) { // i는 글자갯수-3부터 0까지 진행됨
	//왜오류???????????????	n1 += (firstNumber[i] - '0')*m; // 설정된 i변수를 첨자로 숫자와 m을 곱함
		// 현재 firstNumber에 저장된 값은 아스키코드, -'0'을 해줌으로써 int화
		System.out.printf("firstNumber[%d]-%d\t", i ,firstNumber[i]-'0');
		System.out.printf("%d x %d => %d\t", i ,firstNumber[i]-'0', m ,(firstNumber[i]-'0')*m);
		System.out.println(n1);
		m=m*10; // 1부터 10씩 매 반복마다 곱함
		}
		System.out.println("최종 계산결과 : " +n1);
		
		m =1; 
		int n2 =0;
		for(int i = size2-3;i>=0;i--) { // i는 글자갯수-3부터 0까지 진행됨
		n2 += (secondNumber[i]-'0')*m; // 설정된 i변수를 첨자로 숫자와 m을 곱함
		// 현재 firstNumber에 저장된 값은 아스키코드, -'0'을 해줌으로써 int화
		System.out.printf("secondNumber[%d]-%d\t", i ,secondNumber[i]-'0');
		System.out.printf("%d x %d => %d\t", i ,secondNumber[i]-'0', m ,(secondNumber[i]-'0')*m);
		System.out.println(n2);
		m=m*10; // 1부터 10씩 매 반복마다 곱함
		}
		System.out.println("최종 계산결과 : " +n2);
		
		System.out.println();
		System.out.printf("%d +",n1);
		System.out.printf("%d =",n2);
		System.out.println((n1+n2));




}
}
