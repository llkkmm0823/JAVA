package days12;
//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★시험문제출제★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
import java.util.Vector;

// 상품구매시스템
// 클래스 만들어서 운영 대상 : 판매할 상품 , 구매자
// 판매할 상품 : 컴퓨터  TV  Audio
// 각 클래스에는 적절한 멤버변수와 멤버메서드를 만들어서 운영하되
// 공통의 요소들이 있다면 부모클래스를 만들고 그를 상속받아서 사용
// 공통요소 : 가격, 보너스포인트

// 부모클래스
class Product{
	int price;
	int bonusPoint;
	Product(int p){
		this.price = p;
		this.bonusPoint = p/10; //10%정도 적립
}
}
//자식클래스들
class Computer extends Product{//자식클래스
	Computer(){//디폴트 생성자
		super(1500000);//<<매개변수가 있어야됨
	}
	public String toString() { // 오버라이딩
		return"Computer";
}
}
class Tv extends Product{//자식클래스
	
	Tv(){//디폴트 생성자
		super(2500000);
	}
	public String toString() { // 오버라이딩
		return"Tv";
}
}
class Audio extends Product{//자식클래스
	
	Audio(){//디폴트 생성자
		super(1000000);
	}
	public String toString() { // 오버라이딩
		return"Audio";
}
}
class Buyer{//구매자 클래스
	int money = 10000000; // 현재 자산
	int bonusPoint; // 물건을 사고 받을 포인트
	Vector itemList = new Vector(); // 구매 상품을 저장할 리스트 클래스
	// 스캐너 추가하듯이 벡터 임포트 해줘야함
	
	
	// 구매한 상품을 저장할 수 있는 리스트가 필요함
	// 배열이 필요한데 배열은 단점이 너무 많음 _너무 정형화되어있어서
	// 배열처럼 사용하지않지만 배열처럼 생겨서 값을 뺐다 꺼냈다 할 수 있는 것 = Vector
	
	// 벡터랑 배열의 확장형 리스트 구조_객체들을 저장할 수 있는 배열이라고 이해해도 무방
	//                     ㄴ배열보다 기능 좋음
	// 사용자가 만든 클래스의 객체(메모리를 할당받은 레퍼런스 값)등이 저장되는 다형성 객체 저장 리스트
	// 추가된 순서로 번호(index)도 설정이 되어 나중에 번호로 검색가능
	// 배열과 다른점은 값을 원하는 위치에 넣을 수도 있고, 값의 추가와 삭제가 자유로움
	
	// 벡터에 데이터 저장하는 방법
	//Computer c = new Computer();
	//itemList.add(c);
	//add : Vector 클래스의 멤버 메서드
	// Vector 클래스의 add 멤버메서드 형태 : public boolean add( Object obj ) {}
	// 매개 변수가 Object형이어서 어떤 객체든 전달이 가능함
	
	/*각 전달 인수를 오버로딩하여 구현
	public void buy(Computer c) { }
	public void buy(Tv t) { }
	public void buy(Audio a) { }
	*/
	// 매개변수로 Object 자료형 사용
	// public void buy(Object obj) {}
	
	//매개변수로 Product 자료형 사용
	public void buy(Product p) {  
		// "부모클래스의 참조변수에 자식클래스의 인스턴스 참조값을 아무런 제약없이 저장할 수 있다"를 이용
		//제일 먼저 구매자 보유 잔액이 더 큰지 체크!
	if(p.price>this.money) { // 물려받은 price 사용가능
		System.out.println("잔액이 부족합니다");
		return;
	}
		// 제품의 가격만큼 구매자의 잔액 차감
		this.money-=p.price;
		
		// 제품의 보너스포인트 만큼 구매자의 보너스포인트 합산
		this.bonusPoint +=p.bonusPoint;
		
		// 구매상품을 itemList에 저장
		itemList.add(p);
		System.out.println(p.toString() +"을 구매하셨습니다.");
		//자식 클래스에서 오버라이딩되어 toString()리턴값이 리턴됨
		//.toString() 생략가능
	}
	public void summary() {
		// 구입한 상품들을 하나의 String 값으로 정리해서 출력
		// 지출 총액이 얼마인지 출력
		int sum = 0; // 지출 총액을 합산할 변수
		String item = ""; // 구입한 상품들을 화면에 나열하기 위한 String변수
		
		//itemList가 비어있다면 "구매하신 상품이 없습니다"라고 출력하고 메서드 종료
		// itemList.isEmpty() : 벡터가 비어있으면 true, 하나라도 채워져있으면 false를 리턴하는 메서드
		if(itemList.isEmpty()) {
			System.out.println("구매하신 상품이 없습니다");
			return;
		}
		// itemList.size() : 벡터에 저장된 객체의 갯수를 리턴해주는 메서드
		for(int i=0;i<itemList.size();i++) {
			// Vector에서 저장요소를 꺼내는 멤버메서드 : itemList.get(0); itemList.get(1);
		Product p = (Product)itemList.get(i); // 강제 캐스팅 필요
		//부모에서 자식으로 받는 것이기 때문 _product->object->product
		sum+=p.price;
		item+="  "+ p.toString();
		}
		System.out.println("구매 Summary===========");
		System.out.println("지출총액 : "+sum+"원");
		System.out.println("구매목록 : "+item);
		System.out.println("현재 잔액 : "+this.money+"원");
	}
	// 환불 메서드
	// itemList.remove(상품) : itemList에서 상품을 삭제
	// remove하려는 상품이 존재하여 잘 지워졌다면 true가 리턴됨
	// 잔액이 상품 가격만큼 늘어남
	// 보너스 포인트가 줄어듦
	// itemList 에서 상품이 삭제됨
	// 제일 먼저 itemList가 비어있으면 구매한 내역이 없습니다 출력
	// 환불하려는 상품이 없으면 해당 상품이 없습니다 출력
	// 마지막 "상품이름" 이 환불되었습니다 출력
	
	public void refund(Product p) { // 컴퓨터를 환불할지 오디오를 환불할지 티비를 환불할지 모르니까 Product매개변수가 와야함
		if(itemList.isEmpty()) {
			System.out.println("구매하신 상품이 없습니다");
			return;
		}
		if(itemList.remove(p)) {		// remove하려는 상품이 존재하여 잘 지워졌다면 true가 리턴됨
			this.money += p.price; // 잔액이 상품 가격만큼 늘어남
			this.bonusPoint -=p.bonusPoint;// 보너스 포인트가 줄어듦
			System.out.println("***"+ p+"(이)가 환불되었습니다");// 마지막 "상품이름" 이 환불되었습니다 출력
		}else {	// 환불하려는 상품이 없으면 해당 상품이 없습니다 출력
			System.out.println("구입하신 물품 중에 해당 제품이 없습니다");
		}
	}
}

public class Extends09_Object06 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Computer c = new Computer();
		Tv t = new Tv();
		Audio a =new Audio();
		
		b.buy(c);
		b.buy(t);
		b.buy(a);
		System.out.println();
		b.summary();
		
		System.out.println();
		b.refund(a);
		b.summary();


	}
}
