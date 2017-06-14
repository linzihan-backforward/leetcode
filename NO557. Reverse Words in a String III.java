/**
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
题意：将给定的一句英文中的每个单词反转，再输出这句话。
思路：String类有一个方法String [] spilt(String regex),其作用是将此String按指定分割符拆开，
		返回拆开后的字符串数组。
	String类没有反转字符串的方法，但StringBuffer有，我们可以先转StringBuffer最后再转回来
	纯考String类的方法，查查文档就知道了。
*/
public class Solution {
    public String reverseWords(String s) {
        String [] ans=new String[100];
        ans=s.split(" ");
        String finalAns=new String();
        for(int i=0;i<ans.length;i++){
            StringBuffer temp=new StringBuffer(ans[i]);
            temp=temp.reverse();
            finalAns+=temp.toString();
            if(i!=ans.length-1) finalAns+=" ";
        }
        return finalAns;
    }
}