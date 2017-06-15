/**
Given a List of words, return the words that can be typed using letters of alphabet 
on only one row's of American keyboard like the image below.
题意：看那些单词是在键盘上只由同一行的字母组成的。
思路：题意很明确，也没有什么难想的算法，但是java的强封装性使得要使用各种容器和方法。
	先将同一行的字母存入一个map中，然后将每个单词全转化为小写，然后对每个单词的每个
	字母，查询其value，全一样的话就放到答案的ArrayList中，最后再将ArrayList转为数组即可。
*/
public class Solution {
    public String[] findWords(String[] words) {
        Map map=new HashMap();
        map.put('q',1);map.put('w',1);
        map.put('e',1);map.put('r',1);
        map.put('t',1);map.put('y',1);
        map.put('u',1);map.put('i',1);
        map.put('o',1);map.put('p',1);
        map.put('a',2);map.put('s',2);
        map.put('d',2);map.put('f',2);
        map.put('g',2);map.put('h',2);
        map.put('j',2);map.put('k',2);
        map.put('l',2);map.put('z',3);
        map.put('x',3);map.put('c',3);
        map.put('v',3);map.put('b',3);
        map.put('n',3);map.put('m',3);
        List <String> ansList=new ArrayList<String>();
        String [] lowerCase= new String [50];
        for(int i=0;i<words.length;i++){
            lowerCase[i]=words[i].toLowerCase();
            int row=Integer.parseInt(map.get(lowerCase[i].charAt(0)).toString());
            if(lowerCase[i].length()==1){
                ansList.add(words[i]);
                continue;
            }
            for(int j=1;j<lowerCase[i].length();j++){
               
                if(row!=Integer.parseInt(map.get(lowerCase[i].charAt(j)).toString()))
                    break;
                if(j==lowerCase[i].length()-1) ansList.add(words[i]);    
            }
        }
        String [] ans = new String[ansList.size()];
        for(int i=0;i<ansList.size();i++)
            ans[i]=ansList.get(i);
        return ans;
    }
}