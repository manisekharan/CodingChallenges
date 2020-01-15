package leetcode;
/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.


 */
public class ProfitStocks {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int profit = 0;
        for(int i=0; i< prices.length; i++){
            int k = i+1;
            if(k < prices.length) {

                if (prices[i] > prices[k]) {
                    continue;
                } else {
                    buy = prices[i];
                    sell = prices[i + 1];
                    int j = 1;
                    System.out.println(" Buy : "+buy + " Sell :  "+sell+ ", i : "+i+ " i+1 : "+(i+1) +" j : "+j  );
                    while ((i+1+j) < prices.length && sell < prices[i + 1 + j]  ) {
                        System.out.println("While");
                        sell = prices[i + 1 + j];
                        j++;
                    }
                    System.out.println(" Buy : "+buy + " Sell :  "+sell+ ", i : "+i+ " i+1 : "+(i+1) +" j : "+j  );
                    profit += sell - buy;
                    i = i+j;
                    System.out.println(" i : "+i);
                }

            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int prices[] = new int[]{7,1,5,3,6,4};
        System.out.println("Profit : " + new ProfitStocks().maxProfit(prices));
    }
}
