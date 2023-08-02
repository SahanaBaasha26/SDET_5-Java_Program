package week3.day2;
public class MoveZerosToEnd {
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        
        moveZeros(nums);
        
        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
    public static void moveZeros(int[] nums) {
        int index = 0;
        
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the front
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        // Fill the remaining positions with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}

