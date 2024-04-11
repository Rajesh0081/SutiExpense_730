package WebDriver_Examples;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) throws Exception {
		
		
		FileWriter file=new FileWriter("C:\\Users\\dell\\Desktop\\10 PM batch.txt");
		
		file.write("Welcome to the Selenium");
		file.write("\n");
		file.write("This is a text example");
		System.out.println("Written Successfully in the file");
		file.close();
	}
	
}
