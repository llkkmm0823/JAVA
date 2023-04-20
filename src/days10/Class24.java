package days10;

class student3{
	private int bunho;
	private String name;
	private int [] scores;
	static int count =0;
	
	student3(){
		scores = new int[4];
		count++;
		bunho = count;
	}
	student3(String name){
		this();
		this.name = name;
		//this 키워드의 첫 째 용도와 두번 째 용도가 모두 사용
	}
	student3(String name,int kor,int mat,int eng){
		this(name);
		scores[0] = kor;
		scores[1] = mat;
		scores[2] = eng;
	}

	
}

public class Class24 {

	public static void main(String[] args) {
		student3 s1 = new student3();
		student3 s2 = new student3("홍길서");
		student3 s3 = new student3("홍길동",56,99,55);

	}

}
