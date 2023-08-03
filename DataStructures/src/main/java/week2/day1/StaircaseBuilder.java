package week2.day1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StaircaseBuilder {

    public static int countCompleteRows(int n) {
        int completeRows = 0;
        int coinsRequired = 0;

        for (int i = 1; coinsRequired <= n; i++) {
            coinsRequired += i;

            if (coinsRequired <= n) {
                completeRows++;
            }
        }

        return completeRows;
    }

    @Test
    public void testCountCompleteRows() {
        int n = 8;
        int expected = 3;
        int result = countCompleteRows(n);
        assertEquals(expected, result);
        System.out.println("Number of complete rows: " + result);
    }
/*
    public static void main(String[] args) {
        int n = 8;
        int completeRows = countCompleteRows(n);
        System.out.println("Number of complete rows: " + completeRows);
        
    }*/
}
