package days12;

class Human{
	private String name;
	private int age;
	public Human(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() { return "이름 : "+ this.name +" , 나이 : "+ this.age; }
		public boolean equals( Object obj ) {
			//1. 매개 변수로 전달된 객체가 현재 클래스로 캐스팅이 가능한 객체인지 검사, 불가능하면 false를 리턴
			if(!(obj instanceof Human))return false;
			//2. 캐스팅이 가능하다면 Object 형태에서 현재 클래스 형태로 옮겨담습니다. 이때 강제 캐스팅이 이루어집니다
			Human target = (Human)obj;
			//3.필요한 멤버변수들을 비교해서 모두 같을 때 true  / 그렇지 않으면 false 변수에 저장합니다
			boolean result = (this.name.equals(target.name))&&(this.age==target.age);
			/* 헷갈리면 구분해서 써도 됨
			boolean result1 = this.name.equals(target.name);
			boolean result2 = this.age==target.age
			result = result1&&result2;
			 */
			return result;
		}
	}
public class Extends09_Object04 {

	public static void main(String[] args) {
		
		Human s1 = new Human("홍길동",21);
		Human s2 = new Human("홍길동",21);
		Human s3 = new Human("홍길서",22);
		System.out.println("Human1의 정보 - " + s1);
		System.out.println("Human2의 정보 - " + s2);
		System.out.println("Human3의 정보 - " + s3);


		//레퍼런스 변수들간의 비교
		if(s1==s2)System.out.println("s1변수와 s2변수는 같습니다. (s1==s2)");
		else System.out.println("s1변수와 s2변수는 다릅니다. (s1==s2)");
		//결과 : s1변수와 s2변수는 다릅니다. (s1==s2)
		
		// if(s1.equals(s2))System.out.println("s1변수와 s2변수는 같습니다. (s1.equals(s2))");
		// else System.out.println("s1변수와 s2변수는 다릅니다. (s1.equals(s2))");
		// 결과 : else System.out.println("s1변수와 s2변수는 다릅니다. (s1.equals(s2))"); 
		// 아직 equals가 재 정의되지 않았기 때문에 아직 다르다고 나옴

		if(s1.equals(s2))System.out.println("s1변수와 s2변수는 같습니다. (s1.equals(s2))");
		else System.out.println("s1변수와 s2변수는 다릅니다. (s1.equals(s2))");
		
		

	}

}
