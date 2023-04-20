package days01;

public class Print04 {

	public static void main(String[] args) {

		//  printf 안에서 %와 d,f,s 사이에 숫자 옵션을 넣어서 표시할 자릿수를 조절합니다.
		
		//정수의 자릿수 조절
		// %와 d사이에 숫자를 안 쓴 경우 : 표시될 데이터의 자릿수만큼 확보한 후 출력
		System.out.printf("정수%d정수\n",123);
		// %와 d 사이에 숫자를 쓴 경우 : 쓴 숫자만큼 자리 확보 후 출력데이터 출력
		// 만약 자리가 모자르다면 자동 자리추가. 자리가 남는다면 공백을 채워 출력합니다.
		System.out.printf("정수%3d정수\n",12345);
		System.out.printf("정수%10d정수\n",12345);
		// 내가 출력하고자하는 숫자보다 자릿수가 좁을 때에는 자동으로 자리가 추가되어 숫자가 출력되지만,
		// 내가 출력하고자하는 숫자보다 자릿수가 남을때는 빈칸으로 출력된다는 뜻
	
		// 소수점 자리를 맞춰서 출력하기 위해 같은 숫자 옵션을 지정하여 사용하는게 보통입니다.
		System.out.printf("정수%10d정수\n",15);
		System.out.printf("정수%10d정수\n",145);
		System.out.printf("정수%10d정수\n\n",12345);
		// 출력될 자리 확보 후 왼쪽 정렬
		System.out.printf("정수%-10d정수\n",12345);
		System.out.printf("정수%-10d정수\n",345);
		
		
		// 문자의 자릿수 조절
		// 정수(%d)와 사용방법이 유사합니다.
		// 숫자를 안 쓴 경우 : 출력데이터만큼 자리 확보
		System.out.printf("문자:%s꽃이 피었습니다\n","무궁화");
		// 숫자를 썼지만 자리가 모자른 경우 : 필요한 만큼 자동으로 자리 추가
		System.out.printf("문자:%2s꽃이 피었습니다\n","무궁화");
		// 숫자를 써서 자리가 남는 경우 : 공백으로 자동 채움
		System.out.printf("문자:%10s꽃이 피었습니다\n","무궁화");
		//왼쪽정렬
		System.out.printf("문자:%-10s꽃이 피었습니다\n\n","무궁화");
		
		
		// 실수의 자릿수 조절
		// 조절 숫자를 안 쓴 경우 : 소수점 윗자리는 필요한 만큼 자리 확보, 아랫자리는 무조건 6자리 확보후 남으면 0으로 채워짐
		System.out.printf("실수%f실수\n",123.123);
		// 조절 숫자를 쓴 경우
		// %10.2 : 총 10자리(정수+소수점자리,소수점아랫자리 포함)를 확보 후 소수점 한 자리 & 소수점 아래 2자리로 할당. 
		//             = 따라서 소수점 윗자리는 7자리
		//             소수점 윗자리가 남으면 공백으로 채움. 소수점 아랫자리가 남으면 0으로 채움
		//             소수점 윗자리가 모자르면 정수처럼 필요한 만큼 추가됨, 아랫자리가 모자르면 정해놓은 자릿수까지 표시되고 그 자릿수로 반올림됨
		System.out.printf("실수%10.4f실수\n",123.12);
		System.out.printf("실수%3.1f실수\n",123.12);
		System.out.printf("실수%-10.2f실수\n",123.1234);//왼쪽 정렬. 왼쪽정렬은 -로 앞쪽에 표기
		System.out.printf("실수%.2f실수\n",123.1234);//아랫자리 모자라기 때문에 자동 반올림
	}

}
