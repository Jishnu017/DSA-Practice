class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        ans=new ArrayList<>();
        bt(0, 0, arr, new ArrayList<>(), target);
        return ans;
    }

    void bt(int sum, int i, int[] arr, List<Integer> l, int t) {
        if (sum == t) {
            ans.add(new ArrayList<>(l));
            return;
        }
        if (sum > t) {
            return;
        }
        for(int j=i;j<arr.length;j++){
            l.add(arr[j]);
            sum = sum + arr[j];
            bt(sum, j, arr, l, t);
            sum = sum - arr[j];
            l.remove(l.size() - 1);
        }
    }
}