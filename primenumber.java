
public class primenumber {
	public static void main(String[] args) {
		int num = 50,count=0
				  ,i=2;
		while(count<num) {
			boolean isPrime = true;
			for(int j=2; j*j<=i;j++) {
				if(i%j==0) {
					isPrime =false;
					break;
					
				}
				} 
			if(isPrime) {
				System.out.println( i + "isPrime");
				count++;
			}
			i++;
			
		}
	}

}
