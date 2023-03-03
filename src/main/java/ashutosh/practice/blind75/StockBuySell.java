package ashutosh.practice.blind75;

public class StockBuySell {

    public static int[] stockBuySell(int[] price){
        int[] buySellDay= new int[2];
        int maxProfitSoFar=0;
        int buy=price[0];
        int sell=price[1];
        for (int i=1; i<price.length;i++) {
            if (buy>price[i]) {
                buy=price[i];
                buySellDay[0]=i;
            }
            if (sell<price[i]) {
                sell=price[i];
                buySellDay[1]=i;
            }
        }
        System.out.println(buy);
        System.out.println(sell);

        return buySellDay;
    }

    public static void maxProfit(int[] price){
        int buy=price[0];
        int profit = 0;
        for (int i=1; i<price.length;i++) {
            buy=Math.min(buy,price[i]);
            profit=Math.max(profit,price[i]-buy);
        }
        System.out.println("Max Profit1 :  "+profit);
    }

    public static void main(String [] arg){
        int[] prices = {7,1,5,3,6,4};
        int[] days = stockBuySell(prices);
        maxProfit(prices);
        System.out.println("Max Profit : " + (prices[days[1]]-prices[days[0]]));
    }
}
