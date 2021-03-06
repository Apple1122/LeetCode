class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        
        if(prices.length == 0)
            return max;
        
        int min = prices[0];

        for(int i = 0; i < prices.length; ++i)
        {
            if(prices[i] > min)
                max = Math.max(max, prices[i] - min);
            else
                min = prices[i];
        }

        return max;
    }
    
}