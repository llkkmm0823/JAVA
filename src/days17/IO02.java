package days17;

import java.io.IOException;

public class IO02 {

	public static void main(String[] args) throws IOException {

//		InputStream 클래스의 read 메서드
//		read() : 입력 스트림으로부터 가장 앞에 위치한 1바이트를 읽어옴
//		read(byte[]):입력스트림의 가장 앞부터 매개변수로 전달된 배열의 크기까지의 바이트를 읽어옴
//		read(byte[] / int startIndex / int size) : 입력 스트림의 가장 앞부터 size 크기만큼 데이터를 읽어옴
//		저장은 매개변수로 전달된 배열의 startIndex 위치부터 저장
		
		byte [] input = new byte[20]; //byte형 정수 20개짜리 배열
		System.out.print("키보드 입력을 실행하세요 : ");
//		입력한 내용은 input 배열에 저장, 입력한 크기 또는 글자수는 size에 저장
		int size = System.in.read(input); // 키보드입력을 input 배열에 입력순서대로 저장하도록 read실행
//		size에는 입력받은 데이터들의 갯수를 저장_갯수 + 엔터 + 입력의 마무리 _ 항상+2가 됨
		System.out.printf("읽어온 바이트의 크기는 %d입니다.\n",size);
		
		for(int i =0 ; i<input.length;i++)
			System.out.printf("%c", (char)input[i]); 
//		 폰트에 따라 콘솔에서 보이는것이 틀리나 출력되는 것은 같음_ 커서 위치 확인
		
// 결과 :
		
//		입력 : ABCDEFG
//		출력
//		읽어온바이트의 크기는 9입니다.
//		ABCDEFG
//		그리고 이상한 글자들 ...
		
//		바이트 수 : 입력글자 +2
//		마지막 이상한 글자들은 new byte에 의해 초기화된 0이 char로 형변환되어 출력된 내용
		
		
	}

}
