/**
 * Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.
题意：找出01串s的所有满足条件的字串，条件为：01个数必须相同，且0必须在一起，1必须在一起。
思路：因为我们的字串中01都是在一起的，所以一定是0000000111111这种，或者11111100000这种。
	  即只存在一个唯一的分界点，那么这个分界点在原串中也存在。我们只需要将原串按照01分界点
	  拆开，则每两段之间都可以构成一些字串，字串数量为这两段01字符的最小值。
 */
class Solution {
    public int countBinarySubstrings(String s) {
        int together [] = new int[s.length()];
        int now=0;
        together[now]++;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                now++;
                together[now]++;
            }
            else together[now]++;
        }
        int ans=0;
        for(int i=1;i<=now;i++)
            ans+=Math.min(together[i],together[i-1]);
        return ans;
    }
}