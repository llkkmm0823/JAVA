package days13;

public class WrapperClass {

	public static void main(String[] args) {

		//기본 자료형(int, double, boolean 등등)을 클래스로 제작해서 필요한 멤버메서드가 같이 존재하는 클래스
		
		Integer i1 = new Integer(100);// 곧 없어지고 더 좋은 것으로 바뀔것이다 라는 뜻
		Integer i2 = new Integer(100);
		
		//참조 변수(레퍼런스 변수)들의 비교
		if(i1==i2)System.out.println("i1과 i2가 값이 같습니다");
		else System.out.println("i1과 i2가 값이 다릅니다");
		System.out.println("i1==i2 ? " + (i1==i2));
		
		System.out.println();
		//실제 인스턴스에 저장된 값들의 비교
		if(i1.equals(i2))System.out.println("i1과  i2가 값이 같습니다");
		else System.out.println("i1과 i2가 값이 다릅니다");
		System.out.println("i1.equals(i2)=" + i1.equals(i2));
		
		System.out.println("i1.compareTo(i2)="+i1.compareTo(i2));
		//실제 인스턴스에 저장된 값들의 비교 - 뺄셈연산으로 비교 앞의 숫자가 크면 양수
		//뒤의 숫자가 크면 음수반환 같으면 0반환
		
		//Object 부모클래스의 메서드 오버라이딩
		System.out.println("i1.toString()="+i1.toString());
		System.out.println("i2="+i2);
		//toString()의 리턴값은 String입니다
		
		//표현 가능한 가장 큰 값(스태틱변수)
		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
		//표현 가능한 가장 작은 값(스태틱변수)
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
		
		int i =10;
		Integer inti = (Integer)i;
		int i3 = inti + 10;
		System.out.println(i3);
		
		Integer inti2 = new Integer(20);
		System.out.println("inti2 ="+inti2);
		int i4 = (int)inti2; // 참조형을 기본형으로 형 변환도 가능(형 변환 생략가능)
		System.out.println("i4 ="+i4);



		
	}

}
