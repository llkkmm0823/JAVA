package days07;

public class Method04 {

	public static void main(String[] args) {

		// prnTitle() : 성적표 제목, 번호 이름 국어 영어 등과 같은 열 제목을 출력하는 메서드
		// prnScore() : 이름, 국어, 영어, 수학 을 전달받아서 총 점 평균을 계산하고 성적 점수들을 출력하는 메서드
		
		prnTitlepre(); // 성적표 제목 및 열 제목 ( 번호 이름 국어 영어,,,)
		prnScore(1, "홍길동",87,89,97);
		prnScore(2, "홍길서",45,98,78);
		prnScore(3, "홍길남",77,88,99);
		prnTitlePost(); // 성적표 마지막에 그어지는 선
		
	}
	public static void prnTitlepre() {
		System.out.printf("\t\t### 성적표 ###");
		System.out.printf("\n--------------------------------------------------\n");
		System.out.printf("번호\t이름\t\t국어\t영어\t수학\t총점\t평균\n");
	}
	public static void prnScore(int num,String name, int kor ,int eng, int mat) {
		int total;
		double avg;
		total = (kor+eng+mat);
		avg = (total/3.0);
		System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.1f\n",num,name,kor,eng,mat,total,avg);
	}
	public static void prnTitlePost() {
		System.out.printf("--------------------------------------------------");
	}
}
