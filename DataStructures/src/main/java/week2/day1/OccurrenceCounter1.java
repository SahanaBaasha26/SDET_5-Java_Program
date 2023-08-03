package week2.day1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OccurrenceCounter1 {

    public static int countOccurrences(int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 0;

        for (int element : arr) {
            if (element == x) {
                count++;
            }
        }

        return count;
    }

    @Test
    public void testCountOccurrences() {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int x = 1;
        int count = countOccurrences(arr, x);
        assertEquals(2, count);
        System.out.println(count);
    }
}

