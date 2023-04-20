package days11;

//Object 클래스
//개발자가 클래스 하나를 새롭게 만들면 자동으로 상속(extends) 되는 클래스
// 자바 내부에 존재하는 그리고 새롭게 만들어지는 모든 클래스는 보이지 않는 곳에 extends Object가 존재
//자바 내부에 존재하는 그리고 새롭게 만들어지는 모든 클래스의 부모클래스
// 자바의 클래스는 한 클래스 당 하나의 부모클래스만 갖을 수 있음
//Object 아닌 다른 클래스를 상속하면 그 클래스에서는  extends Object가 삭제됨
// 이렇게 extends Object 가 삭제되는 경우는 그 부모클래스가 이미 Object를 상속하고 있기 때문에 결국 또 Object의 자식(손자)클래스가 됨


class UserClass /* extendsObject */{
	// 현재 UserClass의 내용은 비어있음
}
public class Extends09_Object01 {

	public static void main(String[] args) {
	
		UserClass obj = new UserClass();
		// getClass 메서드는 해당 객체의 클래스 이름을 리턴해주는 메서드이며,
		// Object 클래스에서 상속받은 메서드
		System.out.println(obj.getClass());
		
		// toString 메소드는 해당 객체의 정보를 문자열로 리턴해주는 메서드
		System.out.println(obj.toString());
		System.out.println(obj);
		// .toString()은 생략해도 같은 출력이 이루어짐
		// 패키지이름.클래스이름@해시코드
		
		// hashCode 메소드는 해당 객체의 해시코드 값 ( 다른 객체와 구분하기 위한 고유 값)을 리턴해주는 메서드
		// JVM에 의해 관리되고 있음
		System.out.println(obj); // 16진수
		System.out.println(obj.hashCode()); // 10진수
		
		//System.out.println(obj); 이 명령에서
		// 결과적으로 obj 참조 변수가 "패키지 이름. 클래스이름@해시코드" 을 저장하고 있다가 출력되는게 아니라
		// Object에 있는 toString 메서드가 "패키지 이름. 클래스 이름@해시코드" 를 리턴, print가 출력하는 것

		String s1 = new String("가나다라마바사");
		String s2 ="아자차카타파하";

		System.out.println(s1);
		System.out.println(s2);
		// String 클래스 안에는 자기 나름의 toString()메서드가 오버라이딩 되어있음
		// >>"패키지 이름. 클래스 이름@해시코드" 가 아닌 저장된 문자열이 출력됨

}
}
