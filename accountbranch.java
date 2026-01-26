
public class accountbranch {
	public static void main(String[] args) {
		
		bankaccount s = new bankaccount();
			
			System.out.println(s.getAccountnumber());
			System.out.println(s.getAccountname());
			System.out.println(s.getAccountbalance());
			
			s.setAccountnumber("284588555");
			s.setAccountname("umesh patil");
			s.setAccountbalance("45820");
			s.displayInfo();
		}
	}


