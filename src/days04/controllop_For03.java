package days04;

public class controllop_For03 {

	public static void main(String[] args) {

		
		// 1부터 10까지의 합
		// int sum = 1+2+3+4+5+6+7+8+9+10;
		
		int sum = 0;
		int i;
		for(i=1;i<=10000;i++) {
			sum=sum+i;
			System.out.println("1부터"+i+"까지의 합 : " + sum);
			
		}
		
		
	}

}
