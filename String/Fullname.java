package String;
import java.util.Scanner;
public class Fullname {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name :");
		System.out.println("enter middle name :");
		System.out.println("enter last name :");
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		 
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
	    s3 = s3.toLowerCase();
		
	    System.out.print(s1.charAt(0) + ". " + s2.charAt(0) +". ");
			
	    System.out.print(s3.toUpperCase().charAt(0));
		for (int i=1; i<s3.length(); i++) {
			
			System.out.print(s3.charAt(i));
			
			
		}
			
		}
	}


