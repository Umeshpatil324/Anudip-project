package File_Handling;

import java.io.File;
import java.io.IOException;

public class Example_01 {
	public static void main(String[] args) {
		String file = "First_01";
		File f = new File(file);
		
		
		if(f.exists()) {
			System.out.println("file is already exist");
			
			}else {
				try {
					f.createNewFile();
					System.out.println("file is created");
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
	}

}
