/**You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. 
 * You will take the first turn to remove the stones.

Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 * 题意：最经典的nim游戏。两个人轮流拿石子，每个人可以随便拿1-3个，拿到最后一个石子的人胜，你是先手，假定你们两个都按最优策略，给定石子总数n，问你能不能必胜？
 * 思路：经典博弈论问题。4是这个题的一个关键点如果<4个，则一次可全拿走，先手必胜；如果=4个，两次可全拿走，先手必败。进而我们发现8个可以分为两个4个，同样先手必败。
 * 		至此找到规律，如果总数为4的倍数，则最后必出现4个的情况，先手必败；反之先手必胜。
 * 		程序两行。
 * 
*/

public class Solution {
    public boolean canWinNim(int n) {
        if(n%4!=0) return true;
        else return false;
    }
}