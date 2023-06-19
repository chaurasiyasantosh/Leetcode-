class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for(int i=0; i< prices.length-1; ++i){
            int value= prices[i]+prices[i+1];
            if(value <= money)
            return (money-value);
        }
        return money;
    }
}
