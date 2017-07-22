/**Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
题意：一个数组中除了一个数其余都是出现了两次的，让你在O(n)的时间和O(1)的空间下找到这个数。
思路：传统的Hash表空间太大，肯定不行，这时我们想到位运算^,我们知道x^x为0，0^x=x,所以只要把所有数全异或一遍，剩下的就是答案啦。
*/
public class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}