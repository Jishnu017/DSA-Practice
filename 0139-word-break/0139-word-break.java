class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(String w:wordDict){
                int st=i-w.length();
                if(st>=0&&dp[st]&&s.substring(st,i).equals(w)){
                    dp[i]=true;
                }
            }
        }
        return dp[n];
    }
}