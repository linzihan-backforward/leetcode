/**Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings. The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other strings.

A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements. Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.

The input will be two strings, and the output needs to be the length of the longest uncommon subsequence. If the longest uncommon subsequence doesn't exist, return -1.
题意：给两个长度小于100的字符串，求最长不公共字串的长度。
*思路：这是一个考智商的逗逼题。我一看还以为是跟最长公共字串一样的dp呢，推完式子发现不对劲啊，字串不一定比两个串都短啊。
*看了讨论之后要吐血啊，答案竟然是两个串中长的串的长度！！！原谅我智商不足。
*/
public class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        else return Math.max(a.length(),b.length());
    }
}