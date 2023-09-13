package septemberDailyHomework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseWordsInString {
	/*
	Input1: s = "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"
	Input2: s = "God Ding"
	Output: "doG gniD"
	pseudo code
	Initialize an empty string to store the result
	Iterate through each word in the array
	Initialize an empty string to store the reversed word
	Iterate through the characters in the current word in reverse order
	Append the reversed word to the result
	Add a space after the reversed word if it's not the last word
	*/
	
	public String reverseWords(String s) {
        String[] words = s.split(" ");

	        // Initialize an empty string to store the result
	        String result = "";

	        // Iterate through each word in the array
	        for (int i = 0; i < words.length; i++) {
	            // Initialize an empty string to store the reversed word
	            String reversedWord = "";

	            // Iterate through the characters in the current word in reverse order
	            for (int j = words[i].length() - 1; j >= 0; j--) {
	                reversedWord += words[i].charAt(j);
	            }

	            // Append the reversed word to the result
	            result += reversedWord;

	            // Add a space after the reversed word if it's not the last word
	            if (i < words.length - 1) {
	                result += " ";
	            }
	        }

	        return result;
	    }

	    
    

    @Test
    public void testReverseWords() {
        ReverseWordsInString solution = new ReverseWordsInString();

        // Test case 1
        String input1 = "Let's take LeetCode contest";
        String expected1 = "s'teL ekat edoCteeL tsetnoc";
        String result1 = solution.reverseWords(input1);
        assertEquals(expected1, result1);
      System.out.println(result1);
        // Test case 2
        String input2 = "God Ding";
        String expected2 = "doG gniD";
        String result2 = solution.reverseWords(input2);
        assertEquals(expected2, result2);
        System.out.println(result2);
        
        // Additional test case
        String input3 = "Hello World@";
        String expected3 = "olleH @dlroW";
        String result3 = solution.reverseWords(input3);
        assertEquals(expected3, result3);
        System.out.println(result3);
    }
}
