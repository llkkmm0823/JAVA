package days17;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IO12 {

	public static void main(String[] args) throws IOException {

		File dir = new File("D:\\JAVA01\\Java_se\\temp");
		if(!dir.exists())dir.mkdirs();		
		
		File file_binary = new File( dir, " binary_data_using_buffer.dat");
		File file_text = new File( dir, " text_data_using_buffer.txt");
		
		//버퍼를 이용한 이진 데이터 출력을 위한 객체 생성
		FileOutputStream fos = new FileOutputStream(file_binary);
		BufferedOutputStream bosBinary = new BufferedOutputStream(fos);
		
		//버퍼를 이용한 문자 데이터 출력을 위한 객체 생성
		BufferedWriter bwText = new BufferedWriter(new FileWriter(file_text));
		
//		버퍼에 내용 출력
//		버퍼에 출력된 데이터는 해당 스트림이 close 되거나 해당 스트림 객체에 대해서 flush메서드가 호출되면 실제 스트림을 통해 출력됨
		bosBinary.write(255);
		bosBinary.write(22);
//		flush메서드는 버퍼에 쌓여있는 데이터를 출력하는 메서드 (버퍼를 비우는 명령 실행);
		bosBinary.flush();
		
		bwText.write("Hello");
		bwText.write("World~!");
//		flush메서드는 버퍼에 쌓여있는 데이터를 출력하는 메서드 (버퍼를 비우는 명령 실행);
		bosBinary.flush();
		
		bosBinary.close();
		bwText.close();
		

		
	}

}
