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
class Solution {
    List<Integer> ans;
    public TreeNode balanceBST(TreeNode root) {
        ans=new ArrayList<>();
        dfs(root);
        return build(0,ans.size()-1);
    }
    void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        ans.add(root.val);
        dfs(root.right);
    }
    TreeNode build(int l, int r){
        if(l>r) return null;
        int mid=(l+r)/2;
        TreeNode node=new TreeNode(ans.get(mid));
        node.left=build(l,mid-1);
        node.right=build(mid+1,r);
        return node;
    }
}