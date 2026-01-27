
public class Home {
	
		public static void main(String[] args) {
			Employment E1 = new Employment();
			Employment E2 = new Employment();
			Employment E3 = new Employment();
			
			E1.name = "umesh"; E1.degree = "BE"; E1.salary ="35 lakh";
			E2.name = "raj"; E2.degree = "B.TECH"; E2.salary ="25 lakh";
			E3.name = "rohit"; E3.degree = "BCA"; E3.salary ="15 lakh";
			 

			E1.showInfo();
			System.out.println();
			
			E2.showInfo();
			System.out.println();
			
			E3.showInfo();
			System.out.println();
		}
	}


