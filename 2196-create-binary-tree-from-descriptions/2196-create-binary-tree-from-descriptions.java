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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> nodes=new HashMap<>();
        Set<Integer> children=new HashSet();
        for(int[] arr:descriptions){
            int parent=arr[0];
            int child=arr[1];
            int isLeft=arr[2];
            nodes.putIfAbsent(parent,new TreeNode(parent));
            nodes.putIfAbsent(child,new TreeNode(child));
            children.add(child);
            if(isLeft==1){
                nodes.get(parent).left=nodes.get(child);
            }else {
                nodes.get(parent).right=nodes.get(child);
            }
        }
        for(int val:nodes.keySet()){
            if(!children.contains(val)){
                return nodes.get(val);
            }
        }
        return null;
    }
}