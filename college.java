
public class college {
public static void main(String[] args) {
		
	student s = new student();
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getMark());
		
		s.setId(125);
		s.setName("umesh patil");
		s.setMark(75);
		s.displayInfo();
	}
}


