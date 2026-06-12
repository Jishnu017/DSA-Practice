class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=-1,l=-1;
        int n=nums.length;
        if(n==1 && nums[0]==target) return new int[]{0,0};
        int i=0,j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                f=mid;
                l=mid;
                while(f>0 && nums[f-1]==target) f--;
                while(l<n-1 && nums[l+1]==target) l++;
            break;
            }
            else if(nums[mid]<target) i=mid+1;
            else  j=mid-1;
        }
        return new int[]{f,l};
    }
}