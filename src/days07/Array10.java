package days07;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {

		
		// 야구 게임 프로그램
		// 컴퓨터가 나에게 알려주지 않은 숫자를 질문과 답변을 통해 맞춰가는 게임
		// 사용자에게 알려주지 않은 숫자 : 6 5 7 같은 한자리 숫자 세개를 준비
		// 질문 : 3 6 7 같은 한 자리 숫자 세 개를 입력받아 비교합니다
		// 답변 : 같은 숫자가 자릿수까지 같으면 S 숫자만 같으면 B를 출력
		// 숫자 하나는 0~9까지... 세 개의 숫자 중 중복 숫자 없음
		// 컴퓨터가 갖고 있는 숫자 : 5 6 8
		// 사용자가 컴퓨터에게 질문 : 4 5 8 
		// 답변 -> 1S 1B
		
		Scanner sc = new Scanner(System.in);	
		
		// 1. 컴퓨터가 기억할 숫자를 저장할 배열, 사용자가 입력한 숫자를 저장할 배열 생성
		int[] com = new int[3]; // 컴퓨터가 기억할 숫자를 저장할 배열
		int[] user = new int[3];// 사용자가 입력한 숫자를 저장할 배열
		int count1 =0,count2 =0;
		int sum1=0, sum2=0;
		// 2. 컴퓨터가 사용자에게 공개하지 않은 숫자(0~9) 세 개를 발생시켜서 배열에 저장. 중복X
		int i=0;
		int j=0;
		while(i < com.length) {
			com[i]=(int)(Math.random()*10);
		
			// 방금 결정된 숫자가 i번째이고, 0번째부터 i-1번째까지의 숫자와 중복된 값이 있는지 검사
	
			for ( j =0; j<i; j++) {//j가 i보다 작지않을때 끝나는것
			if(com[j]==com[i])break; // 검사 도중 같은 값이 나오면 바로 반복종료
		}
		  // 같은 값이 있었다면 0~i-1까지 가다가 중간에 멈췄을 것
		 //  같은 값이 없었다면 j는 i와 같은 값에서 종료되었을 것
			
		if(i==j) i++; // 현재 숫자와 이전 숫자 사이에 같은 값이 없었다면 다음 숫자를 위해 i가 1 증가합니다 // 권장하는 중복제거 방법
		}
		// System.out.println(com[0]+""+com[1]+""+com[2]);//이제 가리고 게임해야댐
		int s =0 , b=0;
		do {
	  // 3. 사용자에게서 세 개의 숫자(0~9 세 개)를 입력받아서 user 배열에 저장
		
		// 입력 방법 #1_숫자 한 자리씩 입력받기(원시적이여)
		/*System.out.println("입력 ( 반드시 한 자리 숫자를 입력하세요) :  ");
		user[0]=Integer.parseInt(sc.nextLine());
		System.out.println("입력 ( 반드시 한 자리 숫자를 입력하세요) :  ");
		user[1]=Integer.parseInt(sc.nextLine());
		System.out.println("입력 ( 반드시 한 자리 숫자를 입력하세요) :  ");
		user[2]=Integer.parseInt(sc.nextLine());
		*/
		
		// 입력 방법 #2_세자리 한꺼번에
		/*System.out.println("입력 ( 세 자리 숫자를 중복없이 입력하세요) :  ");
		int num = Integer.parseInt(sc.nextLine());
		user[0] = num/100;  //123/100 -> 1
		user[1] = (num%100) / 10;  // 123%100 -> 23   23/10 -> 2
		user[2] = (num%10);  // 123%10 -> 3
		// 다 분리되어서 들어감
		*/
		
		// 입력 방법 #3_세자리 한꺼번에
		System.out.print("입력 : ");
		String num = sc.nextLine();  // 456
		user[0]=num.charAt(0) - '0'; // '4' - '0' -> 4
		user[1]=num.charAt(1) - '0'; // '5' - '0' -> 5
		user[2]=num.charAt(2) - '0'; // '6' - '0' -> 6
		
		// System.out.println(user[0]+""+user[1]+""user[2]+"");
		
		//4. com과 user 배열의 각 요소들을 서로 서로 비교해서 같은 값이 있는지, 자리는 같은지 다른지 판단해서
		// S와 B를 예시처럼 출력
		s = 0;
		b = 0;
		for(i=0; i<com.length; i++) {
			for(j=0;j<user.length;j++) {
				if(com[i] == user[j]) {
					if(i==j) s++;
					else b++;
				}
			}
		}
			System.out.println(s + " Strike  "+b + " Ball");
		
}while(s!=3); 			//5. 맞출 때 까지 (3S 0B) 2.~4.까지를 반복합니다
System.out.println("맞췄습니다. 프로그램을 종료합니다");
	}
}
				
				
		
			



