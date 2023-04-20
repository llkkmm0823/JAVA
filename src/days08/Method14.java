package days08;

public class Method14 {

	public static void main(String[] args) {

		int [] a = {65,87,89,12,45,36,57,45};
		int tot = sum(a);
		double avg = average(a);
		prn(a,tot,avg); // 배열 안의 숫자들을 출력 후 합계 평균 출력
	}
	public static int sum(int[]a) {
		int i = 0;
		int tot =0;
		for(i=0;i<a.length;i++)
		tot = tot+a[i];
		return tot;
	}
	public static double average ( int [] a) {
		int tot=sum(a);
		return tot/(double)a.length;
	}
	public static void prn(int [] d, int t, double a) {
		System.out.print("배열의 요소 : ");
		for(int k : d)System.out.printf("%d ", k);
		System.out.println();
		System.out.println("합계 : " + t);
		System.out.println("평균 : " + a);
		//System.out.printf("합계 : %d, 평균 : %.1f\n",t,a); 도 가능
	}
}
