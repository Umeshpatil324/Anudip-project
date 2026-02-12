package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name;");
		String n = sc.nextLine();

		String file = "First_01";
		File f = new File(file);

		try (FileWriter fw = new FileWriter(f);) {
			fw.write(n);

			System.out.println("writtern inside the file");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
