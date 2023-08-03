package week4.day1;

public class ExcelColumnTitleToNumber {
	 /*Pseudo code:
		1. Define a function that takes a string 'columnTitle' as input and returns an integer (column number).
	    2. Initialize a variable 'result' to 0, which will hold the final column number.
		3. Loop through each character (c) in the 'columnTitle':
           - Calculate the digit value of the character by subtracting the ASCII value of 'A' and adding 1 (since A is 1, B is 2, and so on).
            - Multiply the 'result' by 26 (base) and add the digit value to 'result'.
		4. Return the value of 'result'.

          */
    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (char c : columnTitle.toCharArray()) {
            int digitValue = c - 'A' + 1;
            result = result * 26 + digitValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String columnTitle1 = "A";
        int result1 = titleToNumber(columnTitle1);
        System.out.println("Column Title: " + columnTitle1);
        System.out.println("Column Number: " + result1);

        String columnTitle2 = "B";
        int result2 = titleToNumber(columnTitle2);
        System.out.println("Column Title: " + columnTitle2);
        System.out.println("Column Number: " + result2);

        String columnTitle3 = "AA";
        int result3 = titleToNumber(columnTitle3);
        System.out.println("Column Title: " + columnTitle3);
        System.out.println("Column Number: " + result3);

        String columnTitle4 = "ZY";
        int result4 = titleToNumber(columnTitle4);
        System.out.println("Column Title: " + columnTitle4);
        System.out.println("Column Number: " + result4);
    }
}
