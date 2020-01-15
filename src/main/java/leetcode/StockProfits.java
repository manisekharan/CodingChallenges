package leetcode;

public class StockProfits {
    public int maxProfit(int[] prices){
        int buy =0;
        int sell =0;
        int profit =0;
        for (int i=0; i < prices.length; i++){
            System.out.println("Loop : "+i +"--------------------------------------");
            int k = i+1;
            if(k < prices.length) {
                System.out.println("prices[i] > prices[k] : "+ prices[i] + " > "+ prices[k]);
                if (prices[i] > prices[k]) {
                    continue;
                } else {
                    buy = prices[i];
                    sell = prices[k];
                    int j = 1;
                    System.out.println(" Buy : "+buy + " Sell :  "+sell+ ", i : "+i+ " i+1 : "+(i+1) +" j : "+j  );
                    while (k + j < prices.length && sell < prices[k + j]) {
                        sell = prices[k + j];
                        System.out.println("While");
                        j++;
                    }
                    System.out.println(" Buy : "+buy + " Sell :  "+sell+ ", i : "+i+ " i+1 : "+(i+1) +" j : "+j  );
                    profit += sell - buy;
                    i = i+j;
                }
            }
        }
        System.out.println("Profit : "+profit);
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        new StockProfits().maxProfit(prices);
    }
}
