package days10;

// instance 변수는 스태틱 변수값으로 초기화 O
///instance 변수를 인스턴스 변수로 초기화 O
// static 변수를 스태틱변수값으로 초기화 O
// static 변수는 인스턴스 변수값으로 초기화 X

//static 메서드는 스태틱 변수를 사용 O
//static 메서드는 인스턴스 변수 사용 X
//instance 메서드는 스태틱 변수 사용 O
//instance 메서드는 인스턴스 변수 사용 O


// instance 메서드 안에서 인스턴스 메서드 호출 O
// instance 메서드 안에서 static 메서드 호출 O
// static 메서드 안에서 인스턴스 메서드 호출 X
// static 메서드 안에서 static 메서드 호출 O


//static -> instance 만 안됨



class MemberCall{
	
	//인스턴스 변수 : 객체가 생성될 때 생성되는 변수
	int iv = 10;
	static int sv = 20;// static 변수 : 프로그램이 시작될 때 생성되는 변수
	
	int iv2 = sv; // 인스턴스 변수는 스태틱 변수값으로 초기화가 가능
	// static int sv2 = iv; // 에러. 반대로 스태틱 변수값은 인스턴스 변수값으로 초기화가 불가능
	// 맨 처음 생성되어서 끝까지 남을 스태틱(정적)변수에 언제 만들어질지 모르는 인스턴스 변수값으로 초기화하는 것은 불가능
	
	// 억지로 인스턴스 변수로 static변수를 초기화하려면
	// MemberCall mc = new MemberCall();
	// static int sv2 = mc.iv;
	static int sv2 = new MemberCall().iv;
	// 억지로라도 인스턴스(멤버)변수로 스태틱 변수의 값을 초기화하고자 한다면 위와 같은 방법을 씀
	// 레퍼런스 변수 없는 new 인스턴스를 만들어서 멤버변수 사용
	// 그러나 이 방법을 억지로 사용하지 않음
	
	static void staticMethod() {
		System.out.println(sv); // 스태틱 메서드는 스태틱 변수 사용 가능
		// System.out.println(iv); // 스태틱 메서드는 인스턴스 변수 사용이 불가능
		System.out.println(new MemberCall().iv);
		//억지로라도 스태틱 메서드가 인스턴스 필드를 사용하려면 객체를 만들고 사용가능  - 권장X
		staticMethod2(); // 스태틱 메서드에서는 스태틱 메서드 호출가능
		// instanceMethod2(); // 에러 - 스태틱 메서드에서는 인스턴스 메서드 호출 불가능
		new MemberCall().instanceMethod2(); // 이와 같은 호출은 가능  - 권장X
	}
	static void staticMethod2() {}
	
	void instanceMethod1() {
		System.out.println(sv); //인스턴스 메서드는 스태틱 변수 사용 가능 
		System.out.println(iv); // 인스턴스 메서드는 인스턴스 변수 사용 가능
		staticMethod2(); // 인스턴스 메서드에서는 스태틱 메서드 호출이 가능
		instanceMethod2(); // 인스턴스 메서드에서는 인스턴스 메서드 호출이 가능
	}
	void instanceMethod2() {}
}

public class Class26 {

	public static void main(String[] args) {
	}

}
