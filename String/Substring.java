package String;
import java.util.Scanner;
public class Substring {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char ch;
	System.out.println("enter the name: ");
	
	  String S = sc.next();
	  if (S=="a"|| S=="e"|| S=="i"|| S=="o"|| S=="u") {
		  System.out.println(S.substring(0));
	  }
	  
	}
	

}
