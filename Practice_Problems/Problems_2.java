package STEP_SEM3.Practice_Problems;

public class Problems_2 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        // Walk through the array once from left to right
        for (int i = 1; i < prices.length; i++) {
            // Calculate potential profit selling today
            int currentProfit = prices[i] - minPrice;

            // Update max profit seen so far
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            // Update lowest purchase price seen so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }
}