/*Given an array of 2n integers, 
your task is to group these integers into n pairs of integer, 
say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) 
for all i from 1 to n as large as possible.*/
/*将2n个数分成n组，每组两个数，使得∑min(ai,bi)最大*/
/*思路：考虑最小的数，不管其跟谁一组最后算入和的一定是它，如果让它跟一个
 *		大数一组相当于浪费了这个大数了，所以要让它和一个尽量小的数配对
 *		最好的情况是和次小的数配对。所以我们便想到配对方法：排序后每
 *		相邻两个一组。实现也非常简单。
 */

import java.util.Arrays;
public class Solution {
    public int arrayPairSum(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2)
            ans+=nums[i];
        return ans;    
    }
}