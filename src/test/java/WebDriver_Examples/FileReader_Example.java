package WebDriver_Examples;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_Example {

	public static void main(String[] args) throws Exception {
		
		
		FileReader reader=new FileReader("C:\\Users\\dell\\Desktop\\Rajesh Jmeter.txt");
		
		int character;
		
		while((character=reader.read())!=-1) {
			System.out.println((char)character);
		}
		
		
		

	}

}
