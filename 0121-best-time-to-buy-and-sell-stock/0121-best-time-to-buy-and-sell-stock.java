class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = prices.length-1;
        int max = 0;
        int mid = prices.length/2;
        while(i < prices.length-1){
            j = prices.length-1;
            while(i < j){
                if(prices[j] - prices[i] > max) max = prices[j]-prices[i];
                j--;
            }
            i++;
        }
        return max;
    }
}