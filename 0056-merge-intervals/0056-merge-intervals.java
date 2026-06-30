class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        ans.add(in[0]);
        for(int[] a:in){
                if(a[0]<=ans.get(ans.size()-1)[1] && a[1]<=ans.get(ans.size()-1)[1]){
                    continue;
                }else if(a[0]<=ans.get(ans.size()-1)[1]){
                    ans.get(ans.size()-1)[1]=(a[1]);
                }else{
                    ans.add(a);
                }
        }
        int s=ans.size();
        int[][] res=new int[s][2];
        for(int i=0;i<s;i++){
                res[i][0]=ans.get(i)[0];
                res[i][1]=ans.get(i)[1];
        }
        return res;
    }
}