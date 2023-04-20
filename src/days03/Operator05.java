package days03;

public class Operator05 {

	public static void main(String[] args) {

		// 자료의 형 변환 연산 & 캐스팅 연산
		
		// 캐스팅연산 : 서로 호환이 가능한 자료끼리 자료의 형변환을 하려고 할 때 사용
		// 작은 용량의 자료값을 큰 용량의 변수에 넣는 것은 아무 조치없이 가능하지만 반대의 경우 캐스팅 연산이 필요함
		
		
		//정수들 간의 캐스팅
		byte b1 = 10; // 큰 용량(int)값을 작은 용량(byte) 변수에 넣으면 에러가 발생해야 하지만
		// 변수 값이 아닌 순수 정수자료는 캐스팅 없이 입력이 가능함
		int a = 10;
		// b1 = a; // 단순 정수자료가 아닌 변수 값은 에러 발생
		b1 = (byte)a; // 용량이 큰 변수값을 용량이 작은 변수에 넣을 때 캐스팅 연산 필요

		byte b2 = 30;
		// byte b3 = b1 + b2; //에러
		// 정수(int, byte, short)들의 산술연산의 결과는 int이기 떄문에 위의 연산은 에러
		byte b3 = (byte)(b1+b2);
		
		//실수들 간의 캐스팅
		// float f1 =123.123; // 에러. 별도의 표시 없는 실수는 기본 자료형인 double 형으로 인식
		float f1 = 123.123F;
		
		double d1 = 123.123;
		// f1 = d1; // 에러
		f1=(float)d1;
		d1 = f1; // 큰 용량 변수에 작은 용량변수 값을 넣는 것은 캐스팅 없이 가능
		
		
		//실수 -> 정수, 정수->실수 서로 호환성이 존재하는 자료끼리만 캐스팅이 가능
		//실수 -> 정수
		double d2 = 1.23456;
		int a1 = (int)d2; // a1변수에 1이 저장됨
		//정수->실수
		double d3 = (double)a1; // d3변수에 1.0이 저장됨
		
		// 문자 -> 정수
		char c = 'A';
		a = (int)c; // 문자 'A'에 해당하는 아스키코드 65가 저장됨
		//정수->문자
		a = 97;
		c = (char)a; // 97 아스키코드에 해당하는 'a'글자 저장
	
		
		// String -> int
		
		
		// 잘못된 예
		String s1 = "12345" ;
		// int a4 = (int)s1; // 에러 
		int a5 =123456;
		// String s2=(String)a5; // 에러
		
		//올바른 예
		// 호환성이 없어서 캐스팅 연산이 안되는 자료들간에는 자바에서 준비해놓은 도구(메서드)가 사용됨
		// 메서드 : 서버에서 어떤 작동을 구현하고 요청을 수행할 수 있도록 만들어진 단일 요구 메세지
		String s4 = "12345";
		int a4 = Integer.parseInt(s4); //String -> int
		int a6 = 123456;
		String s5 = String.valueOf(a6); //int -> String
		
		// double -> String
		d3 = 123.1234;
		//String s3 = (String) d3; //에러
		String s3 = String.valueOf(d3); // 정상
		
		//String -> double
		s4 = "123.1234";
		//double d4 = (double)s4; // 에러
		double d4 = Double.parseDouble(s4); // 정상
	}

}
