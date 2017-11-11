/**
 * Given a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.

The tilt of the whole tree is defined as the sum of all nodes' tilt.

题意：让你计算一棵二叉树的什么什么权值和。一个点的权值定义为其左子树上所有Node的val和与右子树
 *   上所有Node的val和之差的绝对值。让你计算树上所有节点的权值和。
 *   
 *    
 思路：深搜一遍，用全局变量记录每个节点的权值即可，水题。 
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int ans=0;
    public int dfs(TreeNode root){
        int leftVal=0,rightVal=0;
        if(root==null) return 0;
        if(root.left!=null) leftVal=dfs(root.left);
        if(root.right!=null) rightVal=dfs(root.right);
        ans+=Math.abs(rightVal-leftVal);
        return leftVal+rightVal+root.val;
    }
    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }
}