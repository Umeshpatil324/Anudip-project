package polymorphism;

public class area {
	public void calculate (double radius) {
		System.out.println("The area of circle is :"+ 3.14*radius*radius);
	}
	public void calculate (int l ,int b) {
		System.out.println( "The area of rectangle is :"+ l*b);
	}
	public void calculate (float base , float height) {
		System.out.println("The  area of triangle is :" + 1/2*base*height);
	}
	public static void main (String [] args) {
		calculator c = new calculator();
		  c.add(15,568);
		  c.add(3, 88);
		  c.add(4.5,5.0);
	}

}


