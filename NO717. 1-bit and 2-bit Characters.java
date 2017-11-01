/**
 * We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).

Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
 	题意：将一个01串进行分割，分割方式为单个字符一组的话只能是0，两个字符一组可以是10或者11，问是否能让串末尾出现一个单独一组的0
 	思路：非常简单，遇见0我们不用管，因为它可以一人一组，遇见1的话，我们就强制让它和后面的那个数一组，不管是几
 			这样从头扫描一遍，如果能扫到最后一个数且它是0的话就满足分割条件，否则不满足。
 *
 */


class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n= bits.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                if(bits[i]==0) {
                    ans=1;
                    break;
                }
            }
            if(bits[i]==1){i++;}
        }
        if(ans>0) return true;
        else return false;
    }
}