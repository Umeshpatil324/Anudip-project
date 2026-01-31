package Encapsulation;

public class Employment {
	private String name;
	private String desg;
	private float salary;
	
	public String getName() {
		return name;
	}
	
	public String getDesg() {
		return desg;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	
	}
	public void setSalary(float salary) {
		this.salary = salary;
			
	}
	public  void showInfo() {
		System.out.println(name);
		System.out.println(desg);
		System.out.println(salary);
	}

}

