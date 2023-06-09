package days09;

//멤버 메서드 :  클래스에 소속되어 클래스 객체에 종속된 메서드 입니다.
//멤버 메서드는 특별한 경우를 제외하곤 static을 사용하지 않습니다

class Animal{
	String name;
	int age;
	public void output() {
		System.out.println("저의 이름은 "+name+", 나이는 "+ age+"살 입니다");
		//호출할 때마다 호출한 것에 대해서 name과 age가 바뀜

	}//멤버 메서드 : 메서드를 호출한 객체에 대해서 메서드 내의 코드들을 실행
	//호출한 객체 : a1, a2등 Animal로 생성한 객체변수
	// output 내부의 name변수와 age는 명령 실행시에 호출한 객체의 name과 age로 귀속됨
	
	// 클래스 모양대로 생성딘 객체들은 클래스에서 물려받은 변수에 자신만의 값들을 넣고 멤버 메서드 이용가능
	
	// 멤버변수와 멤버 메서드는 필요한만큼 제한 없이 생성 & 사용가능함
	
	public void input() {
		name ="바둑이";
		age=7;
		//이 메서드를 호출하는 객체는 모두가 똑같이 name변수에 "바둑이", age가 7로 값이 저장됨
	}
	 public void inputWithParam(String n , int a) {
		 name=n;
		 age = a;
		 output();
		 // 멤버메서드들 간에 서로 간 자유로운 호출 가능
		 // 호출된 객체는 그대로 승계됨
	 }
	 //멤버메서드는 클래스형으로 생성된 객체 " 전용 " 메서드  _ 호출 객체 없이 단독 사용 시 에러.
	 //메서드의 실행이 객체 전용으로만 사용이 된다는 뜻
	 //멤버메서드의 내용은 해당 객체와 상관없는 명령이 들어갈 수도 있지만
	 //보통은 멤버변수들의 조작, 출력, 입력을 위한 명령들로 주로 구성	
	 
	//클래스를 생성하고 사용하면서 클래스 내부에 필요한 변수들을 만들어서 넣고 하나의 자료로 정의하는 것을 ' 클래스의 캡슐화 '
	//또한 생성된 변수들을 외부에서 멤버 메서드 이용없이 임의직접접근을 못하게 막는 것을 정보의 은닉화라고 부릅니다
		
	 public void setName(String n) {
		 name = n;
	 }
	 public void setAge(int a) {
		 age = a;
}
	 public String getName() {
		 return name;  // 호출 객체의 name 값을 리턴합니다
	 }
	 int getAge() {
		return age;
	}
	 //현재 프로그램에서만 사용한다는 가정하에 public은 생략 가능합니다.
	 //현재 프로그램 내에서 생성되는 메서드에 public을 안쓰면 자동으로 public으로 인식됩니다.
}

public class Class04 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		//a1.name = "댕댕이";
		//a1.age = 5;
		//System.out.println("저의 이름은 "+a1.name+", 나이는 "+ a1.age+"살 입니다");
		a1.input();
		a1.output();
		
		Animal a2 = new Animal();
		//a2.name = "냥냥이";
		//a2.age = 6;
		//System.out.println("저의 이름은 "+a2.name+", 나이는 "+ a2.age+"살 입니다");
		//a2.input();
		//a2.output();
		a2.inputWithParam("냥냥이",6);
		
		Animal a3 = new Animal();
		//a3.name = "야옹이";
		//a3.age = 8;
		a3.inputWithParam("야옹이",8);
		a3.output();
		
		
		//위에 내용처럼 객체의 멤버변수에 값을 넣을 때는 직접 값을 넣는 것 보다 메서드를 이용하는 경우가 많아질 예정입니다
		//차 후 만들어지는 클래스의 멤버 변수는 클래스 외부에서 직접접근을 차단할 예정
		//반드시 멤버 메서드를 통해서만 접근이 가능할 예정
		
		Animal a4 = new Animal();
		a4.setName("댕댕이");
		a4.setAge(10);
		// a4.output();   //이름과 나이가 모두 출력
		
		// 이름 : 댕댕이   이름만 출력하고 싶을 때
		// 방법 1 : 이름만 출력해주는 메서드를 멤버메서드로 새로 만들고 호출합니다
		// 방법 2 : 이름을 리턴해주는 메서드를 만들어서 main에서 호출하고 출력합니다
		String name = a4.getName();
		System.out.println("이름 : "+name);
		int age = a4.getAge();
		System.out.println("나이 : "+age + "쨜");
		
		Animal a5 = new Animal();
		System.out.println("이름 : "+a5.getName()+"  나이 : "+a5.getAge());

		}
	}

