package AugustJavaHomeWork;


public class SelfDividingNumbers {

    // Function to check if a number is a self-dividing number
    private static boolean isSelfDividing(int num) {
        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || originalNum % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    // Function to print all self-dividing numbers in the given range
    public static void printSelfDividingNumbersInRange(int left, int right) {
        System.out.print("Output: ");
        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        printSelfDividingNumbersInRange(left, right);
    }
}

/*
 * define the same isSelfDividing function as before to check if a given number is self-dividing.
 * define a function called printSelfDividingNumbersInRange, which directly prints the self-dividing numbers found within the given range.
 * Inside the printSelfDividingNumbersInRange function, 
 * loop through all the numbers in the range [left, right] and check if each number is self-dividing using the isSelfDividing function. 
 * If it is, we print the number to the console.
 * In the main function, we set the values of left and right as given in the example and call the printSelfDividingNumbersInRange 
 * function to print the self-dividing numbers in the given range.
 */
 

