class Solution {
    public int maximalSquare(char[][] a) {
        int n=a.length,m=a[0].length,ans=0;
        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(a[i-1][j-1]=='1'){
                    dp[i][j]=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1])+1;
                    ans=Math.max(dp[i][j],ans);
                }
            }
        }
        return ans*ans;
    }
}