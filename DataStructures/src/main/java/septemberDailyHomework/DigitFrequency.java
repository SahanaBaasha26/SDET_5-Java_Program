package septemberDailyHomework;

import org.junit.Test;

public class DigitFrequency {
	 public boolean checkFrequency(String num) {
	        int n = num.length();

	        for (int i = 0; i < n; i++) {
	            int digit = num.charAt(i) - '0'; // Convert the character to an integer digit.
	            int count = 0;

	            for (int j = 0; j < n; j++) {
	                int currentDigit = num.charAt(j) - '0'; // Convert the character to an integer digit.

	                if (currentDigit == i) {
	                    count++;
	                }
	            }

	            //System.out.println("Digit at index " + i + ": " + digit);
	           // System.out.println("Count of digit " + i + ": " + count);

	            if (count > digit || count != digit) {
	                //System.out.println("Condition violated at index " + i);
	                return false;
	            }
	        }

	        return true;
	    }

	    @Test
	    public void testCheckFrequency() {
	        DigitFrequency solution = new DigitFrequency();

	        String input1 = "1210";
	        System.out.println("Input: " + input1);
	        boolean result1 = solution.checkFrequency(input1);
	        System.out.println("Result: " + result1);

	        String input2 = "030";
	        System.out.println("Input: " + input2);
	        boolean result2 = solution.checkFrequency(input2);
	        System.out.println("Result: " + result2);

	        String input3 = "1234567890";
	        System.out.println("Input: " + input3);
	        boolean result3 = solution.checkFrequency(input3);
	        System.out.println("Result: " + result3);
	    }
}

