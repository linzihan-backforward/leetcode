/**Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * 
 * 题意：经典卖货问题，给你一个货物n天的价格，在这n天买入一次，卖出一次，求最大利润。
 * 思路：扫描一遍，维护当前扫描到的节点的之前的最小值，和最大利润即可。
 * PS：这个题的标签竟然是dp。。。。困惑了好久想转移方程！
 */
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minn=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<n;i++){
            minn=Math.min(minn,prices[i]);
            ans=Math.max(ans,prices[i]-minn);
        }
        return ans;
    }
}