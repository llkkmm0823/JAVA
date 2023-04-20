package days05;

public class controllop_For15 {

	public static void main(String[] args) {

		int i,j;
		for(i=1;i<=10;i++) {
			for(j=1;j<=10;j++) {
				System.out.printf("#");
			}
		    System.out.println();
		
		}
		System.out.println("\n//-----------------------------------------------------\n");
		
		
		for(i=1;i<=10;i++) {
			for(j=1;j<=i;j++) {
				System.out.printf("#");
			}
		    System.out.println();
		
		}
		System.out.println("\n//-----------------------------------------------------\n");
		
		/*역 삼각형 모양 1번째
		for(i=1;i<=10;i++) {
			for(j=1;j<=11-i;j++) {
				System.out.printf("#");
			}
		    System.out.println();
		
		}
		System.out.println("\n//-----------------------------------------------------\n");
		*/
		
		//역 삼각형 모양 2번째
		for(i=10;i>=1;i--) {//i는 10이고 i는1보다 크거나 같은 숫자
			for(j=1;j<=i;j++) {
				System.out.printf("#");
			}
		    System.out.println();
		
		}
		System.out.println("\n//-----------------------------------------------------\n");
		
		
		for(i=1;i<=10;i++) {
			for(j=1;j<=10;j++) {
				if(j >= i )System.out.printf("#");
				else System.out.printf(" ");
			}
		    System.out.println();
		
		}
		System.out.println("\n//-----------------------------------------------------\n");
		
		for(i=10;i>=1;i--) {
			for(j=1;j<=10;j++) {
				if(j >= i )System.out.printf("#");
				else System.out.printf(" ");
			}
		    System.out.println();
		
		}
		System.out.println("\n//-----------------------------------------------------\n");
		
        //삼각형
		for(i=1;i<=10;i++) {
			for(j=1;j<=i+9;j++) {
				if(j>=11-i)System.out.printf("#");
				else System.out.printf(" ");
			}
		    System.out.println();
		
		}
		System.out.println("\n//-----------------------------------------------------\n");
		
		
		
		

		
	}

}
