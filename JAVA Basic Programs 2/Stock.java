import java.util.*;

public class StockProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        findMaxProfit(prices);
        scanner.close();
    }

    public static void findMaxProfit(int[] prices) {
        int minPriceIndex = 0;
        int maxProfit = 0;
        int buyDay = 0, sellDay = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[minPriceIndex]) {
                minPriceIndex = i;
            } 
            else if (prices[i] - prices[minPriceIndex] > maxProfit) {
                maxProfit = prices[i] - prices[minPriceIndex];
                buyDay = minPriceIndex + 1;
                sellDay = i + 1;
            }
        }
        
        if (maxProfit > 0) {
            System.out.println("Day of buying : " + buyDay);
            System.out.println("Day of Selling : " + sellDay);
        } else {
            System.out.println("No profit can be made.");
        }
    }
}
