package days11;

class SuperE{
	SuperE(){
		this(5);//전달 순서 : 6
		System.out.println("Super E()");// 실행순서 : 3
	}
	SuperE(int i){
		this(10.12);//전달 순서 : 7
		System.out.println("Super E(int)");// 실행순서 : 2

	}
	SuperE(double d){//전달 순서 : 8
		System.out.println("Super E(double)"); // 실행순서 :1
	}
	SuperE(String s){//전달 순서 : 5
		this();
		System.out.println("Super E(String)"); // 실행순서 : 4
	}


}
class SubE extends SuperE{
	SubE(){
		this("");//전달 순서 : 1 
		System.out.println("SubE()"); // 실행순서 : 8
	}
	SubE(int i){	
		super("");//전달 순서 : 4 SuperE(String s) 호출
		System.out.println("SubE(int)"); // 실행순서 : 5
	}
	SubE(double d){
		this(3);//전달 순서 : 3
		System.out.println("SubE(double)"); // 실행순서 : 6
	}
	SubE(String s){
		this(123.12);//전달 순서 : 2
		System.out.println("SubE(String)"); // 실행순서 : 7
	}
}
public class Extends07 {

	public static void main(String[] args) {
		SubE s = new SubE();// <<	SubE(){ 호출
		

	}

}
