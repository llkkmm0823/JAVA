package days11; 
public class Card {
	//이 클래스는 한 장의 카드가 표현 또는 저장되는 의미로 제작됨
	
	final static int spade = 4;
	final static int diamond =3;
	final static int heart =2;
	final static int clover =1;
	
	
	private int kind; // 카드 무늬 종류 spade♠ : 4 / diamond◆ : 3 / heart♥ :2 / clover♣ : 1
	private int number; // 카드의 숫자 // A 1 2 3 4 ...  8 9 10 J Q K를 1~13으로 저장
	
	Card(){
		this(spade,1); //4,1이라 해도 되는데, 위쪽에 spade=4라고 변수 만들어줬응게 활용 ㄱ
	}//디폴트 생성자는 어떻게 실행되는지
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}//전달인수는 어떻게 생성하는지
	public String toString() {
		String [ ] kinds = {"","Clover","Heart","Diamond","Spade"}; // 무늬를 배열로 생성
		String [] numbers = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};//숫자를 배열로 생성
		String result = "["+kinds[ this.kind ]+":"+numbers[ this.number ]+"]"; // 배열들에 생성해둔 무늬와 숫자의 변수를 대입
		return result; 	
	}//어떤 값을 저장하여 전달할건지
	
	
}
