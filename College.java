package Encapsulation;

public class College {
	public static void main(String[] args) {
		
	
	Student s = new Student();
	
	System.out.println(s.getName());
	System.out.println(s.getBranch());
	System.out.println(s.getId());
	
	s.setName("umesh");
	s.setId(45);
	s.setBranch("csd"); 
	
	s.shoInfo();
		
	}}