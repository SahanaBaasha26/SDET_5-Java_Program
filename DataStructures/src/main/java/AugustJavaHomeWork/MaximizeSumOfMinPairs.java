package AugustJavaHomeWork;

import java.util.Arrays;

public class MaximizeSumOfMinPairs {
	
	
	/*Psuedo code
	 * 
	 * 1- yes
	 * 2-   1)Input: nums = [1,4,3,2]= 
	 *               -->(1,2) (3,4)-->[1+3]=4
	 *               -->(1,3)  (2,4)-->[1+2]=3
	 *               -->(1,4) (2+3)-->[[1+2]=3
	 *                                 
	 *                 Output: 4
	 *      2) Input: nums = [6,2,6,5,1,2]
                          Output: 9
                  
	 * Sort the input array nums in ascending order using Arrays.sort(nums)
	 * Initialize a variable maxSum
	 * Iterate over the sorted array using a for loop. 
	 *   Start from index 0 and increment the index by 2 in each iteration to consider every alternate element.
	 * In each iteration, add the value at the current index (nums[i]) to the maxSum
	 * This value represents the minimum of the current pair.
	 * return maxSum as the result.
	 */	

    public static int arrayPairSum(int[] nums) {
        // Sort the input array in ascending order
        Arrays.sort(nums);

        int maxSum = 0;

        // Iterate over the sorted array and sum the minimum of every alternate element
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }  

        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 3, 2};
        int result1 = arrayPairSum(nums1);
        System.out.println("Output for nums1: " + result1);

        int[] nums2 = {6, 2, 6, 5, 1, 2};
        int result2 = arrayPairSum(nums2);
        System.out.println("Output for nums2: " + result2);
    }
}
