package days08;

import java.util.Scanner;

public class Method18 {

	public static void main(String[] args) {

		int [][] scores;
		double [] avg;
		String [] grade;
		
		int s=getStudentNumber(); // 학생 수를 입력받아서 리턴하는 메서드
		int k=getSubjectNumber(); // 과목 수를 입력받아서 리턴하는 메서드
				
		avg = new double [s];
		grade = new String[s];
		scores = new int [s][k+1]; // k는 과목수이며 총점 열을 위해 k+1을 지정
		input(scores); // s명의 학생이 k개의 과목 점수 입력 (과목점수 입력받을 때, 과목명은
		cals(scores, avg, grade); // 총점, 평균, 학점계산
		output(scores, avg, grade); //양식에 맞게 성적표 출력
	}
	public static int getStudentNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 : ");
		return sc.nextInt();
	}
	public static int getSubjectNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목 수를 입력하세요 : ");
		return sc.nextInt();
	}
	public static void input (int[][]s) {
		// s 참조변수는 main의 scores 변수 값을 받는 매개변수이므로,
		// s 이름으로 배열에 값을 넣으면 main의 scores 배열에 값을 넣는 것과 같습니다
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<s.length ; i++) {
			for(int j=0 ; j<s[i].length-1;j++) {
				System.out.printf("%d번 학생의 %d과목 점수 : " , i+1,j+1);
				s[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
			}
			public static void cals (int[][]s,double[] a, String[] g) {
				String [] grade = {"F","F","F","F","F","F","D","C","B","A","A"};
				
				for(int i =0; i<s.length ; i++) {//학생의 인원 수 만큼 반복실행
					
					int k = s[i].length-1; 
					// s[i].length : i 행의 열 갯수, 마지막 열의 첨자 s[i].length-1
					
					for(int j=0 ; j<k ; j++) { // 입력받은 과목 수 만큼 반복 실행
						s[i][k] += s[i][j]; // 첫 번째 열부터 마지막 열의 바로 전 칸까지의 값을 마지막칸에 합산
					} // 총점 계산
					
					a[i] = s[i][k] / (double)k; //평균 계산
					g[i] = grade[(int)(a[i]/10)]; // 학점 선택
					
				}	
				//반드시 엑셀에 학생 수 행 과목 수 +1열 만큼 배열을 그려놓고 시뮬레이션 해보세요
			}	
			public static void output (int[][]s,double [] a, String[] g) {
				System.out.printf("\t\t### 성적표 ###");
				System.out.printf("\n----------------------------------------------------------\n");
				System.out.printf("번호\t");
				
				for(int i=0;i<s[0].length-1;i++) 
					System.out.printf("%d과목\t",i+1);
				System.out.printf("총점\t평균\t학점\n");
				System.out.println("----------------------------------------------------------");
					
					for(int i=0;i<s. length;i++) {
						System.out.printf("%d\t",i+1); // 번호 출력
					for(int j=0; j<s[i].length; j++) 
						System.out.printf("%d\t", s[i][j]); // 1과목부터 모든 과목점수와 총점까지 출력
					System.out.printf("%.1f\t",a[i]);
					System.out.printf("%s\n",g[i]); 
				}
				System.out.println("----------------------------------------------------------");
				}
			
		}
