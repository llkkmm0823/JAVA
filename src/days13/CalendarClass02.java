package days13;

import java.util.Calendar;

public class CalendarClass02 {
	static String [] weekday = { "","일","월","화","수","목","금","토"};

	public static void main(String[] args) {

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		// date1 달력 객체의 오늘 날짜를 2015년 8월 15일로 설정
		date1.set(2015,8,15);
		// set : 원하는 특정 날짜로 객체 내 날짜 구성을 재 설정, date2는 아직 오늘 날짜
		
		// set 메서드에 필드명과 값을 넣어주면 해당 필드 값만 변경됨
		date2.set(Calendar.MONTH,6); //월만 7월로 바뀜

		// 위 date1과 date2에 설정된 날짜를 "0000년 0월 0일 0요일" 형식으로 출력해 주세요
		// System.out.println()안에 한 번에 구성해서 출력해 주세요
		
		
		prnDate(date1);
//		int y =date1.get(Calendar.YEAR);
//		int m =date1.get(Calendar.MONTH);
//		int d = date1.get(Calendar.DATE);
//		int i = date1.get(Calendar.DAY_OF_WEEK);
//		int w =date1.get(Calendar.DAY_OF_WEEK_IN_MONTH);
//		System.out.println(y+"년"+m+"월"+d+"일"+weekday[i]+"요일");
		
		prnDate(date2);
//		int y =date2.get(Calendar.YEAR);
//		int m =date2.get(Calendar.MONTH);
//		int d = date2.get(Calendar.DATE);
//		int i = date2.get(Calendar.DAY_OF_WEEK);
//		int w =date2.get(Calendar.DAY_OF_WEEK_IN_MONTH);
//		System.out.println(y+"년"+m+"월"+d+"일"+weekday[i]+"요일");

	}
	public static void prnDate( Calendar c ) { // 스태틱을 쓰는 이유 : main에서 호출할 것이기 때문
		System.out.println( c.get(Calendar.YEAR)+"년"
				+c.get(Calendar.MONTH)+"월"
				+c.get(Calendar.DATE)+"일"
				+weekday[c.get(Calendar.DAY_OF_WEEK)]+"요일");
	}

}
