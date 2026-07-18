class Solution {
    public int maxCoins(int[] nums) {
        int[] arr=new int[nums.length+2];
        int[][] memo=new int[nums.length+2][nums.length+2];
        for(int i=0;i<nums.length+2;i++){
            if(i==0 || i==nums.length+1) arr[i]=1;
            else arr[i]=nums[i-1];
        }
        int ans= bt(memo,arr,0,arr.length-1);
        return ans;
    }
    int bt(int[][] memo,int[] arr, int left, int right){
        if(left+1==right) return 0;
        if(memo[left][right]>0){
            return memo[left][right];
        }
        int coins=0;
        for(int j=left+1;j<right;j++){
        coins=Math.max(coins,arr[left]*arr[j]*arr[right]+bt(memo,arr,left,j)+bt(memo,arr,j,right));
        }
        memo[left][right]=coins;
        return coins;
    }
}