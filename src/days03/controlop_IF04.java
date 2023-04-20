package days03;

public class controlop_IF04 {

	public static void main(String[] args) {

		int a = 86; //정수 하나를 입력받은 셈으로 변수 생성, 정수 하나 저장하였습니다
		
		//90이상 A학점, 80~89 B학점, 70~79 C학점, 60~69 D학점, 60미만 F학점
		if(a>=90)System.out.println("A학점");
		else if ( a>=80&&a<90)System.out.println("B학점");
		else if ( a>=70&&a<80)System.out.println("C학점");
		else if ( a>=60&&a<69)System.out.println("D학점");
		else System.out.println("F학점");
		
		//-----------------------------------------------------------------------------
		if(a>=90)System.out.println("A학점");
		else if ( a>=80)System.out.println("B학점");
		else if ( a>=70)System.out.println("C학점");
		else if ( a>=60)System.out.println("D학점");
		else System.out.println("F학점");
		
		//잘못 사용한 예-----------------------------------------------------------------
		if(a<60)System.out.println("F학점");
		else if(a>=60)System.out.println("D학점");
		else if(a>=70)System.out.println("C학점");
		else if(a>=80)System.out.println("B학점");
		else System.out.println("A학점");

		//올바른 예---------------------------------------------------------------------
		if(a<60)System.out.println("F학점");
		else if(a<70)System.out.println("D학점");
		else if(a<80)System.out.println("C학점");
		else if(a<90)System.out.println("B학점");
		else System.out.println("A학점");
		
		
	}

}
