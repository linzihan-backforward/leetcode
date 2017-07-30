/**
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:
Google: 90% of our engineers use the software you wrote (Homebrew), 
but you can’t invert a binary tree on a whiteboard so fuck off.
题意：反转一个二叉树，经典题。
	关于这个题有一个故事，就是著名mac系统软件包管理工具作者：
	Max Howell去Google面试时，因为没有在白板上写出这个题而遭到拒绝。
	这个故事提醒我们算法很重要！
思路：交换节点+深搜即可。注意判断跟是否为空。	
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        if(root.left!=null&&root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
        else if(root.left!=null){
            root.right=root.left;
            root.left=null;
            invertTree(root.right);
            return root;
        }
        else if(root.right!=null){
            root.left=root.right;
            root.right=null;
            invertTree(root.left);
            return root;
        }
        else return root;
    }
}