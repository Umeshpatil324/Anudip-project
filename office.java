package Encapsulation;

public class office {
	public static void main(String[] args) {
		Employment e = new Employment();
		
		System.out.println(e.getName());
		System.out.println(e.getDesg());
		System.out.println(e.getSalary());
		
		
		e.setName("rohan");
		e.setDesg("manger ");
		e.setSalary(45f);
		
		e.showInfo();
	}

}
