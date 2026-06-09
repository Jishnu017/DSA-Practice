class Solution {
    public int monkeyMove(int n) {
        int mod=1000000007;
        int ans=(int)power(2,n,mod)-2;
        return ans+(ans<0?mod:0);
    }
    public long power(long x,int n, int mod){
        long res=1;
        x%=mod;
        if(x==0){
            return 0;
        }
        while(n>0){
            if((n & 1) == 1){
                res=(res*x)%mod;
            }
            n>>=1;
            x=(x*x)%mod;
        }
    return res;
    }
}