
public class jungle {
	public static void main(String[] args) {
	 River r1 = new River();
	 River r2 = new River();
	 
	 bird b1 = new bird();
	 bird b2 = new bird();
	 
	 animal a1 = new animal();
	 animal a2 = new animal();
	 
	 tree t1 = new tree();
	
	 
	 
	 
	 b1.name = "eagle"; b1.food ="small bird";
	 b2.name = "parrot"; b2.food ="frut";
	  
	 r1.name = "ganga"; r1.length ="500km";
	 r2.name = "tapi"; r2.length ="800km";
	 
	 a1.name = "lion"; a1.color ="yello"; a1.type =" wild animal";
	 a2.name = "tiger"; a2.color ="skin color"; a2.type = "wild animal";
	 
	 t1.name = "mango"; t1.age ="100 year";
	  
	  
	 r1.showInfo();
	 System.out.println();
	 r2.showInfo();
	 System.out.println();
	 
	 b1.showInfo();
	 System.out.println();
	 b2.showInfo();
	 System.out.println();
	 
	 a1.showInfo();
	 System.out.println();
	 a2.showInfo();
	 System.out.println();
	 
	 t1.showInfo();
	 System.out.println();
	   
	   
	   
	}

}
