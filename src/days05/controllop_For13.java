package days05;

public class controllop_For13 {

	public static void main(String[] args) {

		//이중 반복문
		//반복 실행문 둘이 중첩되어서 실행되는 구조
		int i, j; //반복 실행 제어를 위한 변수도 별도로 두 개가 필요합니다
		for(i=1;i<=10;i++){ //2. 10번 실행한걸 또 10번 실행
		    for(j=1;j<=10;j++) { //1. 10번 실행
			    //System.out.print("#");
		    	System.out.printf("(%d,%d)",i,j);
			    }
		    System.out.println();
	     }
		
		
		
		
		
		
  }

}
