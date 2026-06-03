class Solution {
    public int countCollisions(String dir) {
        int n=dir.length();
        int l=0,r=n-1;
        int count=0;
       while(l<n && dir.charAt(l)=='L'){
        count++;
        l++;
       }
       while(r>=0 && dir.charAt(r)=='R'){
        count++;
        r--;
       }
       for(int i=0;i<n;i++) if(dir.charAt(i)=='S') count++;

       return n-count;
    }
}