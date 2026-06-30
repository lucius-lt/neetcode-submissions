class Solution {
    public int maxProfit(int[] prices) {
        int minP=prices[0];
        int maxP=0;
        for(int price:prices){
            minP=Math.min(minP,price);
            int profit=price-minP;
            maxP=Math.max(maxP,profit);
        }
        return maxP;
    }
}
