package days17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO10 {

	public static void main(String[] args) throws IOException {
//		1. 선거에 있어서 "최고득표자"가 2인 이상인 때에는 국회의 재적의원 과반수가 출석한 공개회의에서 다 수표를 얻은자를 "당선자"로 함
//		    이 헌법시행 당시의 법령과 조약은 이 헌법에 위배되지 아니하는 한 그 효력을 지속함
//		2. 국회의 회의는 공개함. 다만, 출석의원 50%이상의 찬성이 있거나 의장이 국가의 안전보장을 위하여 필요하다고 인정할 때에는 공개하지 아니할 수 있음.
	
//		abc.txt에 위의 텍스트를 써넣으세요 (경로는 D:\JAVA01\JAVA_se\temp)
//		한 번의 명령으로도 가능, 파일출력 명령을 두번 또는 세번에 나누어 실행 또한 가능
//		문단 간역(두줄 띄움)유지하여 출력 (FileWriter를 이용)
		
		File d = new File("D:\\JAVA01\\Java_se\\temp");
		if(!d.exists())d.mkdirs();
		
		File fileText = new File(d, "abc.txt");
		FileWriter fwText = new FileWriter(fileText);
		fwText.write("1. 선거에 있어서 \"최고득표자\"가 2인 이상인 때에는 국회의 재적의원 과반수가 출석한 공개회의에서 다 수표를 얻은자를 \"당선자\"로 함\n이 헌법시행 당시의 법령과 조약은 이 헌법에 위배되지 아니하는 한 그 효력을 지속함\n\n");
		fwText.write("\n2. 국회의 회의는 공개함. 다만, 출석의원 50%이상의 찬성이 있거나 의장이 국가의 안전보장을 위하여 필요하다고 인정할 때에는 공개하지 아니할 수 있음.");
		fwText.close();
		
	}

}
