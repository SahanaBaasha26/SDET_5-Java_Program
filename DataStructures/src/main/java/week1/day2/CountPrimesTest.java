package week1.day2;


import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class CountPrimesTest {
    
    @Test
    public void testCountPrimes() {
        int n = 20;
        int expectedCount = 8;
        int actualCount = countPrimes(n);
        
        assertEquals(expectedCount, actualCount);
    }
    
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        int count = 0;
        int num = 2;
        
        while (num < n) {
            if (isPrime[num]) {
                count++;
                
                for (int i = num + num; i < n; i += num) {
                    isPrime[i] = false;
                }
            }
            
            num++;
        }
        
        return count;
    }
}