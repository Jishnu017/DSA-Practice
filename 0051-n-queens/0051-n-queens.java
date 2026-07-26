class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        int[] q=new int[n];
        Set<Integer> cols=new HashSet<>();
        Set<Integer> negD=new HashSet<>();
        Set<Integer> posD=new HashSet<>();
        bt(ans,n,0,q,cols,negD,posD);
        return ans;
    }
    void bt(List<List<String>> ans,int n,int row, int[] q, Set<Integer> cols, Set<Integer> rightD, Set<Integer> leftD){
        if(row==n){
            ans.add(board(n,q));
            return;
        }
        for(int col=0;col<n;col++){
            if(cols.contains(col) || rightD.contains(row-col) || leftD.contains(row+col)) continue;
            q[row]=col;
            cols.add(col);
            rightD.add(row-col);
            leftD.add(row+col);
            bt(ans,n,row+1,q,cols,rightD,leftD);
            cols.remove(col);
            rightD.remove(row-col);
            leftD.remove(row+col);
        }
        return;
    }
    List<String> board(int n, int[] q){
        List<String> brd=new ArrayList<>();
        for(int i=0;i<n;i++){
            char[] c=new char[n];
            Arrays.fill(c,'.');
            c[q[i]]='Q';
            brd.add(new String(c));
        }
        return brd;
    }
}