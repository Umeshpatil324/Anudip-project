package Exception;
import java.util.Scanner;
public class home {
	public static void main(String[] args) {
		 int[] array = {45,57,8,27,72,65,5,52,65,5};
		try {	
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the index :");
		 int n = sc.nextInt();
		 System.out.println(array[n]);
		    }
		    catch(Exception e) {
		    	System.out.println("wrong index");
		    }
	}}
	


