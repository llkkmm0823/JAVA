package days08;

import java.util.Scanner;

public class Method08 {

	public static void main(String[] args) {

			int [] a = {56,54,87,89,25,36,57,98};
			
			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴를 선택하세요\n (합계:1, 평균:2, 오름차순 정렬 : 3, 내림차순 정렬 : 4) : ");
			int input = sc.nextInt();
			
			switch(input) {
			case 1 : sum(a);break;
			case 2 : avg(a); break;
			case 3 : sort1(1, a); break; // 하나는 정수 하나는 배열인거임....... 오름차순
			case 4 : sort2(2, a); break; // 내림차순
			}	
			
		}
	public static void sum(int [] b) {
		int tot = 0;
		for(int i=0;i<b.length;i++)
		tot= tot+b[i];
		System.out.println("합계는" +tot);
	}
	public static void avg(int [] b) {
		//sum(b); // 메인 또는 자기 자신 또한 메서드로 호출할 수 있음
		//현재는 값을 불러오는 것을 아직 배우지 못했으므로 넣을 수 있다는 점만 참고
		int tot = 0;
		for(int i=0;i<b.length;i++)
			tot= tot+b[i];
		double avg =tot/(double)b.length;
		System.out.println("평균은"+(int)(avg*100)/100.0);//나눗셈 더블 꼭 쓰기, 소숫점자리 조절하기
	}
	public static void sort1(int a, int [] b) {
		if(a==1) {
		for(int i =0 ; i<b.length;i++) {
			for(int j = i+1; j<b.length;j++) {
				if(b[i]>b[j]) {
					int temp =b[i];
					b[i]= b[j];
					b[j]= temp;		
				
				 
			}
		}
	}
}
		for (int k : b) System.out.printf("%d " ,k);
		System.out.println();
		/*else {
		for(int i =0 ; i<b.length;i++) {
			for(int j = i+1; j<b.length;j++) {
				if(b[i]<b[j]) {
					int temp =b[i];
					b[i]= b[j];
					b[j]= temp;
				}
			}
		}
	}
		
		*/
	}
	public static void sort2(int a, int [] b) {
		for(int i =0 ; i<b.length;i++) {
			for(int j = i+1; j<b.length;j++) {
				if(b[i]<b[j]) {
					int temp =b[i];
					b[i]= b[j];
					b[j]= temp;		
				}
			}
		}
		for (int k : b) System.out.printf("%d " ,k);
}
}