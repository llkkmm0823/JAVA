package days17;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IO16 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		File d = new File("D:\\JAVA01\\Java_se\\temp");
		if(!d.exists())d.mkdirs();
		File file = new File(d,"MyClass.dat");
		//파일 다시 읽어오기
		
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		MyClass obj = (MyClass) ois.readObject(); //강제캐스팅
		
		System.out.println(obj.name);
		ois.close();
		
		
	}

}
