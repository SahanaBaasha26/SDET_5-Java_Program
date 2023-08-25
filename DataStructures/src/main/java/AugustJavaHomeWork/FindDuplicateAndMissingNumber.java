package AugustJavaHomeWork;

import java.util.Arrays;

public class FindDuplicateAndMissingNumber {

    public static int[] findErrorNums(int[] nums) {
    	
    	
    	/*
    	 * psuedo code
    	 * 
    	 * 1-yes
    	 * 2.Input ==[1,2,2,4]
    	 *        o/p= 2, 3 
    	 *     
    	 *    Input: nums = [1,1]
                Output: [1,2]
    	 * 3-
    	 * 
    	 */
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        int[] result = new int[2];
        
        // Sort the input array
        Arrays.sort(nums);
        
        int n = nums.length;
        int duplicate = -1;
        int missing = 1; // Initialize missing number to 1
        
        // Iterate through the sorted array
        for (int i = 0; i < n; i++) {
            // Check for duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            }
            // Check for the missing number
            if (nums[i] > missing) {
                break;
            }
            missing++;
        }
        
        // If the missing number is not found in the array, it is n
        if (missing == n + 1) {
            missing = n;
        }
        
        result[0] = duplicate;
        result[1] = missing;
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4};
        int[] result1 = findErrorNums(nums1);
        System.out.println("Output for nums1: [" + result1[0] + ", " + result1[1] + "]");
        
        int[] nums2 = {1, 1};
        int[] result2 = findErrorNums(nums2);
        System.out.println("Output for nums2: [" + result2[0] + ", " + result2[1] + "]");
    }
}
