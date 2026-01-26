package String;
import java.util.Scanner;
public class password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String psd = "umesh";
		System.out.println("enter the password");
		String n = sc.nextLine();
		for(int i=0; i<=n.length(); i++) {
		System.out.println(n.codePointAt(i));
		}
		
}
	}


		