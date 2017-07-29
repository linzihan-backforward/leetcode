/**Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
题意：给一个字符串，判断是否合法，如果全是大写或者全是小写就合法，如果只有首字母大写也合法，其余不合法.
思路：简单模拟即可。
*/
public class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag=false;
        StringBuffer temp=new StringBuffer();
        char first =word.charAt(0);
        if(Character.isLowerCase(first)){
            flag=true;
            for(int i=1;i<word.length();i++){
                if(!Character.isLowerCase(word.charAt(i))){
                    flag=false;
                    break;
                }
            }
            
        }
        else{
            for(int i=1;i<word.length();i++)
                if(Character.isLowerCase(word.charAt(i))) temp.append(word.charAt(i));
            if(temp.length()==0||temp.length()==word.length()-1) flag=true;
                else flag=false;
        }
        return flag;
    }
}