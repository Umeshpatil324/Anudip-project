package Abtracation;
//@FunctionalInterface//( this is annotation, to say that only single abraction is allow , 
//                      for say devlpoer to do not add your abtraction add in this interface)
public interface MyInterface {
	public void sayHello();
	default void sayby() {
		
	};
	public static void sayok() {
		
	};
	
	public void saybyy();

}
