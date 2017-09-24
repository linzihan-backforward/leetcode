/**Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 * 
 */
/*这两个题互为逆反，一个是将字母串转换成数字，一个是将数字转换成字母串*/
/*思路都一样，当成26进制数转换就行*/
class Solution {
    public String convertToTitle(int n) {
        String ans="";
        while(n>0){
            n--;
            char s=(char)(n%26+'A');
            ans=s+ans;
            n=n/26;
        }
        return ans;
    }
}
/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */
class Solution {
    public int titleToNumber(String s) {
        int n=s.length();
        int ans=s.charAt(0)-'A'+1;
        for(int i=1;i<n;i++){
            ans=ans*26+s.charAt(i)-'A'+1;
        }
        return ans;
        
    }
}