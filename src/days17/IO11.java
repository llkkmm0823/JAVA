package days17;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IO11 {

	public static void main(String[] args) throws IOException {
			//abc.txt 파일의 내용을 읽어와서 콘솔창에 출력하세요
		
		File d = new File("D:\\JAVA01\\Java_se\\temp");
		if(!d.exists())d.mkdirs();		
		
		File fileText = new File(d, "abc.txt");
		
		FileReader frText = new FileReader(fileText);
		
		int dataText; 
		dataText = frText.read();
		
		while(dataText!=-1) { // 읽어낸 한 글자가 파일의 끝을 가리키는 -1이 아니라면 계속 반복
			//while((dataText!=frText.read())!=-1)
			//System.out.print((char)dataText); 로 해도 됨 
			System.out.print((char)dataText);
			dataText = frText.read();	
		}	
			frText.close();
	}
}