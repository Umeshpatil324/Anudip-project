package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EX_05 {
	String fileName ="abc.html";
	
	void createfile() {
		try{File file = new File(fileName);
				if(file.createNewFile()) {
					System.out.println("file created :"+ file.getName());
				}else {
					System.out.println("file already exists");
				}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	void writefile() {
		try(FileWriter fw = new FileWriter(fileName)){
			fw.write("<html><body><h1>welcome to html</h1></body></html>");
			System.out.println("data stored succesfully");
		}catch(IOException e) {
			e.printStackTrace();
					
			
		}
		
	}
	public static void main(String[] args) {
		EX_05 obj =new EX_05();
		obj.writefile();
		
	}
		
	}

