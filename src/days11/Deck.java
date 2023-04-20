package days11;

public class Deck {//카드가 들어있는 카드 집을 데크라고함
	//52장 만들어야됨 배열 활용
	
	private Card [] cards = new Card[52]; //허락된 사람 이외에는 그 내용을 볼 수 없습니다요
	// cards[0] = new Card(Card.spade,1); //여기는 변수를 생성하는 곳인데 메서드도 없이 명령을 쓰니까 에러났었음
	// cards[51] = new Card(Card.clover,13);

	Deck() {
		int cardIndex=0;
		for(int kind =4; kind>=1;kind--) { // kind를 i로 썼어도 됐음
			for(int number =1;number<=13; number++) {//마찬가지로number를 j로 써도 됨
				cards[cardIndex] = new Card(kind , number); // i,j도 됨
				cardIndex++;
			}
		}
	}
	public Card pick(int i) {//복잡하니까 몇 번째 카드를 가져올 것인지 픽하도록 전달인수를 받을 예정
		return cards[i]; // 전달된 i값에 의해 i번째 카드가 리턴
	}
	
	public void shuffle() {//카드를 섞는 메서드
		 for (int i =0;i<cards.length;i++) {
			 //반복이 실행되는 동안 i번째 카드와 random번째 카드의 자리를 서로 맞바꿈 -> 난수(특정한 순서나 규칙을 가지지 않는 수)가 필요함
			 int r = (int)(Math.random()*52);
			 Card temp = cards[i]; // temp에 i값 저장
			 cards[i] = cards[r]; // i에  r값 저장
			 cards[r] = temp;//r에 다시 i값을 가지고 있는 temp를 저장해주면 i와 r의 자리가 바뀜
		 }
		
	}
}
