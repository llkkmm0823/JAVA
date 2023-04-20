package days13;

import java.util.Calendar;

public class CalendarClass04 {
	
	public static String dateToString(Calendar c) {
		String cDate = c.get(Calendar.YEAR)+"년"
				+(c.get(Calendar.MONTH)+1)+"월"
				+c.get(Calendar.DATE)+ "일";
				return cDate;
	}
	

	public static void main(String[] args) {
		
		Calendar date  =Calendar.getInstance();
		System.out.println(dateToString(date));
		
		
		System.out.println("=1일 후=");
		date.add(Calendar.DATE, 1);
		System.out.println(dateToString(date));
		
		System.out.println("=3개월 전=");
		date.add(Calendar.MONTH, -3); //-1월이 아닌 12월
		System.out.println(dateToString(date));
		
		// add 메서드의 증감은 하나의 요소를 변경하지만, 그로 인해 다른 필드에 영향을 줄 수 있음
		// 일을 변경하여 달이 바뀌거나, 월을 변경하여 년도가 바뀌는 변경 등
		// 음수를 입력하면 이전날짜 또는 월, 년으로 설정할 수 있음
		
		System.out.println("=30일 후=");
		date.add(Calendar.DATE, 30);
		System.out.println(dateToString(date));
		//일 뿐만 아니라 월도 변경되는 것을 확인할 수 있음
		
		System.out.println("=40일 후(roll)="); 
		// roll을 사용하면 다른건 영향주지 않고 설정한 필드의 값만 연산이 가능
		date.roll(Calendar.DATE,40);
		// 다른 필드에 영향을 주지 않고 해당 필드만으로 더하고 빼는 메서드
		// 1월 21일에서 30일 더하면 2월 21일(30일)이 되고, 이 후 10일이 더해져 다시 29 도출
		// 월에는 영향 x _ 결과 : 1월 29일
		System.out.println(dateToString(date));

		
	}

}
