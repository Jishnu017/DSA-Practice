class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        ans=new ArrayList<>();
        Arrays.sort(arr);
        bt(target, 0, new ArrayList<>(), arr);
        return ans;
    }
    void bt(int t,int i, List<Integer> l,int[] arr){
        if(t==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        
        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1]) continue;
            if(arr[j]>t) break;
            l.add(arr[j]);
            bt(t-arr[j], j+1, l, arr);
            l.remove(l.size()-1);
        }
    }
}