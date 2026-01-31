package Encapsulation;

public class Student {
	private String name;
	private String branch;
	private int id;
	
	public String getName() {
		return name;
		
	}
	public String getBranch() {
		return branch;

	}
	public int getId() {
		return id;
		
	}
	public void setName( String name) {
		this.name = name;
	}
	public void setBranch(String branch) {
		this.branch =branch;
		
	}
	public void setId( int id) {
		this.id = id;
	}
	public void shoInfo() {
		System.out.println(name);
		System.out.println(branch);
		System.out.println(id);
	}
	
}
