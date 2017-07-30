/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
	题意：给一个长度为n的数组，其中元素在1~n之间，但有一些元素没出现，让你在O(n)的时间和O(1)的空间内找到没出现的元素。
	思路：首先，O(n)的时间很好做，只需要扫一遍然后记录那些出现过就行，可是这就要开数组记录，所以关键是怎么把这个数组省掉。
		这时就要想办法把现有数组用上，如何既实现记录又不改变数据呢？有两个方法：记录时+n，取数据时%n；或者记录时取反，取数据时取绝对值。
		我用的第一种方法。
*/
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans =new ArrayList<Integer> ();
        int n=nums.length;
        for(int i=0;i<n;i++) nums[(nums[i]-1)%n]+=n;
        for(int i=0;i<n;i++)
            if(nums[i]<=n) ans.add(i+1);
        return ans;
    }
}