
public class student {
	private int id;
	public String name;
	public int mark;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMark() {
		return mark;
	}

	public void setId(int id ) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public void displayInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(mark);
		
	}
}