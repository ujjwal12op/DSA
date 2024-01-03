public class FibonacciSeriesTopDown {

    // Time complexity : O(n)
    // Space Complexity : O(1)
    
    // Top Down Approach
    public static int fib(int n)
    {
        int a=0;
        int b=1;
        int c;


        // base condition
        if(n==0){
            return a;
        }
        
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }

        return b;
    }
    public static void main(String[] args) {
        int n=6;
        int res= fib(n);

        System.out.println("The fibonacci sum of "+n+"is"+res);
    }
}
