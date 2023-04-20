package days10;

//int 형 자료를 매개변수로하는 생성자와 디폴트 생성자를 오버로딩하는 클래스 생성
//전달인수가 있으면 전달인수를 멤버변수 dan에 저장, 전달인수가 없으면 dan에 0 저장
//멤버변수는 int dan; 한 개만 생성
//멤버메서드는 print()하나
//print 메서드의 내용
//dan이 0이 아니면 해당 구구단 출력
//dan이 0이면 2~9단 구구단 모두 출력

class Googoodan{
	int dan;

Googoodan(){
	dan =0;
}
Googoodan(int a){
	dan = a;
}
public void print() {
	if(dan!=0) {
		for(int i=1;i<=9;i++)
				System.out.printf("%dx%d=%2d\n",dan,i,dan*i);
	}else {
		for(int i=1;i<=9;i++) {
			for(int j=2; j<=5;j++) {
				System.out.printf("%dx%d=%2d\n",j,i,j*i);
			}
			System.out.println();
			}
		}
	}
}
public class Class17 {

	public static void main(String[] args) {
		Googoodan g1 = new Googoodan(8);
		Googoodan g2 = new Googoodan();
		g1.print();
		g2.print();

	 
	}


}