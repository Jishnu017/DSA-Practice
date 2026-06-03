class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            tot+=gas[i]-cost[i];
        }
        if(tot<0) return -1;
        int currG=0,in=0;
        for(int i=0;i<n;i++){
           currG+=gas[i]-cost[i];
           if(currG<0){
            in=i+1;
            currG=0;
           }
        }
        return in;
    }
}