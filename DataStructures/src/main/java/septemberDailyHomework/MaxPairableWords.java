package septemberDailyHomework;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MaxPairableWords {

	public static int maxNumOfPairs(String[] words) {
        int count = 0;
        int[] wordCount = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            if (wordCount[i] != -1) {
                String word = words[i];
                String reversed = reverse(word);

                for (int j = i + 1; j < words.length; j++) {
                    if (wordCount[j] != -1 && (word.equals(words[j]) || reversed.equals(words[j]))) {
                        count++;
                        wordCount[i] = -1;
                        wordCount[j] = -1;
                        break;
                    }
                }
            }
        }

        return count;
    }

    private static String reverse(String word) {
        char[] chars = word.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    @Test
    public void testMaxNumOfPairs() {
        String[] input1 = {"cd", "ac", "dc", "ca", "zz"};
        assertEquals(2, maxNumOfPairs(input1));
        System.out.println(Arrays.toString(input1));

        String[] input2 = {"ab", "ba", "cc"};
        assertEquals(1, maxNumOfPairs(input2));
        System.out.println(Arrays.toString(input2));

        String[] input3 = {"aa", "ab"};
        assertEquals(0, maxNumOfPairs(input3));
        System.out.println(Arrays.toString(input3));
    }
}

