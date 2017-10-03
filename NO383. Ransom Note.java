/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.
题意：给你两个字符串，判断1串是否可以由2串中的字符拼接得到。
思路：因为都是小写字母，只要判断2串中的字符是不是比1串多就行了。
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] map= new int[30];
        for(int i=0;i<magazine.length();i++)
                map[magazine.charAt(i)-'a']++;
        for(int i=0;i<ransomNote.length();i++){
            if(map[ransomNote.charAt(i)-'a']<=0) return false;
            else map[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}