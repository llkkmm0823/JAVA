package days06;

public class Array06 {

	public static void main(String[] args) {

		// 배열에 있는 값들 중 최댓값과 최솟값을 찾아서 출력하세요
		
		int [] a = { 140, 90, 63, 17, 56, 89, 74, 12, 56, 32, 45, 77};
		
		int max = a[0];
		//이것보다 더 작은 값이 있겄니 하면서 기준값 넣어주거나
		//a의 첫번째 값부터 비교할 수 있도록 넣어놓음
		
		for(int i=1; i<a.length; i++) {
			if(max<a[i])//내가 기억하고있던 숫자보다 더 큰 숫자가 나왔느냐 이거여
				max = a[i];//나왔으면 그걸 기억해라 이거여
		}
		System.out.println("가장 큰 값 : "+max);
		
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			if(min>a[i])
				min = a[i];
		System.out.println("가장 작은 값 : "+min);
		}
		
	}

}
