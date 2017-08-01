/**Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
题意：a+b。不让用+、-号。
思路：所有的基本运算都可以用位运算模拟的。这里我们就手动模拟加法。
	在二进制下，加法分为对应为相加和进位，我们分开处理，如果两位都为0，则相加为0，
	如果一个0，一个1，则结果为1，如果两个1，则结果为零，然后进位，我们发现，相加操作正好就是
	异或（^），进位正好就是与(&)，如此便可以转换为另外两个数的加法，可以证明最后进位必然可以为0.
*/
public class Solution {
    public int getSum(int a, int b) {
        if(b==0) return a;
        return getSum(a^b,(a&b)<<1);
    }
}