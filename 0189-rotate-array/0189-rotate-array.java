class Solution {
    public int[] rev(int[] a,int i,int j){
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return a;
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        nums=rev(nums,0,n-1);
        nums=rev(nums,0,k-1);
        nums=rev(nums,k,n-1);
    }
}