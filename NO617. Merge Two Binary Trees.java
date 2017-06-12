/**
 * Given two binary trees and imagine that when you put one of them to cover the other, 
 * some nodes of the two trees are overlapped while the others are not.

	You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, 
	then sum node values up as the new value of the merged node. 
	Otherwise, the NOT null node will be used as the node of new tree.
*/
/**题目大意：给定两个二叉树，其中每个节点有一个value，你要把两个二叉树合并，使新二叉树在结构上包含且
 * 仅包含给定的两个二叉树的节点，新的value值为之前两个之和。
 * Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
*/
/**解题思路：递归合并，将2树加到1树上，若2树无左节点（或右节点）则忽略，
 * 若1树无左节点（或右节点），则创建一个新节点，继续递归执行。
 * 注意这里有一个小trick，输入里有直接给你其中一棵树为空树的情况，需要特判；
 * 
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
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null) return t2;//特判是否为空树
        if(t2==null) return t1;
        t1.val+=t2.val;
        if(t2.left!=null){
            if(t1.left!=null)   t1.left=mergeTrees(t1.left,t2.left);
            else t1.left=mergeTrees(new TreeNode(0),t2.left);
        }
        if(t2.right!=null){
            if(t1.right!=null)   t1.right=mergeTrees(t1.right,t2.right);
            else t1.right=mergeTrees(new TreeNode(0),t2.right);
        }
        return t1;
    }
}