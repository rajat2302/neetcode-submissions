class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1, profit = 0;
        while(right < prices.length){
            if(prices[right] - prices[left] <= 0){
                left = right;
                right++;
            } else {
                if(prices[right] - prices[left] > profit){
                    profit = prices[right] - prices[left];
                }
                right++;
            }
        }
        return profit;
    }
}
