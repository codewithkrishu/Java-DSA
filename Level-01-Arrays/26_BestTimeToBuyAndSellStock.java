public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {8, 3, 6, 1, 9};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int buyDay = -1;
        int sellDay = -1;
        int minIndex = -1;

        // Track the lowest price seen so far and the best profit
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                minIndex = i;
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
                buyDay = minIndex;
                sellDay = i;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);

        if (buyDay != -1) {
            System.out.println("Buying Day: " + (buyDay + 1));
            System.out.println("Selling Day: " + (sellDay + 1));
        } else {
            System.out.println("No profitable transaction found.");
        }
    }
}