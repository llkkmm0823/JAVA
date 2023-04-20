package days10;

// static 키워드
// 멤버변수, 멤버메서드에 적용할 수 있는 키워드
// 정적 변수(클래스의 변수),정적 메소드(클래스의 메소드)를 선언할 때 사용

//자바프로그램의 구동 과정
//         ▼   자바버추얼머신  // 운영체제에 구애받지 않고 실행될 수 있도록 하는 프로그램
// 1. JVM에 의해서 실행할 모든 클래스 중 static 메서드, static 멤버필드를 수집해서 메모리에 로딩되고, 
//     프로그램의 시작(main메서드의 실행)전에 메모리에 적재됨
// 2. 메모리에 로딩된 static 메서드 중, main 이름을 검색
// 3. main 메서드가 검색되었다면 JVM의 해당 main메서드를 호출하려 프로그램을 시작


// static 변수 / 메서드 특징
// 프로그램 실행 전 부터 메모리에 자리를 확보하고 실행되기를 기다리는 변수/ 메서드

//static 이 아닌 변수 / 메서드 특징
//Student std = new student() 와 같은 객체 생성 명령이 있어야 
//객체 안에 만들어지고 호출 가능상태가 되는 변수/ 메서드


class StaticA{
	int num; // 인스턴스 변수 - 멤버변수이면서 static이 아닌 변수(동적 멤버변수)입니다
	static int number = 100; // static 변수 - 얘도 멤버변수입니다. static 멤버변수(정적 멤버변수)입니다
}// 이 영역을 제외한 모든 공간이 클래스 외부임

public class Class22 {

	public static void main(String[] args) {
		
		// 1. 인스턴스 변수는 반드시 객체가 만들어진 이후에만 사용이 가능합니다
		StaticA s1 = new StaticA();// 객체 생성과는 무관
		s1.num = 1000;
		System.out.println("s1 객체의 인스턴스 멤버변수 num :  "+s1.num);
		// 2. static 멤버 변수는 객체의 생성 유무와 전혀 상관없이 그 변수를 사용할 수 있습니다
		System.out.println("staticA클래스의 static 멤버변수 number :  "+StaticA.number);
		// 스태틱 변수는 main메서드 실행 전, 객체 생성 전 미리 생성되어 있는 변수이며 
		// 수시로 생성되는 객체와는 독립적이면서 클래스에는 종속적으로 사용하도록 생성됩니다.
		// 객체를 생성하지 않고도 사용할 수 있는 클래스의 멤버변수 입니다.
		// 다만 "클래스외부"에서 static변수에 접근하려면 위와 같이 클래스 이름과 함께 사용합니다.(클래스이름 아님) _StaticA.number
		
		// Math.random();  //Math클래스 안에 정의된 static 메서드 random();
		
		// 3. 인스턴스 변수는 객체 생성 대 마다 각각의 객체안에 만들어져서 객체의 갯수만큼 생성되지만,
		// 스태틱변수는 프로그램 전체를 통틀어 한개만 만들어지고
		// 그 값도 객체와 상관없이 현재값이 변경 전 또는 프로그램 끝날 때까지 유지됩니다.
		StaticA a2 = new StaticA();
		a2.num = 200;
		System.out.println("a2 객체의 동적 멤버변수 값 : "+a2.num);
		StaticA a3 = new StaticA();
		a3.num = 300;
		System.out.println("a3 객체의 동적 멤버변수 값 : "+a3.num);
		
		StaticA.number = StaticA.number+50; // 스태틱 변수값의 변경
		System.out.println("StaticA클래스의 static 멤버변수 값 : "+StaticA.number);
		
		// 4. 인스턴스 변수와 마찬가지로 private으로 보호되지 않았다면 아래와 같이 임의 접근이 가능하고
		StaticA.number =10;
		System.out.println("StaticA클래스의 정적 멤버변수 값 : "+StaticA.number);
		//private로 보호된 static변수는 getter와 setter를 static으로 따로 제작해서 값을 저장하거나 얻어냄
		//static이 아닌 인스턴스 메서드에서는 static멤버변수/메서드 접근이 "불가능" 합니다


		


		
	}

}
