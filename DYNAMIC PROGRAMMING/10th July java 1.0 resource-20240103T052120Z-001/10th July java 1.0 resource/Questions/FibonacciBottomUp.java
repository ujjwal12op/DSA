public class FibonacciBottomUp {

    public static int fibHelper(int n,int[] series){
        // Base case:
        if(n==0 || n==1)
        {
            return n;
        }

        if(series[n]!=-1){
            return series[n];
        }

        int x=fibHelper(n-1, series);
        int y=fibHelper(n-2, series);

        series[n]=x+y;

        return series[n];
    }

    public static int fib(int n){
        int fibonacciSeries[] = new int[n+1];

        // Initialize :
        for(int i=0;i<=n;i++)
        {
            fibonacciSeries[i]=-1;
        }

        return fibHelper(n,fibonacciSeries);
    }
    public static void main(String[] args) {
        int n=5;
        int res= fib(n);

        System.out.println("fibonacci of "+n+"is "+res);
    }
}
