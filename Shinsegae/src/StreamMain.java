import java.io.File;

import com.sinc.intern.stream.FileObj;

public class StreamMain {

	public static void main(String[] args) {
		String writeMsg = "아! 드디어 끝나는구나!!";
		FileObj obj = new FileObj();
		File file = new File("sinc.txt");
		//obj.saveToFile(file, writeMsg);
		obj.loadToFile(file);
	}

}
