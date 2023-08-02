package week4.day1;

public class BuyAndSell {

//Pseudo code:
//1. Define a function that takes an integer array 'prices' as input.
//2. Initialize a variable 'maxProfit' to 0 to keep track of the maximum profit.
//3. Use two for loops to compare all possible pairs of buying and selling days:
// - Outer loop (i) iterates from 0 to (prices.length - 1).
// - Inner loop (j) iterates from (i + 1) to (prices.length - 1).
// - Calculate the profit by subtracting prices[i] (buying price) from prices[j] (selling price).
// - If the calculated profit is greater than 'maxProfit', update 'maxProfit' with the new profit.
//4. Return the value of 'maxProfit'.



 // Function to find the maximum profit from buying and selling stocks using two for loops.
 public static int maxProfit(int[] prices) {
     int maxProfit = 0;

     // Outer loop to iterate over buying days.
     for (int i = 0; i < prices.length - 1; i++) {
         // Inner loop to iterate over selling days.
         for (int j = i + 1; j < prices.length; j++) {
             // Calculate the profit by subtracting buying price from selling price.
             int profit = prices[j] - prices[i];

             // Update maxProfit if the calculated profit is greater.
             if (profit > maxProfit) {
                 maxProfit = profit;
             }
         }
     }

     return maxProfit;
 }

 public static void main(String[] args) {
     // Test cases
     int[] prices1 = {7, 1, 5, 3, 6, 4};
     int result1 = maxProfit(prices1);
     System.out.println("Input: [7, 1, 5, 3, 6, 4]");
     System.out.println("Output: " + result1);

     int[] prices2 = {7, 6, 4, 3, 1};
     int result2 = maxProfit(prices2);
     System.out.println("Input: [7, 6, 4, 3, 1]");
     System.out.println("Output: " + result2);
 }
}
