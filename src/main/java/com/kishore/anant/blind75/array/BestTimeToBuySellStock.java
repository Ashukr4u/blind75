package com.kishore.anant.blind75.array;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        BestTimeToBuySellStock bestTimeToBuySellStock = new BestTimeToBuySellStock();
        int result = bestTimeToBuySellStock.maxProfit(prices);
        System.out.println(result);

    }

    public int maxProfit(int[] prices) {

        int maxProfit = Integer.MIN_VALUE;
        int minPrice = prices[0];
        for (int price:prices){
            if(price < minPrice)
                minPrice = price;
            maxProfit = Math.max(price-minPrice, maxProfit);
        }
        return maxProfit;
    }
}
