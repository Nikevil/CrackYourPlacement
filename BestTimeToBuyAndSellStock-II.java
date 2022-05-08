class Solution {
    public int maxProfit(int[] prices) {
        
        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;
        int profit = 0;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min_value){
                min_value = prices[i];
            }
            else{
                profit = prices[i] - min_value;
                max_profit +=profit;
                min_value = prices[i];
            }
        }
        
        return max_profit;
    
    }
}
