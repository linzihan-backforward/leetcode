/**Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
 * convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
	题意：给一个BST，要求把所有节点的val改为大于等于它的其他节点的val之和。
	思路：关于BST的定义请差百度。结论就是中根遍历得到的序列是严格递增的。
			利用这一点，我们先右在根再左遍历，这样就是每个节点的val+=之前遍历过的val和，维护一个当前遍历过的总和就行了。
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
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        root=deepSearch(root);
        return root;
    }
    public TreeNode deepSearch(TreeNode node){
        if(node==null) return null;
        deepSearch(node.right);
        node.val+=sum;
        sum=node.val;
        deepSearch(node.left);
        return node;
    }
}