package classRoomSession;

public class RemoveVowels {
	
	
	/*
	 * Input string "Hi testleaf students"
	 * 
	 * 1.Initialize an empty string to store the result
	 * 2.Loop through each character in the input string
	 * 3.Check if the current character is not a vowel (both uppercase and lowercase)
	 * 4.If it's not a vowel, append it to the result string
	 * 5.Convert the result StringBuilder to a string and return it
	 * 
	 * 
	 */
    public static void main(String[] args) {
        // Input string
        String input = "Hi testleaf students";
        
        // Call the removeVowels function and store the result
        String result = removeVowels(input);
        
        // Print the result
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + result + "\"");
    }
    
    // Function to remove vowels from a string
    public static String removeVowels(String input) {
        // Initialize an empty string to store the result
        StringBuilder result = new StringBuilder();
        
        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // Check if the current character is not a vowel (both uppercase and lowercase)
            if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i'
                    && currentChar != 'o' && currentChar != 'u'
                    && currentChar != 'A' && currentChar != 'E'
                    && currentChar != 'I' && currentChar != 'O'
                    && currentChar != 'U') {
                // If it's not a vowel, append it to the result string
                result.append(currentChar);
            }
        }
        
        // Convert the result StringBuilder to a string and return it
        return result.toString();
    }
}
