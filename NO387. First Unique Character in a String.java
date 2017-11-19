/**Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
题意：找到一个字符串中第一个只出现过一次的字符，返回其下标。
思路：题很简单，就是题意有些难懂，什么是non-repeating character确实不好理解。
 * 
 */
class Solution {
    public int firstUniqChar(String s) {
        int cnt[]= new int[26];
        for(int i=0;i<s.length();i++)
                cnt[s.charAt(i)-'a']++;
        for(int i=0;i<s.length();i++)
                if(cnt[s.charAt(i)-'a']==1)
                    return i;
        return -1;
    }
}