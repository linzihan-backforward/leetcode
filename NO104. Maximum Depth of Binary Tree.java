/**Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * 题意：求二叉树的深度
 * 思路:简单深度搜索即可
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int deepSearch(TreeNode root ,int depth){
        if((root.left!=null)&&(root.right!=null)) return Math.max(deepSearch(root.left,depth+1),deepSearch(root.right,depth+1));
        if(root.left!=null) return deepSearch(root.left,depth+1);
        if(root.right!=null) return deepSearch(root.right,depth+1);
        return depth;
    }
    public int maxDepth(TreeNode root) {
        int ans=0;
        if(root!=null)
            ans=deepSearch(root,1);
        return ans;
    }
}