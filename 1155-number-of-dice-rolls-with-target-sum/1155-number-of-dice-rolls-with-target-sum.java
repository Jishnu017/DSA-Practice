class Solution {
    public int numRollsToTarget(int n, int m, int x) {
        int[][] dp=new int[n+1][x+1];
        int mod=1000000007;
        if (n==0 && x==0) 
            return 1;
        if (x<n || n*m<x) 
            return 0;
        for(int i=1;i<=m && i<=x;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=x;j++){
                for(int k=1;k<j&&k<=m;k++){
                    dp[i][j]=(dp[i][j]+dp[i-1][j-k])%mod;
                }
            }
        }
        return dp[n][x];
    }
}