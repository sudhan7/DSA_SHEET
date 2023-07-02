class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;
        if(n<=1) return 0;
        
        for(int i=1; i<n; i++){
            if(prices[i] <= buy){
                buy = prices[i];
                continue;
            }
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
}