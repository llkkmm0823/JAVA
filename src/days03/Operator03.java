package days03;

public class Operator03 {

	public static void main(String[] args) {
		
		// 관계연산자(비교연산자)
		// 좌항기준 > (초과), <(미만), >=(이상≥), <=(이하≤), ==(같다), !=(같지않다)
		// 좌항과 우항의 크기르 비교하여 true/false 값이 결과가 되는 연산
		// 관계식이 올바른 경우 true, 관계식이 틀린 경우 false가 연산의 결과가 됨
		// n++ -> 단항연산              n1 < n2 -> 이항연산 (다항연산)
		
		int n1 = 10;
		int n2 = 5;
		boolean result; // true/false를 저장할 수 있는 변수
		
		result = n1 > n2;
		// n1 변수의 값이 n2 변수의 값보다 크면 true, 작으면 false 값이 저장됨
		System.out.printf("%d>%d -> %b\n",n1,n2,result);
		
		result = n1<n2;
		System.out.printf("%d<%d -> %b\n",n1,n2,result);
		
		result = n1>=n2; // 크거나 같다 = 같아도 참, 커도 참
		System.out.printf("%d>=%d -> %b\n",n1,n2,result);
		
		result = n1<=n2;
		System.out.printf("%d>=%d -> %b\n",n1,n2,result);
		
		result = n1==n2;
		System.out.printf("%d==%d -> %b\n",n1,n2,result);
		
		result = n1!=n2;
		System.out.printf("%d!=%d -> %b\n",n1,n2,result);

		System.out.println();
		//문자(char)데이터의 비교 : 각 데이터가 갖는 아스키(ASCII)코드 값으로 비교
		//문자와 호환성이 있는 숫자 -> 아스키코드 _ 문자를 숫자로 변경한 표준 코드 체계

		char c1 = 'A', c2='B';
		
		result = c1>c2;
		System.out.printf("%c>%c -> %b\n", c1,c2,result);
		result = c1<c2;
		System.out.printf("%c<%c -> %b\n", c1,c2,result);
		result = 'C'=='C';
		System.out.printf("%c==%c -> %b\n", 'C','C',result);
		result = 'C'!='C';
		System.out.printf("%c!=%c -> %b\n", 'C','C',result);
		
		
		// String 데이터의 비교
		String s1 = "1234";
		String s2 = "987";
		// result = s1 > s2; 에러 _ 문자들끼리의 크기 비교를 하는 연산자가 아님 <, >로 계산할 수 없음
		// result = s1 == s2; //동작에는 에러가 없으나 글자들의 비교가 일어나지 않음
		// result = s1 != s2; //동작에는 에러가 없으나 글자들의 비교가 일어나지 않음

		int r = s1.compareTo(s2);
		//string 데이터를 비교하는 .comareTo();
		System.out.printf("%s > %s => %d\n",s1,s2,r);
		
		result = s1.equals(s2);//둘이 같으면 true, 다르면 false
		System.out.printf("%s==%s=> %b\n",s1,s2,result);
		
		s2 = "1234";
		result = s1.equals("1234");
		System.out.printf("%s==%s=>%b\n",s1,s2,result);
		
		// String을 대상으로 할 수 있는 비교연산은 ==와 != 둘밖에 없으며, 이 마저도 우리가 원하는 결과로 연산되지 않음
		// 그래서 ==와 !=연산이 에러없이 가능은 하지만 이도 사용은 하지 않음
		
		// s1과 s2는 String 자료형이며, 다른 기본 자료형과 다르게 이 두 변수가 직접 문자들을 저장하고 있지 않음
		// 문자들은 별도의 장소에 저장되고, 변수는 저장위치값만 저장함
		// 따라서 변수들 간의 비교(s1>s2)는 저장위치정보의 비교이므로 연산이 의미가 있지도 않고 가능하지도 않음
		
		// String 자료 간의 비교는 별도로 만들어져 있는 도구를 이용
		// String 의 크다 작다를 판단해주는 compareTO()_양수/음수로 나옴
		// ㄴcompareTo 를 사용한 결과는 앞선 항의 글자에서 뒷항의 글자를 뺀 결과가 정수형태로 나옴
		// ㄴ앞이 크면 양수, 뒤가 크면 음수의 값 _ 두 글자의 아스키코드의 차 값으로 계산됨
		// ㄴ두 String이 같을 경우 결과는 0이 나옴
		// String의 같다 다르다를 판단해주는 equals() _true/false의 값
		
		
	}

}
