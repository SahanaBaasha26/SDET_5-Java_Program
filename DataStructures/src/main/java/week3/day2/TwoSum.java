package week3.day2;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
	/*
	 * Iterate over each element in the array
	 * Check if there is another element that sums up to the target
	 * Return the indices if found
	 */

    public int[] twoSum(int[] nums, int target) {
        // Iterate over each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Check if there is another element that sums up to the target
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};  // Return the indices if found
                }
            }
        }
        throw new IllegalArgumentException("No two elements sum up to the target.");
    }

    // JUnit test cases
    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = twoSum(nums, target);
        Assert.assertArrayEquals(expected, result);
        
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTwoSumNoSolution() {
        int[] nums = {2, 7, 11, 15};
        int target = 4;
        twoSum(nums, target); // Expects an IllegalArgumentException
       
    }

   // Main method to run the program
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    } 
}

