package days06;

public class Array08 {

	public static void main(String[] args) {

		int[] a = new int[6];
		// 다섯 세트가 출력되도록 프로그램을 변경해주세요
				
				//1~45사이의 임의의 난수를 a 배열에 여섯개 저장한 후,
				//오름차순으로 정렬해서 출력하세요
				//중복은 신경ㄴㄴ
for (int k=1;k<=5;k++) {// 다섯 세트 출력하기, 중괄호 주의해서 쓰기
	
			int i=0;
			int j=0;
			while( i < a.length) {
				a[i]=(int)(Math.random()*45)+1;
				for(j=0;j<i;j++) {
						if(a[j]==a[i])break;
					}
					if(i==j) i++;
					}
				
			/*for(int i=0; i<6; i++) {
			a[i] =(int)(Math.random()*45) +1;
			int count = 0;//중복 제외하기
			for ( int j =0; j<i; j++) {
				if(a[j]==a[i])count++;//중복이 하나라도 있으면 증가할것이여, 중복이 나오면 다시 뽑아. 하는거임
		}
		
			
		if(count > 0) i--;//여기서 빼버리면 증가됐던게 원래자리로 돌아오니까 쓰는거여
			
		}
		*/
		//괄호하나 뺴먹었다고 죽어라고 0만 뱉더라 컴터놈 절대 빼먹지말자ㅡㅡ
		for(i=0; i<a.length; i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
				}		
			}
		}
		for(i=0; i<a.length; i++)
			System.out.printf("%2d   ", a[i]);
		    System.out.println();
}
}
	}


		



