class Solution {
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd) {
        int minL=3000,minW=3000,res=3000;
        int n=lst.length;
        int m=wst.length;
        for(int i=0;i<n;i++){
            minL=Math.min(minL,lst[i]+ld[i]);
        }
        for(int i=0;i<m;i++){
            minW=Math.min(minW,wst[i]+wd[i]);
            res=Math.min(res,Math.max(wst[i],minL)+wd[i]);
        }
        for(int i=0;i<n;i++){
            res=Math.min(res,Math.max(lst[i],minW)+ld[i]);
        }
        return res;
    }
}