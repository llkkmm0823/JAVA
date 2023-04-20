package days07;

public class Method07 {

	public static void main(String[] args) {

		int [] a = {50,60,80,70,20,10,60,120,64,150};
		// a배열을 오름차순 또는 내림차순으로 정렬해서 출력하는 아래 메서드를 작성하세요
		
		sortAsc(a); // 오름차순 정렬 후 출력
		System.out.println();
		sortDesc(a); // 내림차순
		System.out.println();
	}
	public static void sortAsc(int [] a) {
		for(int i =0 ; i<a.length;i++) {
			for(int j = i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]= a[j];
					a[j]= temp;		
				}
			}
		}
		for (int k : a) System.out.printf("%d " ,k);
	}
	public static void sortDesc(int [] a) {
		for(int i =0 ; i<a.length;i++) {
			for(int j = i+1; j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp =a[i];
					a[i]= a[j];
					a[j]= temp;		
				}
			}
		}
		for (int k : a) System.out.printf("%d " ,k);
	
		
		
	}
}



	
	
