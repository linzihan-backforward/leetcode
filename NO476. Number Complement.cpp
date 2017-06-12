/**/ 
/*Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.*/ 
/*Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits),
 and its complement is 010. So you need to output 2.*/ 
/*题意：将一个32位的整数按位反转，同时忽略前导0*/
/*思路：利用异或运算反转，将反转后的前导1删去*/ 
class Solution {
public:
    int findComplement(int num) {
        int mask=0;
        for(int i=0;i<32;i++)
            mask+=(1<<i);
        num^=mask; 
        for(int i=31;i>=0;i--){
           if(num&(1<<i)) num^=(1<<i);
           else break;
        }
        return num;
    }
};

