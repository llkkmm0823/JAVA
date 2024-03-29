package days01;

// 주석문 ( 실행되지 않는 영역 )
// 현재 파일에 쓰여진 모든 단어들은 프로그램 실행에 관여하는 실행명령들입니다.
// 다만 '//'로 시작하거나, '/* */' 사이에 있는 구문들은 실행되지 않고, 개발자 및 다른 사람의
// 이해를 돕기위한 설명문으로 사용되며, '주석문'이라고 칭함
// 컴파일러는 주석문을 제외한 다른 명령어들만 컴파일 & 실행
// 컴파일러 : 고급언어로 쓰인 프로그램을 컴퓨터에서 즉시 실행될 수 있는 형태의 목적 프로그램으로 바꾸어 주는 번역 프로그램.

//한줄에 명령어와 주석문을 같이 사용한다면 명령어를 쓰고, 뒤에 주석문 작성
//여러줄에 걸쳐쓰는 주석
/*
ABCD
EFG
 */
//자바프로그램의 시작 - 자바프로그램은 클래스 단위로 구성되고 실행됨
public class Java_First {   // '클래스이름 {'  으로 시작해서  '}'로 구성됩니다.

	// 구성은 class 단위로 구성되지만, 실행의 시작과 끝은 main 이 담당합니다.
	// class 안에는 main 외에 다른 구성요소들이 들어와서 쓰일 수 있습니다.
	public static void main(String[] args) {   // Java_First 프로그램 실행의 시작

		System.out.printf("겁나 쉬운 자바 프로그래밍~ !!\n");
		System.out.printf("겁나 쉬운 자바 프로그래밍~ !!\n");
		System.out.printf("겁나 쉬운 자바 프로그래밍~ !!\n");
		// 괄호안의 큰따옴표로 묶인 텍스트를 화면에 출력하는 명령입니다.
		// 자바 명령은 하나의 명령이 끝날 때마다 반드시 ';'을 표시하여 문장의 끝을 알려줍니다.
		// 별도의 표시 없이 System.out.printf 를 명령하면,
		// 두 번의 명령이건 세 번의 명령이건 모두 한 줄에 ( 커서가 있는 현재 위치에서 ) 출력하려고 합니다.
		//줄바꿈: \n  의 슬래시는 백슬래시임.( 백스페이스 아래 ) 물음표 키의 슬래시/와 방향이 다름
		
	}  // Java_First 프로그램 실행의 끝

}

//클래스의 이름 생성 규칙
//첫 글자는 반드시 대문자
//여러 단어가 조합된 이름이라면 두 번째 단어의 시작 문자도 대문자로 표기합니다 ( 카멜 표기법 )
// ex. JavaFirst , SecondProgram, Java_First
//하나의 Java 파일에는 여러 개의 클래스가 정의될 수 있고, 그 중 하나는 반드시 public을 앞에 붙여서
//현재파일의 메인 클래스 임을 표시합니다
//메인이 되는 클래스에 public static void main(String[] args){} 을 포함시킵니다

//클래스의 이름은 영문과 숫자가 조합되어서 만들 수 있지만 역시 첫글자는 영문이어야 합니다
//이름 중간에 공백 또는 특수기호를 쓸 수 없습니다
//사용가능한 특수기호로는 언더바(_) 하나 정도만 사용합니다








