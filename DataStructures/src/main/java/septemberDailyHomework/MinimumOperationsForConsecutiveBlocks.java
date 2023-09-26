package septemberDailyHomework;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class MinimumOperationsForConsecutiveBlocks {
	
	public static int minOperations(String blocks, int k) {
	    int n = blocks.length();
	    int minOps = Integer.MAX_VALUE;
	    int left = 0, right = 0;
	    int blackCount = 0;

	    while (right < n) {
	        if (blocks.charAt(right) == 'B') {
	            blackCount++;
	        }

	        while (blackCount > k) {
	            if (blocks.charAt(left) == 'B') {
	                blackCount--;
	            }
	            left++;
	        }

	        if (blackCount == k) {
	            int operations = right - left + 1 - blackCount;
	            minOps = Math.min(minOps, operations);
	        }

	        right++;
	    }

	    // Check if it's possible to achieve k consecutive black blocks
	    if (minOps == Integer.MAX_VALUE) {
	        return -1; // Indicate that it's not possible
	    }

	    return minOps;
	}
	@Test
    public void testMinOperations() {
        assertEquals(3, minOperations("WBBWWBBWBW", 7));
        int result2 = minOperations("WBWBBBW", 2);
        System.out.println("Example 2 Result: " + result2); 
    }
}
/*Input1: blocks = "WBBWWBBWBW", k =7   , Output: 3
 *Input2: blocks = "WBWBBBW", k = 2 ,  Output: 0
 *Get the length of the input string
 *Initialize a variable to store the minimum operations needed
 *Initialize two pointers to create a sliding window
 *Initialize a counter for black blocks in the current window\
 *Iterate through the string
 *Expand the right pointer and update black block count if a black block is encountered
 *Shrink the window if it has more than k black blocks
 *If the left block of the window is black, decrease the black block count
 *Move the left pointer to the right to shrink the window
 *Check if the current window has k consecutive black blocks
 *Calculate the number of operations needed to make previous white blocks black
 *Update minOps with the minimum operations
 *Move the right pointer to the next block
 *Check if it's possible to achieve k consecutive black blocks
 * 
 */
