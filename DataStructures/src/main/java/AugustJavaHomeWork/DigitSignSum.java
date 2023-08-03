package AugustJavaHomeWork;

public class DigitSignSum {

    public static void main(String[] args) {
        int n1 = 521;
        int n2 = 111;

        int sum1 = calculateDigitSignSum(n1);
        int sum2 = calculateDigitSignSum(n2);

        System.out.println("Sum of digits with their corresponding sign for n1 (" + n1 + "): " + sum1);
        System.out.println("Sum of digits with their corresponding sign for n2 (" + n2 + "): " + sum2);
    }

    public static int calculateDigitSignSum(int n) {
        // Convert the integer to a string to process each digit
        String strNum = String.valueOf(n);
        int sum = 0;

        // Iterate through each digit
        for (int i = 0; i < strNum.length(); i++) {
            char digit = strNum.charAt(i);
            int num = Character.getNumericValue(digit);

            // Add or subtract the digit based on its position
            if (i == 0) {
                // The most significant digit is always positive
                sum += num;
            } else {
                // Other digits have opposite signs to their adjacent digits
                if (i % 2 == 1) {
                    sum -= num;
                } else {
                    sum += num;
                }
            }
        }

        return sum;
    }
}
