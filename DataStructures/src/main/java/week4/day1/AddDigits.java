package week4.day1;

//Pseudo code:
//1. Define a function that takes an integer as input.
//2. While the input number has more than one digit:
// - Convert the number to a string to access its digits.
// - Sum up all the digits.
// - Assign the sum back to the input number.
//3. Return the final single-digit number.

public class AddDigits {

 // Function to calculate the sum of digits until a single-digit number is obtained.
 public static int addDigits(int num) {
     // Loop until the number has more than one digit.
     while (num >= 10) {
         int sum = 0;

         // Convert the number to a string to access its digits.
         String numStr = Integer.toString(num);

         // Sum up all the digits.
         for (int i = 0; i < numStr.length(); i++) {
             sum += Character.getNumericValue(numStr.charAt(i));
         }

         // Assign the sum back to the input number.
         num = sum;
     }

     // Return the final single-digit number.
     return num;
 }

 public static void main(String[] args) {
     // Test cases
     int num1 = 38;
     int result1 = addDigits(num1);
     System.out.println("Input: " + num1);
     System.out.println("Output: " + result1);

     int num2 = 0;
     int result2 = addDigits(num2);
     System.out.println("Input: " + num2);
     System.out.println("Output: " + result2);
 }
}


