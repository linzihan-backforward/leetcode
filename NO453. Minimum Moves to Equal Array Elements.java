/**
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal,
 *  where a move is incrementing n - 1 elements by 1.
 *  题意：给你一个n个元素的非空数组，你每次可以将其中n-1个元素+1，问多少次操作后能把所有元素变成一样的。
 *  思路：这个题有一些思维含量，我们这样来想，设开始时元素的和为sum，进行m次操作后一样，最后一样时每个元素为x，则满足：
 *  		sum+m*(m-1)=x*n;
 *          x=minNum+m;
 *          通过这两个式子就可以解出m了。
 *          是不是很有意思呢
 *
 */
class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int minNum=2147483647;
        int sum=0;
        for(int i=0;i<n;i++){
            minNum=Math.min(minNum,nums[i]);
            sum+=nums[i];
        }
        return sum-minNum*n;
    }
}