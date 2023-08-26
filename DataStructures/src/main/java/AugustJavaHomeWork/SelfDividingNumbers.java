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

 

