package week3.day2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddDigits1 {



    /*
    Given an integer num, repeatedly add all
    its digits until the result has only one digit, and return it.
    Example 1:
    Input: num = 38
    Output: 2
    Explanation: The process is
    38 --> 3 + 8 --> 11
    11 --> 1 + 1 --> 2
    Since 2 has only one digit, return it.

    Example 2:
    Input: num = 0
    Output: 0
     */

    /* Pseudo Code:
       - Initialize two variables, div & remainder
       - while loop to check the number > 9
       - number / 10 and store it in div variable
       - number % 10 and store it in remainder variable
       - number = div + remainder
       - return number
     */


    @Test
    public void test1()
    {
        int actual = addDigits(38);
        Assert.assertEquals(actual,2);
    }

    @Test
    public void test2()
    {
        int actual = addDigits(0);
        Assert.assertEquals(actual,0);
    }
    public int addDigits(int number)
    {
        int div;
        int remainder;
        while (number > 9)   // 38
        {
            div = number / 10;
            remainder = number % 10;
            number = div + remainder;
        }
        return number;
    }

}