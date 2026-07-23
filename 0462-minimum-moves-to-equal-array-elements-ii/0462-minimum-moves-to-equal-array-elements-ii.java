class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int s=0,e=nums.length-1;
        while(s<=e){
            ans+=nums[e]-nums[s];
            s++;
            e--;
        }
        return ans;
    }
}