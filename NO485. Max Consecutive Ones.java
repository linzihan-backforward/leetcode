/**Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
题意：给一串0、1串，要求找到其中最长的一串连续的1，输出其长度。
思路：O(n)遍历，记录最大值即可。
*/
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0,maxx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans=Math.max(ans,maxx);
                maxx=0;
            }
            else    maxx++;
        }
        ans=Math.max(ans,maxx);
        return ans;
    }
}