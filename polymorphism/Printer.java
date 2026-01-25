package polymorphism;

public class Printer {
	public void printData(int a) {
		System.out.println(a);
	}
	public void printData(String a) {
		System.out.println(a);
	}
	public void printData(boolean a) {
		System.out.println(a);
	}


public static void main (String [] args) {
	Printer p = new Printer();
	 p.printData(true);
	 p.printData(45);
	 p.printData("umesh");
}

}