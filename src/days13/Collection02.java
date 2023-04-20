package days13;

import java.util.ArrayList;

public class Collection02 {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		//다양한 타입을 저장할 수 있는 컬렉션 클래스의 객체
		//void add(Object obj){}
		a.add(10);  //Integer
		a.add(1.1); // Double
		a.add("Hello"); // String
		
		Integer i0 = (Integer)a.get(0);
		//Integer i1 = (Integer)a.get(1); //런타임 에러 _ 문법상 문제 X 실행중 에러남
		//Double을 Integer로 캐스팅할 수 없다고 나옴
		//컬렉션 내부의 데이터를 추출하는 과정에서 일치하지 않는 타입으로 형 변환이 일어나는 경우 런타임 에러가 발생되어 프로그램 강제종료
		Double i2 = (Double)a.get(1);
		//String i2 = a.get(2); // 에러
		String i3 = (String)a.get(2);
		
		// 하나의 ArrayList에 여러 자료형을 섞어서 저장할 수 있으나 위와 같은 애로사항이 때때로 발생하므로
		// 자료형을 하나로 통일하여 저장하는 형식을 사용하게 되었음
		// 그냥 사용이 아니라 아예 규칙으로 만들어 지정한 자료형 외에 다른 자료형이 저장되지 못하도록 사용하기도 함
		ArrayList<Integer>list = new ArrayList<Integer>();
		//이를 자바 용어로 제네릭(Generic)이라고 함
		
		//이렇게 만들어진 리스트는 get()으로 자료를 꺼낼 때 강제 형 변환이 없어도 됨
		list.add(100);
		//list.add("String"); // 에러 - 다른 자료형은 저장 안됨
		Integer i = list.get(0); // 자료를 꺼낼 때 강제 형 변환을 안써도 됨
		
		// 더 쉽게 꺼내기
		list.add(200);
		list.add(300);
		for(Integer k : list) {
			System.out.printf("%d ",k);
		}
	}
}
// 컬렉션 프레임웍에서 제네릭의 사용
// 보통의 컬렉션 프레임 웍은 여러타입이 혼용되어 저장은 가능하나 실제로 혼용되어 저장되는 경우 거의 없음

// 다만, 컬렉션 클래스의 입력, 반환에 관련한 모든 메서드들은 Object타입을 기반으로 하기 때문에
// 컬렉션에서 데이터 인출(.get())시에 강제 형 변환을 해야하는 불편함이 존재
// 이러한 문제점을 해결하기 위해 JDK 1.5버전 이후에는 제네릭 문법 지원됨