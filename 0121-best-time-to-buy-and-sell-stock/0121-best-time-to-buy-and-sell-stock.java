class Solution {
    public int maxProfit(int[] prices) { 
        /*
        in this question we have travel through whole array and chk 
        if the buying price is the min before selling the stock if yes then sell it .
         */
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minprice=Math.min(minprice, prices[i]);
            maxprofit=Math.max(maxprofit, prices[i]-minprice);
        }
        return maxprofit;
    }
}