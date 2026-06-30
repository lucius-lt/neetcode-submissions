class Solution {
    public int maxProfit(int[] prices) {
        int minP=prices[0];
        int maxP=0;
        for(int price:prices){
            if(price - minP > maxP) maxP = price - minP;
            if(price<minP) minP=price;
        }
        return maxP;
    }
}
