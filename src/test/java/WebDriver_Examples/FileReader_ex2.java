package WebDriver_Examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_ex2 {

	public static void main(String[] args) throws Exception {
		
		FileReader reader=new FileReader("C:\\Users\\dell\\Desktop\\Rajesh Jmeter.txt");
		
		BufferedReader file=new BufferedReader(reader);
		
		String line;
		
		while((line=file.readLine())!=null) {
			System.out.println(line);
		}
	}

}
