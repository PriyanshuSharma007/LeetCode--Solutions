class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int buy_price=prices[0];

        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max_profit=max_profit+prices[i]-prices[i-1];
            }
        }
        return max_profit;
    }
}
