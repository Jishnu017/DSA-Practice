/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    List<Integer> list=new ArrayList<>();
    int pointer=-1;
    public void dfs(TreeNode root){
        if(root==null) return ;
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
    public BSTIterator(TreeNode root) {
        dfs(root);
        if(list.size()!=0) {
            pointer=0;
        }
    }
    
    public int next() {
        int ans=list.get(pointer++);
        return ans;
    }
    
    public boolean hasNext() {
        if(list.size()>pointer) return true;
        return false;
    }
}


/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */