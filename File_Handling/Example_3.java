package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example_3 {
	public static void main(String[] args) {
		String file = "First_01";
		File f = new File(file);
		
		
		try (
			FileReader fr = new FileReader(f);){
			int ch =0;
			while((ch=fr.read()) !=-1) {
				System.out.print((char)ch);
			}
		} catch (Exception e) {


			e.printStackTrace();
		}
	}

}
