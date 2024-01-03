public class NthStairs {
    public static int stairs(int n)
    {
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2]= 2;

        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        int ways = stairs(n);
        System.out.println("Total ways to climb"+n+"stairs is"+ways);
    }
}
