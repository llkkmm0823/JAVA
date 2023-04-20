package days11;

class SuperC{
	private int superNum;
	SuperC(int n){}
	SuperC(){ } // 오버로드해주거나
}
class SubC extends SuperC{
	int subNum;
	SubC(){ // <전달인수를 넣거나
		super();
		// super();는 부모클래스의 생성자 중 매개변수가 없는 "디폴트 생성자"를 호출하는 명령이므로,
		// 혹시라도 부모클래스의 생성자가 매개변수있는 생성자로 대체되었다면 이는 에러를 발생시킴  
		// SuperC(int n){ <<<<요거에서 int n이 있음 안된다는거지
		//1. 부모클래스의 매개변수 형태대로 호출 : super();에 전달 인수를 넣기 ex) super(10);
		//2. 부모클래스의 생성자를 오버로딩해서 자식클래스 생성자에서 호출하는 형태로 부모클래스 생성자를 추가
		//3. 부모클래스의 매개변수를 잇는 생성자를 매개변수 없는 디폴트 생성자로 바꿈
		// ### 부모클래스의 생성자 형태로 호출하거나, 그게 아니라면 호출한대로 부모클래스 생성자를 추가하거나
	}
	//매개변수가 있는 생성자로 자식생성자가 오버로딩 된 경우
	SubC(int n){
		// super(); or super(n); this(); 이 셋중에 하나를 사용 가능
		// 다만, 하나만 사용 가능
		// 아무것도 쓰지 않으면 super(); 호출됨 -> 부모클래스에 디폴트 생성자 반드시 존재해야함
		this();
		System.out.println("자식클래스의 오버로딩된 생성자 실행(this()O) - 부모클래스 생성자 호출 X");	
	}
	
	SubC(int subNum, int num){
		super(num); 
		this.subNum = subNum;
		System.out.println("자식클래스의 오버로딩된 생성자 실행(this())X - 부모클래스 생성자 호출 O");
	}
}
public class Extends05 {

	public static void main(String[] args) {
		
		SubC c = new SubC();
	}
}
