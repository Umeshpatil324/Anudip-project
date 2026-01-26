
public class chart {
	public static void main(String[] args) {
		vegtable E1 = new vegtable();
		vegtable E2 = new vegtable();
		vegtable E3 = new vegtable();
		
		E1.name = "potato"; E1.color = "yellow"; E1.rate ="20 per kg";
		E2.name = "onion"; E2.color = "red"; E2.rate ="25 per kg";
		E3.name = "bean"; E3.color = "green"; E3.rate ="15 per kg";
		 

		E1.showInfo();
		System.out.println();
		
		E2.showInfo();
		System.out.println();
		
		E3.showInfo();
		System.out.println();
	}
}


