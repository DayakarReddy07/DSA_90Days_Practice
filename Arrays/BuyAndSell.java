package DSA_90Days_Practice.Arrays;

public class BuyAndSell {
    public static void buyAndsell(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }
        System.out.println("The max profit of these prices are: " + maxProfit);
    }
    public static void main(String args[]){
        int prices[] = {7,1,3,5,6,4};
        buyAndsell(prices);
    }
}
