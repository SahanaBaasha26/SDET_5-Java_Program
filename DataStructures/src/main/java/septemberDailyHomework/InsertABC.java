package septemberDailyHomework;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;


public class InsertABC {
	
	
	/*
	 * Input: word = "b"      Output: 2
	 * Input: word = "aaa"    Output: 6
	 * Input: word = "abc"    Output: 0
	 * 
	 * Pseudo code
	 * Initialize a counter for 'a''b' 'c' characters in the word.
	 * Initialize the number of insertions needed
	 * Loop through each character in the input word.
	 * Increment the 'a' counter if the current character is 'a'.
	 * Need to insert 'a' before 'b' if there are no 'a's before.
	 * Match 'a' with 'b' if 'a' is available.
	 * Increment the 'b' counter.
	 * Need to insert 'a' and 'b' before 'c' if either 'a' or 'b' is missing.
	 *    i)Match 'a' with 'c'.
	 *    ii)Match 'b' with 'c'.
	 * Increment the 'c' counter.
	 * After processing the entire word, we might still have some unmatched 'a' and 'b'.
	 * Return the total number of insertions required to make the string valid.
	 
	 */
	 public int minInsertionsToMakeValid(String word) {
	        int countA = 0; // Count of 'a' characters in the word.
	        int countB = 0; // Count of 'b' characters in the word.
	        int countC = 0; // Count of 'c' characters in the word.
	        
	        int insertions = 0; // Initialize the number of insertions needed.

	        for (char c : word.toCharArray()) {
	            if (c == 'a') {
	                countA++;
	            } else if (c == 'b') {
	                if (countA == 0) {
	                    insertions++; // Need to insert 'a' before 'b'.
	                } else {
	                    countA--; // Match 'a' with 'b'.
	                }
	                countB++; // Increase the count of 'b'.
	            } else if (c == 'c') {
	                if (countA == 0 || countB == 0) {
	                    insertions += 2; // Need to insert 'a' and 'b' before 'c'.
	                } else {
	                    countA--; // Match 'a' with 'c'.
	                    countB--; // Match 'b' with 'c'.
	                }
	                countC++; // Increase the count of 'c'.
	            }
	        }
	        
	        // After processing the entire word, we might still have some unmatched 'a' and 'b'.
	        insertions += countA * 2 + countB; // Need to insert 'a' and 'b' accordingly.
	        
	        return insertions;
	    }

	 @Test
	 public void testValidStringInsertion() {
	     // Test case 1: Input "b" should output 2
	     Assert.assertEquals(minInsertionsToMakeValid("b"), 2);

	     // Test case 2: Input "aaa" should output 6
	     Assert.assertEquals(minInsertionsToMakeValid("aaa"), 6);

	     // Test case 3: Input "abc" should output 0
	     Assert.assertEquals(minInsertionsToMakeValid("abc"), 3);
	 }
}
