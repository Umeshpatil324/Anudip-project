
public class bankaccount {
	private String accountnumber;
	private String accountname;
	private String accountbalance;
	
	public String getAccountnumber () {
		return accountnumber;
	}
	
	public String getAccountname () {
		return accountname;
	
	}
	
	public String getAccountbalance () {
		return accountbalance;
		
	}
	
	 public void setAccountnumber(String accountnumber) {
		 this.accountnumber = accountnumber;
	 }
	 
	 public void setAccountname(String accountname) {
		 this.accountname = accountname;
	 }

	 
	 public void setAccountbalance(String accountbalance) {
		 this.accountbalance = accountbalance;
	 }
	 
	 public void displayInfo() {
			System.out.println(accountnumber);
			System.out.println(accountname);
			System.out.println(accountbalance);


}
}
