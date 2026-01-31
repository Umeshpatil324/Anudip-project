package Classandobject;

public class college {
	public static void main(String[] args) {
		student s1 = new student();
		
		student s2 = new student();
		
		student s3 = new student();
		
		s1.name = "umesh"; s1.roll = 45; s1.address = "pune";
		
		s2.name = "rohit"; s2.roll = 46; s2.address = "mumbai";
		
		s3.name = "mohit"; s3.roll = 47; s3.address = "dhule";
		
		s1.show();
		System.out.println();
		
		s2.show();
		System.out.println();
		
		s3.show();
		System.out.println();
	}

}
