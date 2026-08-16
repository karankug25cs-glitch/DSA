class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        //===========================brute============================
        // for(int i=0; i<n-1; i++){
        //     int diff = 0;
        //     for(int j=i+1; j<n; j++){
        //         diff = prices[j] - prices[i];
        //         profit = Math.max(diff , profit);
        //     }
        // }
        // ===========================optimal==============================
        int minprice = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            else{
                profit = Math.max(profit , prices[i] - minprice);
            }
        }
        return profit;
    }
}