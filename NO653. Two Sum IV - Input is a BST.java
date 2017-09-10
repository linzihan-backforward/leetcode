/**
 * Given a Binary Search Tree and a target number, 
 * return true if there exist two elements in the BST such that their sum is equal to the given target.
 * 题意：给一个BST、一个k，问BST是否存在两个节点val值之和为k。
 * 思路：对于一个BST上的节点val我们只需要知道是否还有一个k-val。可以用set或map。
 *       根据他是一个BST还可以进一步优化，不过这些都不重要了。
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
    Set<Integer> set = new HashSet<Integer>();
    public boolean findTarget(TreeNode root, int k) {
        
        if(find(root,k)) return true;
        else return false;
    }
    public boolean find(TreeNode root,int k){
        if(root==null) return false;
        if(set.contains(k-root.val)) return true;
        else set.add(root.val);
        if(find(root.left,k)) return true;
        if(find(root.right,k)) return true;
        return false;
    }
}