/**Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. 
 * Return the maximum number of kinds of candies the sister could gain.
 * 题意：给你2*n个糖果，用整型表示，数一样就代表是一种糖果，将这2*n个糖分给哥哥妹妹两人，一人n个，求妹妹最多能分到几种糖？
 * 思路：首先，因为每个人n个糖，那么答案一定小于等于n。然后我们考虑让妹妹先挑n个，剩下n个给哥哥。
 * 		怎么挑呢？当然是每种都拿一个啊，这时答案已经显而易见：如果种类数多于n则只能拿n种，否则有几种能拿几种。
 * 		代码就三行！	
*/
public class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for(int candy: candies)  set.add(candy);
        return Math.min(set.size(),candies.length/2);
    }
}