/**
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. 
For numbers which are multiples of both three and five output “FizzBuzz”.
题意：给定n，让你返回1~n的字符串，其中3的倍数用Fizz表示，5的倍数用Buzz表示，3和5同时的倍数用FizzBuzz表示。
思路：没啥思路吧，会循环就行了。。。
*/
public class Solution {
    public List<String> fizzBuzz(int n) {
        Integer now= new Integer(0);
        List<String> ans=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            now=i;
            if(i%3==0&&i%5==0){
                ans.add("FizzBuzz");
                continue;
            }
            if(i%3==0) ans.add("Fizz");
            else if(i%5==0) ans.add("Buzz");
            else ans.add(now.toString());
        }
        return ans;
    }
}