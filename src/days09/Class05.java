package days09;

//같은 패키지 안에서는 클래스 이름이 중복될 수 없음. 그래서 Student 대신 Std라는 이름을 사용
class std{ // 클래스는 자료의 저장. 메서드는 실행/동작 느낌으로 생각하면 쉬울듯
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double ave;

public void input(int b,String n,int k,int e,int m){
	bun = b;
	name = n;
	kor=k;
	eng=e;
	mat=m;
	tot = k+e+m;
	ave=tot/3.0;
	
}
public void prnscore() {
	System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\n",bun,name,kor,eng,mat,tot,ave);
}
}
public class Class05 {
	
	public static void prnTitle() {
		System.out.println("\t\t ###성적표###");
		System.out.printf("\n----------------------------------------------------------\n");
		System.out.printf("번호\t성명\t\t국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("----------------------------------------------------------\n");
	}

	public static void main(String[] args) {

		std s1 = new std();
		std s2 = new std();

		s1.input(1,"홍길동",88,77,99); // 전달인수가 각 객체의 멤버변수에 저장되는 메서드 제작
		s2.input(2,"홍길서",89,98,78);
		
		prnTitle();
		s1.prnscore();
		s2.prnscore();
		System.out.println("----------------------------------------------------------");
	}
}

