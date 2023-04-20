package days03;

public class Operator04 {

	public static void main(String[] args) {
		
		// 논리연산자 &&(AND), ||(OR), !(NOT)
		// 둘 이상의 관계(비교)연산식의 결과(true/false)값 또는 boolean 값을 연산하여 하나의 boolean값을 결과로 얻는 연산
		// 피연산자 : boolean , 연산의 결과 : boolean
		
		// && : 두 항이 모두 true이어야 결과가 true, 둘 중 하나가 false이면 결과는 false
		// || : 두 항이 모두 false이어야 결과가 false, 둘 중 하나가 true이면 결과는 true
		// ! : 단항연산 - 피연산자의 true / false 값을 반대로 바꾸는 연산
		
		boolean b1;
		b1=true&&false;
		System.out.printf("%b&&%b -> %b\n",true,false,b1);
		
		int a = 80;
		boolean b2 = a>50;
		boolean b3 = a<=100;
		
		b1=b2&&b3;
		System.out.printf("b2&&b3 -> %b\n",b1);
		b1= (a>50)&&(a<=100); //50<a<=100  이케 하면 안됨XXX
		System.out.println("a>50이면서 a<100 : " +b1);

		// a 변수의 값이 70보다 크거나 40보다 작으면 true, 아니면 false 출력
		b1 = (a>70)||(a<40);
		System.out.println("70>a 이거나 a<40 : "+b1);
		a = 50;
		b1 = (a>70)||(a<40);
		System.out.println("70>a 이거나 a<40 : "+b1);
		
		// AND 연산자(&&)
		// 좌항과 우항의 관계(비교)식 결과 또는 boolean 값이 모두 true 인 경우 true가 결과값
		// 좌항과 우항 중 하나라도 false인 경우 false가 결과값
		// 좌항의 비교연산 결과가 false인 경우 우항의 식을 비교하지 않음
		System.out.printf("F&&F = %b\n",false&&false);
		System.out.printf("T&&F = %b\n",true&&false);
		System.out.printf("F&&T = %b\n",false&&true);
		System.out.printf("T&&T = %b\n",true&&true);
		
		// OR 연산자(||)
		// 좌항관계식 결과 또는 boolean 값이 하나라도 결과가 true인 경우 true가 결과
		// 좌항과 우항 모두 false인 경우 false가 결과
		// 좌항의 경과가 true인 경우 우항의 식을 비교하지 않음
		System.out.printf("F||F=%b\n",false || false);
		System.out.printf("T||F=%b\n",true || false);
		System.out.printf("F||T=%b\n",false || true);
		System.out.printf("T||T=%b\n",true || true);
		
		// NOT 연산자(!)
		// 단항 연산자, 피연산자의 논리값의 반대값을 결과로 냄 false->true    true->false
		b1 = false;
		System.out.printf("NOT(!)%b = %b\n", b1,!b1);
		System.out.printf("NOT(!)%b = %b\n", true,!true);

		// 점수가 80점이상이면서 90이하이면 true, 아니면 false 출력
		int number = 85;
		boolean result = (number>=80)&&(number<=90);
		System.out.printf("80이상이면서 90이하 result = %b\n", result);
		
		// 점수가 100이상이거나 50 미만이면 true, 아니면 false (이거나, 또는 )
		number = 150;
		result = (number>=100)||(number<50);
		System.out.printf("100이상 또는 50미만 result = %b\n",result);
		
		int kor=35 , eng=98 , mat=95;
		double avg;
		
		//평균이 80 이상이면서 영어점수가 75 이상이고, 국어 점수가 80 이상이면 true 아니면 false 출력하기
		avg = (kor+eng+mat)/3;
		boolean result1 = (avg>=80)&&(eng>=75)&&(kor>=80);
		System.out.printf("평균이 80 이상이면서 영어점수가 75 이상이고, 국어 점수가 80 이상 result = %b\n", result1);
		
		//국어 50 이상 영어 60이상 수학 70 이상이면 true 아니면 false 출력하기
		boolean result2 = (kor>=50)&&(eng>=60)&&(mat>=70);
		System.out.printf("국어 50 이상 영어 60이상 수학 70 이상 result = %b\n", result2);
	
		//세 과목 중 한 과목이라도 40미만이면 true, 모두 40이상이라면 false 출력하기
		boolean result3 = (kor<40)||(eng<40)||(mat<40);
		//result = !( (kor>=40)&&(eng>=40)&&(mat>=40)); // result는 국어 영어 수학이 40이상이 아니다!라는 뜻
		System.out.printf("세 과목 중 한 과목 또는 그 이상의 과목이 40미만 result = %b\n", result3);

		//평균 60이상 모든 과목 40 이상이라면 true 아니면 false (논리연산 대상이 4개)
		result=(avg>=60)&&(kor>=40)&&(eng>=40)&&(mat>=40);
		System.out.printf("평균 60이상 모든 과목 40 이상 : %b\n",result);
		
		//평균 60 미만 이거나 한 과목이라도 40 미만이라면 true 아니면 false (논리연산 대상이 4개)
		result=(avg<60)||(kor<40)||(eng<40)||(mat<40);
		System.out.printf("평균 60 미만 이거나 한 과목이라도 40 미만 : %b\n",result);
		
		//평균이 70이상이거나 영어와 수학이 모두 80이상이면 true 아니면 false  (And와 Or의 혼합연산)
		result=(avg>=70)||((eng>=80)&&(mat>=80));
		System.out.printf("평균이 70이상이거나 영어와 수학이 모두 80이상 : %b\n",result);
		
		// 국어점수가 짝수라면 true 홀수라면 false
		int n = kor%2; //짝수라면 2로 나누어 떨어지기 때문에 나머지가 발생하지 않을 것, 발생하면 홀수일 것
		result = n==0;
		result= (kor%2)==0;
		System.out.printf("국어점수가 짝수? : %b\n",result);
		// 연산의 우선순위
		// 1. () 괄호
		// 2. 피연산자 앞에 있는 ++,--
		// 3. 곱셈, 나눗셈, 나머지(%)
		// 4. 덧셈, 뺄셈
		// 5. 관계연산( 비교연산 )
		// 6. 논리연산_ 프로그램에 따라 관계 연산과 논리연산이 동일 순서 취급당하기도 함
		// 7. =
		
		//순서를 역행하고 싶으면 괄호치셈.
		//배수를 계산하고 싶으면 % 활용. ex) 3의 배수이면 나머지가 0일 것이고 아니라면 1일 것
		
		// year변수에 저장된 년도가 윤년이면 true, 평년이면 false를 출력
		int year1 = 2020, year2 = 2023;
		//윤년의 조건 : 해당년도가 4의 배수이면서, 100의 배수가 아니거나, 400의 배수인 해
		
		int x = year1%4;
		int y = year1%100;
		int z = year1%400;
		
		result = (x==0)||(y!=0)&&(z==0);
		System.out.println("2020년은 윤년 ? : "+result);
		
		result = (year2%4==0)&&(year2%100!=0)||(year1%400==0);
		// result = (year2%4==0)&& !(year2%100=0)||(year1%400==0); 라고 쓰기도 함(반댓값으로)_!활용
		System.out.println("2023년은 윤년 ? : "+result);

		
		
		
		
		
	}

}
