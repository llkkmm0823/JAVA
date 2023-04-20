package days10;

import java.util.Scanner;

class Student{
		private int bun;
		private String name;
		private int [] scores = new int[4]; // 크기가 고정되어있다면 = new int[4]; 해도 무방
		private double avg;
		Scanner sc = new Scanner(System.in);
		Student(){	//디폴트 생성자 호출
			//확장할 경우
			//System.out.print("과목 수를 입력하세요 : ");
			//int k = sc.nextInt();
			//scores = new int[k+1];
			
			name ="김하나" ;
			scores[0] = 89;
			scores[1] = 87;
			scores[2] = 98;
			// 번호는 객체가 생성될 대마다 부여되는 연속 번호를 입력하는 좋은 방법을 공부하고 넣겠습니다
		}
		Student(String name){ //String 타입 매개변수 전달받는 생성자 호출
			scores = new int[4]; // 멤버변수에 참조변수만 존재한다면 생성자에서 메모리 할당 명령이 실행됨 // 짱짱중요한 코딩
			//어디서 생성해도 상관은 없음, 할당이 된다면 ㅇㅇ 하지만 보통 생성자에서 할당이 됨 
			this.name =name;//멤버변수와 구분하기 위해 얜 매개변수입니다 = this.
			scores[0] = 67;
			scores[1] = 88;
			scores[2] = 76;
		}
		Student(String n ,int kor, int mat, int eng){ // 생성자
			scores = new int[4];
			this.name =name;
			scores[0] = kor;
			scores[1] = mat;
			scores[2] = eng;
		}
		
		public void prnTitle() {//멤버메서드
}
		public void prnScore() {//멤버메서드			
		}
		Student( Student s ){
			scores = new int[4];
			this.name =s.name;
			this.scores[0] = s.scores[0];
			this.scores[1] = s.scores[1];
			this.scores[2] = s.scores[2];
		}
		public void copy1 ( Student s ) {
			this.name =s.name;
			this.scores[0] = s.scores[0];
			this.scores[1] = s.scores[1];
			this.scores[2] = s.scores[2];
		}
	}
// 아래 생성자들이 모두 실행가능하도록 생성자를 제작합니다
// 모든 생성자에서 scores에 정수 세 개를 저장할 배열을 만들고 주소를 저장하도록 코딩하세요
// 디폴트 생성자와 이름만 전달되는 생성자에서 각 점수는 임의의 값을 대입하세요
public class Class16 {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student("홍길서");
		Student s3 = new Student("홍길남",98,69,87);
		Student s4 = new Student(s3); // s4에다가 s3을 복사하겠다는 뜻

		Student s5 = new Student();
		s5.copy1(s1);//객체를 만들고 나서 카피할거냐
		//객체를 만듦과 동시에 카피할거냐 의 문제인데, 얜 객체를 만들고 나서 카피한다는거겠지????????????????????
		
		
		
	}

}
