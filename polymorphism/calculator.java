package polymorphism;

public class calculator {
		public void add (int a ,int b) {
			System.out.println(a+b);
		}
		public void add (int a ,int b ,int c) {
			System.out.println(a+b+c);
		}
		public void add (double a ,double b ) {
			System.out.println(a+b);
		}


	public static void main (String [] args) {
		calculator c = new calculator();
		  c.add(15,56);
		  c.add(3, 8,9);
		  c.add(45,50);
	}

}
