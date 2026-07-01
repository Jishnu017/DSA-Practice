class Solution {
    public int minRemoval(int[] nums, int k) {
        int ans=0;
        if(nums.length==1) return 0;
        Arrays.sort(nums);
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            while((long) nums[j]*k < (long) nums[i]) j++;
            ans=Math.max(ans,i-j+1);
        }
        return n-ans;
    }
}