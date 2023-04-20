package days08;

import java.util.Scanner;

public class Method20 {

	public static void main(String[] args) {

				int [][] scores;
				double [] avg;
				String [] grade;
				Scanner sc = new Scanner(System.in);
				scores = memoryAllocation(sc); //학생 수 과목 수 입력 받은 후 2차원 배열 생성하여 참조값 리턴
				avg = memoryAllocation2(scores.length); // 전달한 학생 수만큼 크기의 배열 생성 후 참조값 리턴
				grade = memoryAllocation3(scores.length);// 전달한 학생 수만큼 크기의 배열 생성 후 참조값 리턴

				input(scores); // s명의 학생이 k개의 과목 점수 입력 (과목점수 입력받을 때, 과목명은 x)
				cals(scores, avg, grade); // 총점, 평균, 학점계산
				output(scores, avg, grade); //양식에 맞게 성적표 출력
				
			}
	public static int[][] memoryAllocation(Scanner sc){
		System.out.print("학생 수를 입력하세요 : ");
		int s =sc.nextInt();
		System.out.print("과목 수를 입력하세요 : ");
		int k =sc.nextInt();
		int[][] score= new int[s][k+1];//+1하는 이유는 총점을 표시할 곳이 필요하기 때문에 열 하나를 더해줘야함
		return score;
	}
	public static double [] memoryAllocation2(int length) {
		double [] a = new double[length];
		return a;
	}
	public static String[] memoryAllocation3(int length) {
		String [] g = new String[length];
		return g;
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

