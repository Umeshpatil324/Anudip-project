package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinarywriteExample {
	public static void main(String[] args) {
		String fileName ="File_01.text";
		
		try(FileOutputStream fos = new FileOutputStream(fileName)){
			
			String data ="Testing binary files";
			fos.write(data.getBytes());
			System.out.println("data written");
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		
		}
		
	}

}
