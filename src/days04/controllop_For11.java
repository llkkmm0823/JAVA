package days04;

public class controllop_For11 {

	public static void main(String[] args) {

		//1부터20사이 : 이전 숫자와 다음 숫자가 세트를 이루는 수열 출력
		// ex. (0,1,2) (1,2,3)......(19,20,21)
		int i;
		for(i=1;i<=20;i++) {
		if(i>=20) continue;
			System.out.print("("+(i-1)+","+i+","+(i+1)+")");
			if(i%10==0)System.out.println();//굳이 나는 줄바꿈을 해야겠다 하면은 쓰셈

		
	}
	}
}
