package days12;

import java.util.Date;

public class StringClass {

	public static void main(String[] args) {

		//0.
		// 가용한 Heap공간에 "Hello"를 저장하고 주소를 참조변수에 저장
		String s1 = "Hello";
		// new를 사용하지 않고 새 공간을 만든다는 점
		// Integer, Double 같이 기본 자료형을 클래스로 생성한 것 들에 공통적으로 존재하는 기능
		
		// String에만 있는 단점 : 같은 문자들로 새로운 참조변수를 생성하면, 새로운 공간이 할당되지 않고 같은 글자들의 주소가 참조변수에 저장됨
		
		String s2 = "Hello";
		// s1과 s2는 같은 공간 참조값을 저장하게 됨(글자가 아니라)
		
		//1. 
		// String 객체의 내용이 항상 새로운 공간에 만들어지려면 반드시 new 키워드를 사용
		s1 = new String("Hello");
		s1 = new String("Hello");
		System.out.println( "1. "+s1);
		//String 클래스는 Object 클래스를 상속받기 때문에 이미 toString 과 Equals가 자신에게 적합하게 오버라이딩되어있음
		
		
		//2.
		//char 배열을 String으로 변환
		char [] c = {'H','e','l','l','o'};
		String s3 = new String(c); 
		// >> Hello 
		// 배열주소를 초기값으로 문자열 구성
		System.out.println( "2. "+s2+"  : char 배열 -> String");

		
		System.out.println();
		//3.
		// String -> char
		String n = "0123456789";
		char c1 = n.charAt(8);
		char c2 = n.charAt(0); //괄호 안에 정수값 n번째의 글자를 얻음 (0부터 시작)
		System.out.println( "3.  "+n+"  : charAt(8) ->"+c1);
		System.out.println( "3.  "+n+"  : charAt(0) ->"+c2);
		System.out.println( " : String-> char");
		
		//4.
		String a1 = new String("ABCD");
		String a2 = new String("CCD");
		String a3 = new String("ABCD");
		System.out.println();
		System.out.println("4. a1.compareTo(a2) ? " + a1.compareTo(a2));
		System.out.println("4. a2.compareTo(a3) ? " + a2.compareTo(a3));
		System.out.println("4. a1.compareTo(a3) ? " + a1.compareTo(a3));
		// String 데이터들 간의 비교
		// 차례로 한 글자씩 같은 자리 글자들을 비교
		// 두 글자 간의 뺄셈의 결과를 얻어서 아스키코드로 어떤게 더 작은지 큰지를 결정
		// ex) 'A'-'B'=>-1 뒤에서 빼려는 글자가 크다
		// 앞쪽부터 비교해서 같은 글자는 지나치는 방식으로, 크기가 결정되면 뒤에 글자들은 비교하지 않음

		//5.
		//concat 메서드 :  전달인수 String을 메서드 호출 객체의 String에 이어붙이기 연산
		s2 = s1.concat("World");
		// s1과 월드가 합해져서 s2가 되는거지 s1이 헬로월드가 되는것이 아님. 주의!
		// s2 = s1 + "World";
		// concat 메서드는 원본 s에 있는 문자열에 World를 이어붙이기하고 s1에 업데이트해서 저장하는 것이 아니라
		// 이어붙이기된 새로운 문자열 객체를 만들어서 새로운 레퍼런스 변수에 저장할 수 있게 리턴
		System.out.println();
		System.out.println("5. " +s2);
		System.out.println("5. " +s1);

		//6.
		s1 = new String("abcdefg");
		boolean b = s1.contains("bc");
		//boolean b =new String ("abcdefg").contains("bc"); // 체이닝 기법
		//괄호안의 문자열이 메서드 호출 객체가 갖고 있는 문자열의 일부로 포함되어 있다면 true를,  없으면 false를 리턴하는 메서드
		System.out.println("6. 문자열"+s1+"에는 \"bc\"가 포함되어 있다? " +b);
		
		s1 = new String("Hi");
		b = s1.concat(" World").contains("i W");
		//a = 1+2+3+4+5 => 1+2 연산 후 결과에 +3, 그 결과에 -5하듯이
		//s1.concat(" World") 결과에 .contains("i W"); 적용하여 실행
		s2 = s1.concat(" World");
		b = s2.contains("i W");
		System.out.println("6. 문자열 "+s2+"에는 \"i W\"가 포함되어 있다? " +b);

		
		//7.
		String s = new String("Hello.txt");
		b = s.endsWith("txt"); // s.startsWith()도 있음
		//메서드 호출 객체가 갖고 있는 문자열이 괄호 안의 문자열로 끝나면 true를 리턴해주는 메서드
		//포함도 되어 있고, 맨 마지막 text이면 true, 아니면 false
		System.out.println();
		System.out.println("7. 문자열 "+s+"는 \"txt\"로 끝난다 ? " + b);
		
		s= new String("Hello.txt");
		b=s.startsWith("Hel"); // 포함도 되어 있고, 맨 처음 text이면 true, 아니면 false
		System.out.println("7. 문자열 "+s+"는 \"Hel\"로 시작한다 ? " + b);
		
		
		//8. 
		s=new String("Hello");
		//대소문자 구분해서 비교
		System.out.println();
		System.out.println("8. "+s+"는 \"Hello\"와 같다 ? " + s.equals("Hello"));
		System.out.println("8. "+s+"는 \"hello\"와 같다 ? " + s.equals("hello"));

		//대소문자 구분하지 않고 비교
		System.out.println("8. "+s+"는 \"HELLO\"와 같다 ? " + s.equalsIgnoreCase("HELLO"));
		System.out.println("8. "+s+"는 \"Hello\"와 같다 ? " + s.equalsIgnoreCase("Hello"));


		//9.
		//s : Hello
		System.out.println("\n9. "+s+"의 문자중 'o'의 위치"+s.indexOf('o'));
		System.out.println("9. "+s+"의 문자중 'k'의 위치"+s.indexOf('k'));
		//메서드 호출 객체의 문자열 중에 괄호안에 있는 문자가 몇 번째로 위치하는지를 구해줌
		// 있으면 위치값 ( 0부터 시작하는 정수 ), 없으면 -1
		
		//s : Hello
		System.out.println("9. "+s+"s.indexOf('e',1)->"+s.indexOf('e',1));
		System.out.println("9. "+s+"s.indexOf('o',2)->"+s.indexOf('o',2));
		System.out.println("9. "+s+"s.indexOf('e',2)->"+s.indexOf('e',2));
		//찾고자 하는 문자가 지정한 정수(0부터 시작)번째 부터 시작해서 몇 번째 글자인지 찾고 위치값은 원래 인덱스 리턴

		
		//10.
		System.out.println();
		s1 = "Hello";
		System.out.println("\n10. "+s1+"s1.replace('H','C')-> " + s1.replace('H', 'C'));
		s2 = s1.replace('H', 'C'); // H를 C로 치환
		System.out.println("10. "+s1+" " + s2);
		System.out.println("10. "+s1+"s1.replace(\"ll\",\"LL\")-> " + s1.replace("ll","LL"));
		s2 = s1.replace("ll","LL");// II를 LL로 치환
		System.out.println("10. "+s1+" "+s2);
		//replace메서드의 결과를 별도의 변수에 저장. 원래 원본은 보호
		
		
		//11.
		String animal = "dog-cat-bear";
		String [] a = animal.split("-");
		//String animal = "dog cat bear";
		//String [] a = animal.split(" "); //빈칸(space)도 가능
		
		System.out.println();
		//','를 기준으로 문자열을 분리 - 문자열 배열로 만듦
		System.out.print("\n11. ");
		for(int i=0;i<a.length;i++) System.out.printf("%s  ", a[i]);

		//12. ☆☆☆☆☆☆☆☆☆☆☆
		s1 = "java.lang.Object";
		s2 = s1.substring(5,9); //원본에서 다섯번째 글자(0부터 시작) 부터 8번째(9-1)까지 추출
		//지정해주면 n부터 n1까지
		System.out.println("\n\n12. "+ s2);
		//String 데이터 중 필요한 글자들만 추출
		// .substring(시작 index,끝 index +1)
		
		s2 = s1.substring(10); // 원본에서 열번째 글자부터 끝까지 추출
		//하나만 쓰면 거기서부터 끝까지 쭉
		System.out.println("12. "+s2);
		
		// www.naver.com
		// www.daum.net
		String s5 = new String("www.naver.com");
		String s6 = new String("www.daum.net");
		
		
		//split을 이용한 방법
		String [] addr = s5.split("[.]"); //.으로 split을 하려면 []를 추가해줘야만 split이 됨 //정규,,뭐시기 식이라고 함 아직 안배움
		System.out.println(addr[1]);
		addr = s6.split("[.]");//.으로 split을 하려면 []를 추가해줘야만 split이 됨 
		System.out.println(addr[1]);
		
		
		//indexOf, substring을 이용한 방법
		//System.out.println(s5.indexOf("."));
		//System.out.println(s5.indexOf(".", s5.indexOf(".")+1 ));
		String result = s5.substring(s5.indexOf(".")+1,s5.indexOf(".",s5.indexOf(".")+1));
		System.out.println(result);
		//네이버만 추출됨
		
		//System.out.println(s6.indexOf("."));
		//System.out.println(s6.indexOf(".", s6.indexOf(".")+1 ));
		result = s6.substring(s6.indexOf(".")+1,s6.indexOf(".",s6.indexOf(".")+1));
		System.out.println(result);
		//다음만 추출됨
		
		//13.
		System.out.println();
		System.out.println("\n13. "+String.valueOf(true));
		s = String.valueOf("13. " + 100);
		System.out.println(s);
		s= String.valueOf(100.123);
		System.out.println("13. "+s);
		//java.utill.Date dd = new java.util.Date();
		Date dd = new Date(); // java.util.Date // import해주면 됨
		s= String.valueOf(dd);
		System.out.println("13. "+ s);




	}

}
