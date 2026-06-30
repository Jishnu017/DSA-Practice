class Solution {
    public int numberOfSubstrings(String s) {
        int[] abc=new int[3];
        Arrays.fill(abc,-1);
        char[] c=s.toCharArray();
        int j=0;
        int cnt=0;
        while(j<c.length){
            abc[c[j]-'a']=j;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<3;i++){
                min=Math.min(min,abc[i]);
            }
            cnt+=(min+1);
            j++;
        }
        return cnt;
    }
}