/**
You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
题意：给两个数组，其中数组一为数组二的子集，问你数组一中每个数的“下一个比它大的数”
		“下一个比它大的数”定义为，在数组二中这个数右边第一个比它大的数。
思路：我们对数组二从前往后考虑，因为一个数一旦找到下一个比它大的数后，就永远不会改了，我们考虑维护一个单调栈。
	栈中元素单调递减，这样对于当前元素，将栈内比它小的全部出栈，这些数的“下一个比它大的数”已经找到，在将当前元素压
	入栈即可。
*/
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<nums.length;i++){
            while(!stack.empty()&&stack.peek()<nums[i]) map.put(stack.pop(),nums[i]);
            stack.push(nums[i]);
        }
        for(int i=0;i<findNums.length;i++)
            if(map.containsKey(findNums[i])) findNums[i]=map.get(findNums[i]);
            else findNums[i]=-1;
    
        return findNums;
    }
}