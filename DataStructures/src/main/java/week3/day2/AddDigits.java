package week3.day2;
import org.junit.Test;
import org.junit.Assert;

//port junit.framework.Assert;
public class AddDigits {
	
	public int sumofDigits(int num)
	{
		int sum=0;
		
		while(sum==0)
		{
				
		while(num>0)
		{
			sum=sum+num%10;
			System.out.println(sum);
			num=num/10;
			System.out.println(num);
			
		}
		
		if(sum>10)
		{
		  num=sum;
		  sum=0;
		}
		
		}
		
		return sum;
		
		
		
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2,sumofDigits(38) );
	}
	@Test
	public void test3()
	{
		Assert.assertEquals(3,sumofDigits(6789) );
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(0,sumofDigits(0) );
	}
	
	

}

/*Problem Statement 
 * 	https://leetcode.com/problems/add-digits/description/
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 * Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

Input: num = 0
Output: 0
 * */

/* Pseudo Code 
 * while num>0
 * {
 * sum=sum+num%10;
 * num=num/10;
 * 
 * }
 * */