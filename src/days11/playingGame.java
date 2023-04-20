package days11;
// 헷갈리면 card class 복사해서 여기다 복붙해도 똑같음
// 파일만 따로 있지 곁에 있는 내용이나 상관없음

public class playingGame {

	public static void main(String[] args) {

		/* 카드가 잘 만들어지는지 테스트 한 것은 주석처리
		Card c1 = new Card(3, 3);
		Card c2 = new Card();
		// 두 개의 객체 생성. 같은 패키지 내 다른 클래스 사용 자유로이 가능함
		String s1 = c1.toString();
		String s2 = c2.toString();
		System.out.println(s1);
		System.out.println(s2);
		*/
		
		Deck deck = new Deck(); // 52장의 카드가 deck에 생성됨_데크안에 있는 카드는 프라이빗 처리한 카드가 들어있음
		deck.shuffle();
		/*테스트는 모두 주석처리
		Card c1 = deck.pick(0);
		Card c2 = deck.pick(1);
		Card c3 = deck.pick(50);
		Card c4 = deck.pick(51);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		// 이렇게 순서대로 뽑으면 어떤 카드가 나올지 다 아니까 섞어줘야됨
		
		deck.shuffle(); // 셔플 메서드 불러오기
		System.out.println();
		c1 = deck.pick(0);
		c2 = deck.pick(1);
		c3 = deck.pick(50);
		c4 = deck.pick(51);
		//이렇게 뽑아도 자리가 계속 바뀌도록 셔플 메서드 짜놨기 때문에 매번 다른 값 출력됨 = 셔플 성공!
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		*/
		
		Card [] player1 = new Card[5]; // 플레이어한테 한번에 나눠주지 않잖아
		Card [] player2 = new Card[5]; // 한 번에 한 장씩 5개를 나눠주는 배열을 만들기 위해 플레이어당 5장의 공간을 모두 생성
		Card [] player3 = new Card[5];
		Card [] player4 = new Card[5];
		
		// 1명당 5장씩 분배하고 한 명당 1줄에 보유카드를 한 번에 출력해서 네 줄을 출력해주세요
		// player1[0] = deck.pick(0); 
		int cardIndex = 0; // 순서대로 카드를 꺼내기 위한 변수
		for(int i =0;i<5;i++) {//반복실행 1회당 4명에게 1장씩 카드 배부
		player1[i]=deck.pick(cardIndex++);
		player2[i]=deck.pick(cardIndex++);
		player3[i]=deck.pick(cardIndex++);
		player4[i]=deck.pick(cardIndex++);
		}
		System.out.printf("player1 : ");
		for(int i =0;i<5;i++)
		System.out.printf("%s", player1[i]);//.toString()이 생략될 수 있기 때문에 생략
		System.out.println();
		System.out.printf("player2 : ");
		for(int i =0;i<5;i++)
		System.out.printf("%s", player2[i]);
		System.out.println();
		System.out.printf("player3 : ");
		for(int i =0;i<5;i++)
		System.out.printf("%s", player3[i]);
		System.out.println();
		System.out.printf("player4 : ");
		for(int i =0;i<5;i++)
		System.out.printf("%s", player4[i]);
		System.out.println();
		
// 별도의 내용임 -----------------------------------------------------------------------------------------------------------
		
		Card c1 = new Card(Card.diamond,13);
		System.out.println(c1.toString() );
		Card c2 = new Card();
		System.out.println(c2.toString() );
		
		// toString()메서드를 정의하고 포함한 클래스
		// 그 클래스 형태대로 만든 객체는 System.out.println() 으로 참조변수를 출력했을 때
		// "패키지 이름, 클래스 이름, @해시코드" 가 출력되는 것이 아니라
		// toString()메서드가 리턴해주는 String값이 출력됩니다.
		System.out.println(c1); // c1뒤에 .toString()이 생략된 형태 (숨어 있는 것 처럼)
		System.out.println(c2);
		
		// 이것은 참조변수 단독으로 사용되기 보단 다른 연산에 참조변수가 참여하고 있을 때 적용되는 규칙
		String result = "카드 1: "+c1;
		System.out.println(result);
		result = "카드 2: "+ c2;
		System.out.println(result); 
	}

}
