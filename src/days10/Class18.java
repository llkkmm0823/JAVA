package days10;

//this 키워드의 용도 #1

//this 변수는 레퍼런스(참조)변수입니다.
//멤버변수는 new 생성자()에 의해 새로운 공간 객체별로 각각 만듭니다.
//반면에 멤버 메서드는 한 개만 만들어지며, 각 객체들이 공유&호출해서 사용합니다.
//이때 메서드 내에는 누가 자신을 호출했는지 구분하기 위해 this라는 참조변수를 준비해 놓고 있습니다.
//호출한 객체의 참조값이 this에 저장됩니다.
//this 변수는 따로 기술하지 않은 숨어있는 변수입니다

class ThisA{
	private int num;
	
	public void init (int num /*ThisA this*/ ) {//끄집어 낼 수 없는 매개변수가 숨어있는 것이여
		this.num=num;//호출한 객체에 멤버변수를 넣어주세요 하고 this.을 앞에 적으면 됨
	}
	public void prn(/*ThisA this*/) {
		System.out.println("멤버변수 num의 값 : "+this.num);
	}
	public int getnum(/*ThisA this*/) {
		return num;
	}
	public void setnum(int num/*ThisA this*/) {
		this.num=num;
	}
	public void copy1(ThisA c/*ThisA this*/) { // c <- a4가 전달됨, this<-a6이 전달됨
		this.num=c.num; 
		//★★★★★★★★★★★★★★만약 객체가 이런 메서드를 호출한다면 이건 어디로 전달되고 어디로 전달될까요라는 문제 시험에 나옴★★★★★★★★★★★★★★★
	}
	public ThisA copy2(/*ThisA this*/) {  // this<--a3
		ThisA temp = new ThisA();  //새로운 객체 생성
		temp.num = this.num;  // 전달된 a3의 num값을 새 객체의 num에 복사
		return temp;  // 완성된 복사본의 참조값을 리턴
	}
	
	ThisA(){	}  
	// 아래 생성자가 만들어지면서 디폴트 생성자가 대체되어 다른곳에서 호출하던 디폴트생성자가 없어져
	//디폴트 생성자를 오버로딩
	ThisA(ThisA t){  //t<-a7, this<-a8
		this.num =t.num;
		// 메서드 자체가 이미 생성자이기 때문에 별도의 new ThisA()는 필요치않음
		// 멤버변수값만 복사
		
	}
}

public class Class18 {
	public static void main(String[] args) {
		ThisA t1 = new ThisA();
		t1.init(100);
		t1.prn();
		ThisA t2 = new ThisA();
		t2.init(200);
		t2.prn();
		
		ThisA a3 = new ThisA();
		ThisA a4 = new ThisA();
		a3.setnum(300); //a3 -> this  300->매개변수num
		a4.setnum(300); //a4 -> this  400->매개변수num
		System.out.println("a3의 멤버변수 num :  "+a3.getnum());//a3 -> this
		System.out.println("a4의 멤버변수 num :  "+a4.getnum());//a4 -> this
		
		ThisA a5 = a3; // a3의 참조값만 a5에 저장됨 . 내용복사아님 참조값만.
		a3.setnum(500);
		a5.prn();
		a3.prn();
		
		ThisA a6= new ThisA();
		a6.copy1(a4); //공간할당(new ThusA())이 딘 상태에서 멤버변수값만 카피
		a4.setnum(600);
		a6.prn();
		a4.prn();
		
		ThisA a7 = a3.copy2();  // 새로운 공간생성 후 멤버변수값 카피하고 그 객체의 참조값 리턴.
		//a3만 카피투를 외롭게 호출하고있음
		a3.setnum(800);
		a7.prn();
		a3.prn();
		
		ThisA a8 = new ThisA(a7); // 생성자에 a7을 넣는것임
		

	}
		
	}


