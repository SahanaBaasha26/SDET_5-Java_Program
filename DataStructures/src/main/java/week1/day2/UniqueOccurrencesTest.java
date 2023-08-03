package week1.day2;


	import org.junit.Test;
	import static org.junit.Assert.assertEquals;

	import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

	public class UniqueOccurrencesTest {
	    
	    @Test
	    public void testUniqueOccurrences() {
	        int[] arr = {1, 2, 2, 1, 1, 3};
	        boolean expected = true;
	        boolean actual = uniqueOccurrences(arr);
	        
	        assertEquals(expected, actual);
	    }
	    
	    public static boolean uniqueOccurrences(int[] arr) {
	        // Create a map to store the count of occurrences for each value
	        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

	        // Count the occurrences of each value in the array
	        for (int num : arr) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }

	        // Create a set to track the occurrence counts
	        Set<Integer> occurrenceSet = new HashSet<Integer>();

	        // Check if there are any duplicate occurrence counts
	        for (int count : countMap.values()) {
	            if (occurrenceSet.contains(count)) {
	                return false;
	            } else {
	                occurrenceSet.add(count);
	            }
	        }

	        return true;
	    }
	}