package Exception;
import java.util.Scanner;
public class namenu {
public static void main(String[] args) {
	try {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the name");
	String s =sc.nextLine();
	System.out.println("enter the n");
	int n = sc.nextInt();
	int n2 = sc.nextInt();
	 System.out.println(s.substring(n, n2));
	
	}
	catch(Exception e) {
		System.out.println("error");
	}
}
}