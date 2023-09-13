package septemberDailyHomework;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class RestoreString {
	/*
	 * input1 = "codeleet"  O/p = "leetcode"
	 * input2 = "abc"       o/p="abc"
	 * input3 = "aiohn"     O/p="nihao"
	 * Pseudo code
	 * 1.Create a character array to store the shuffled string.
	 * 2.Loop through each character in the input string s.
	 * 3.Get the current character from s.
	 * 4.Get the target index from indices.
	 * 5.Place the character in the shuffled array at the correct index.
	 * 
	 * 
	 * 
	 */

	public String restoreString(String s, int[] indices) {
		char[] shuffled = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			int targetIndex = indices[i];
			shuffled[targetIndex] = currentChar;
		}
		return new String(shuffled);
	}

	@Test
	public void testRestoreString() {
		RestoreString solution = new RestoreString();

		// Test case 1
		String input1 = "codeleet";
		int[] indices1 = {4, 5, 6, 7, 0, 2, 1, 3};
		String expected1 = "leetcode";
		String result1 = solution.restoreString(input1, indices1);
		assertEquals(expected1, result1);
		System.out.println(result1);
		// Test case 2
		String input2 = "abc";
		int[] indices2 = {0, 1, 2};
		String expected2 = "abc";
		String result2 = solution.restoreString(input2, indices2);
		assertEquals(expected2, result2);
		System.out.println(result2);

		// Additional test case
		String input3 = "aiohn";
		int[] indices3 = {3, 1, 4, 2, 0};
		String expected3 = "nihao";
		String result3 = solution.restoreString(input3, indices3);
		assertEquals(expected3, result3);
		System.out.println(result3);
	}
}