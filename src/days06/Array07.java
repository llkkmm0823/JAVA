package days06;

public class Array07 {

	public static void main(String[] args) {

		int [] a = { 140, 90, 63, 17, 56, 89, 74, 12, 56, 32, 45, 77};
		//배열의 값들을 오름차순 또는 내림차순으로 재 배치(정렬)
		
		// 이중반복문을 사용합니다
		// 첫 째 반복문의 제어변수 i
		// 두 번째 반복문의 제어변수 j
		// i=0일때 j는 1~9로 반복시켜서 a[i]와 a[j]둘을 비교하고
		// a[j] 값이 더 작으면 a[i]와 a[j]의 값을 오름차순에 맞게 맞바꿉니다
		
		// i=1 일때 j는 2~9로 반복시켜서 a[i]와 a[j] 둘을 비교
		// i=2 일때 j는 3~9로 반복시켜서 a[i]와 a[j] 둘을 비교
		// i=3 일때 j는 4~9로 반복시켜서 a[i]와 a[j] 둘을 비교
		
		// j번째가 더 작은 값이면  i번째와 j번째를 서로 맞바꿉니다.
		
		int b = 10;
		int c = 20;
		int temp = b;// b에 c를 넣는 순간 b 값이 사라져버리니까 사본 뜨는 것임 b의 사본...
		b=c;
		c=temp;
		
		System.out.println("b : "+b+", c :"+c);
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					//서로 자리를 바꿉니다
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
		}
		for(int i=0; i<a.length; i++)
			System.out.printf("%d   ", a[i]);
		
		
		///////내림차순
		System.out.println();
		for(int i=0; i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {//내림차순은 부등호만 반대로 해주면 됨
					// 뒤에 나보다 큰 값이 있으면 그 값을 기억하라고 하면 되니까
					//서로 자리를 바꿉니다
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
		}
		for(int i=0; i<a.length; i++)
			System.out.printf("%d   ", a[i]);
	}

}
