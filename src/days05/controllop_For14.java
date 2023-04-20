package days05;

public class controllop_For14 {

	public static void main(String[] args) {

		// 1. 구구단 1단부터 10단까지 출력하세요
		
		/*int i, j;
		for(i=1;i<=10;i++) {
			for(j=1;j<=10;j++) {
				System.out.printf("%dx%d=%2d ",i,j,(i*j));//2d를 하는 이유는 그냥 줄간격 함 맞춰보려고 넣는것
			}
		    System.out.println();
		}
		*/
		
		/* 2. 구구단 2단부터 9단까지 , 한개 단이 세로로 표시
		int i, j;
		for(i=1;i<=9;i++) {
			for(j=2;j<=9;j++) {
				System.out.printf("%dx%d=%2d ",j,i,(i*j));
			}
		    System.out.println();
		}
		*/
		
		//3. 2, 3, 4, 5단은 상단에 나머지는 하단에
		int i, j;
		for(i=1;i<=9;i++) {
			for(j=2;j<=5;j++) {
				System.out.printf("%dx%d=%2d ",j,i,(i*j));
			}
		    System.out.println();
	}
		System.out.println();
		for(i=1;i<=9;i++) {
			for(j=6;j<=9;j++) {
				System.out.printf("%dx%d=%2d ",j,i,(i*j));
			}
		    System.out.println();
		}
		
}
}