// class Solution {
//     public int maxProfit(int[] prices) {
//         int firstCost = Integer.MAX_VALUE;
//         int secondCost = Integer.MAX_VALUE;
//         int firstProfit = 0;
//         int secondProfit = 0;
//         for(int i=0;i<prices.length;i++){
            
//             firstCost = Math.min(firstCost, prices[i]);
//             firstProfit = Math.max(firstProfit, prices[i]-firstCost);
            
//             secondCost = Math.min(secondCost, prices[i]-firstProfit);
//             secondProfit = Math.max(secondProfit, prices[i]-secondCost);
            

//         }
//         return secondProfit;
//     }
// }
class Solution {    
   public int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE, sell1 = 0, buy2 = Integer.MIN_VALUE, sell2 = 0;
        for (int price : prices) {
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }
        return sell2;
    }
}