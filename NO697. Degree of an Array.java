/**
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
题意：一个数组的深度定义为数组中出现最多的元素出现的次数，给你一个数组，让你找它的一个字串，使得深度与原来相同且尽量短。
思路：字串必须要求是连续的，所以只和出现最多元素的左右端点有关，我们就记录每个值的左右端点，找最短的即可。比较暴力。
因为这个题中数小于50000所以用数组即可。
 */
class Solution {
    public int findShortestSubArray(int[] nums) {
         int left[] = new int[50001];
         int right[]= new int[50001];
         int times[]= new int[50001];
         int maxx=0;
         int ans=50000;
        for(int i=0;i<nums.length;i++){
            int now=nums[i];
            if(left[now]==0) {
                left[now]=i+1;
                right[now]=i+1;
            }
            else right[now]=i+1;
            times[now]++;
            if(times[now]>maxx)
                maxx=times[now];
        }
        for(int i=0;i<nums.length;i++){
            if(maxx==times[nums[i]])
                ans=Math.min(right[nums[i]]-left[nums[i]]+1,ans);
        }
        return ans;
    }
}