package Day2_best_time_to_buy_and_sell_stocks;

import java.util.ArrayList;

public class Solution {
    public static int maximumProfit(ArrayList<Integer> prices){
        int min = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int i=0; i<prices.size(); i++){
            if(prices.get(i)<min){
                min = prices.get(i);
            }
 
            if(prices.get(i)-min>0 && prices.get(i)-min > profit){
                profit = prices.get(i) - min;
            }
        }
        return profit;
     }
}
