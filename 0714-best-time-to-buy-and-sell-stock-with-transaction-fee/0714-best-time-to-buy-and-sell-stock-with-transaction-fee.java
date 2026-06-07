class Solution {
    public int maxProfit(int[] prices, int fee) {
        int maxProfit=0;
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++) {
            if (prices[i] < min) {
                min=prices[i];
            } 
            else if (prices[i]-min>fee) {
                maxProfit+=prices[i]-min-fee;
                min=prices[i]-fee;
            }
        }
        return maxProfit;
    }
}