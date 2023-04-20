package days07;

public class Array15 {

	public static void main(String[] args) {

			int [] a = {1,2,3,4,5};
			for(int k : a)
					System.out.printf("%d ", k);
			// 반복이 되는 동안 a배열 값이 k변수에 반복 1회당 한 번씩 모두 대입이 될 것이라
			// 결국 위의 명령은 배열값을 차례로 출력하는 효과를 얻습니다
			
			int [][] b = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
			
			System.out.println("\n");

			for(int i=0;i<3; i++) {
				for (int j =0; j<5; j++) {
					System.out.printf("%2d ", b[i][j]);
				}
				System.out.println();
	}
			System.out.println("\n");

			for(int i=0;i<b.length; i++) {//a의 행 갯수가 되는거여
				for (int j =0; j<b[i].length; j++) {//b[i]의 length인 이유는 그림으로 보면 b[1]의 length고 b[2]의 length이기 때문
					// 굳이 값이 똑같은 것으로 나오는데 ex)b[1]도 3임 i로 설정해두는 이유는 array 16_22행으로 ㄱㄱ
					
					System.out.printf("%2d ", b[i][j]);
				}
				System.out.println();
			}
			// b.length : 행의 갯수  , b[i].length : i행의 열의 갯수
			
			// for(int k : a) : 참조 변수로 각 배열의 값을 저장할 수 있는 일반 변수에 ":"로 이어서 작성
			// 그래서 그 배열의 갯수만큼 반복하도록 명령한 내용
			
			System.out.println("\n");
			for( int [] row  : b ) {  // 3회 반복 -> b 제시
				for( int value : row ) { // 5회 반복 -> a[0] or b[1] or b[2]을 제시
					System.out.printf("%2d ", value); // 언젠가는 쓰기는 쓰니까.,..,,,,, 몰라도 아 맞다 그런거 있었지만 해봐봐
					

				}
			}
				System.out.println();

	}
}
			

