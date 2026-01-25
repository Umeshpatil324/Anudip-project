package polymorphism;

public class multiply { 
	public void Multiply (int a, int b) {
		System.out.println(a*b);
	}
	public void Multiply (double a , double b) {
		System.out.println(a*b);
	}
	public void Multiply (int a, int b , int c) {
		System.out.println(a*b*c);
	}


public static void main (String [] args) {
	multiply m = new multiply();
	m.Multiply(25,25);
	m.Multiply(78,56);
	m.Multiply(25,25,25);
}

}
