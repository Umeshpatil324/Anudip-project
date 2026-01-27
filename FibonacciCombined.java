
public class FibonacciCombined{
    public static int fibRecursive (int n){
        if(n<=1){
            return n;
        }
        return fibRecursive(n-1)+ fibRecursive(n-2);
    }
    public static int fibIerative(int n){
        if(n<=1){
            return n;
        }
        int a=0,b=1,c=0;
        for(int i=2; i<=n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;

    }
    public static void main(String[] args){
        int n=10;
        System.out.println("Recursive Fibonacci of"+n+"="+fibRecursive(n));
        System.out.println("Recursive-> Time Complexity:O(2^n),Space Complexity:O(n)");

        System.out.println("Iterative Fibonacci of"+n+"="+fibIerative(n));
        System.out.println("Iterative-> Time Complexity:O(n),Space Complexity:O(1)");

    }
}
