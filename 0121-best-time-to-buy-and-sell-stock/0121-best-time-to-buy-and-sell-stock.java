class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        int left = 0;
        int right = left+1;
        while(right < prices.length){
            if(prices[right] - prices[left] < 0){
                left = right;
            } else {
                int diff = prices[right] - prices[left];
                maxPrice = (maxPrice>diff) ? maxPrice : diff;
            }
            right++;
        }
        return maxPrice;
    }
}