class Solution {
    public int countCollisions(String dir) {
        int n=dir.length();
        int l=0,r=n-1;
        int count=0;
       while(l<n && dir.charAt(l)=='L') l++;
       while(r>=0 && dir.charAt(r)=='R') r--;
       while(l<=r){
        if(dir.charAt(l)!='S'){
            count++;
        }
        l++;
       }
       return count;
    }
}