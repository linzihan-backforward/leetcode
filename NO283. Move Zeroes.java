/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
题意：将一个数组中的所有0移到数组的最后，其他元素相对顺序不变。注意：要求不另开空间，操作数最小。
思路：只要维护当前找到了几个非0值就可以，O(n)的时间，O(1)的空间。
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int now=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[now]=nums[i];
                now++;
            }
        }
        for(int i=now;i<n;i++)
                nums[i]=0;
    }
}