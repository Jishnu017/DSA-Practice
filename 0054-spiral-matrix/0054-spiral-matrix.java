class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0,r=m-1;
        int top=0,bottom=n-1;
        int tot=0;
        while(tot<n*m){
            for(int i=l;i<=r && tot<n*m ;i++){
                ans.add(matrix[top][i]);
                tot++;
            }
            top++;
            for(int i=top;i<=bottom && tot<n*m;i++){
                ans.add(matrix[i][r]);
                tot++;
            }
            r--;
            for(int i=r;i>=l && tot<n*m;i--){
                ans.add(matrix[bottom][i]);
                tot++;
            }
            bottom--;
            for(int i=bottom;i>=top && tot<n*m;i--){
                ans.add(matrix[i][l]);
                tot++;
            }
            l++;
        }
        return ans;
    }
}