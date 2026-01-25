package polymorphism;

public class Display {
	public void add (String name) {
		System.out.println(name);
	}
	public void add (int age) {
		System.out.println(age);
	}
	public void add (float city) {
		System.out.println(city);
	}
	public static void main (String [] args) {
		Display d = new Display();
		d.add("bj");
		d.add(78);
		d.add("pune");
		
}}
