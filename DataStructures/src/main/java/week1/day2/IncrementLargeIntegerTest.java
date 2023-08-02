package week1.day2;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class IncrementLargeIntegerTest {

    @Test
    public void testIncrement() {
        int[] digits = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};
        int[] actual = increment(digits);
        assertArrayEquals(expected, actual);
    }

    public static int[] increment(int[] digits) {
        int n = digits.length;
        int carry = 1;
        int[] result = new int[n + 1];
        
        // Start incrementing from the rightmost digit
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        
        // If there is a carry after incrementing, set the first element to the carry value
        if (carry > 0) {
            result[0] = carry;
        }
        
        return (carry > 0) ? result : digits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = increment(digits);
        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
