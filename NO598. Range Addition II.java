/**
 * Given an m * n matrix M initialized with all 0's and several update operations.

Operations are represented by a 2D array, and each operation is represented by an array with two positive integers a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.

You need to count and return the number of maximum integers in the matrix after performing all the operations.

Example 1:
Input: 
m = 3, n = 3
operations = [[2,2],[3,3]]
Output: 4
Explanation: 
Initially, M = 
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]

After performing [2,2], M = 
[[1, 1, 0],
 [1, 1, 0],
 [0, 0, 0]]

After performing [3,3], M = 
[[2, 2, 1],
 [2, 2, 1],
 [1, 1, 1]]

So the maximum integer in M is 2, and there are four of it in M. So return 4.
 * 
 * 
 * 题意：给你一个全0的M*N的矩阵，进行一系列操作，操作为一系列二位数组【a，b】，
 *       意为：将从[0][0]到[a][b]这个子矩阵值+1；问一系列操作后矩阵中最大的元素的个数。
 * 思路：我们发现每次操作的矩阵都是从[0][0]开始的，也就是说每次操作都有重复部分。那么这个重复部分就参与了
 *       所有操作，也必然是最大的。我们只要维护k个矩阵的交即可。      
 *       
 *       
 */
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int ansx=400000,ansy=400000;
        if(ops.length==0) return m*n;
        for(int i=0;i<ops.length;i++){
            ansx=Math.min(ansx,ops[i][0]);
            ansy=Math.min(ansy,ops[i][1]);
        }
        return ansx*ansy;
    }
}