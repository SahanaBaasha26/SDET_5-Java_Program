package week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class TargetElements {


	public List<Integer> TargetRemoval(int[] input,int target)
	{
		List<Integer> final_list = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++)
		{ if (input[i]!=target)
		{
			final_list.add(input[i]);
		}
			
		}
		return final_list;
		
	}
	
	@Test
	public void test1()
	{
		List<Integer> compare_list = Arrays.asList(2, 4, 5);
		Assert.assertEquals(compare_list, TargetRemoval(new int[] {2, 3, 3, 4, 5},3));
	}
	@Test
	public void test2()
	{
		List<Integer> compare_list = Arrays.asList(2, 3,3, 5);
		Assert.assertEquals(compare_list, TargetRemoval(new int[] {2, 3, 3, 4, 5},4));
	}

}

/*Problem Statement
 * Remove the target element in the array
							
	example 1: input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			   explanation: when 3 is removed from input array, 
							output is [2, 4, 5]
	
	example 2: input = [2, 2], target=2
			   output = []
			   explanation: when 2 is removed, output would be empty array/	*/

/*Since List maintains insertion order and can have duplicate elements within - Plan is to scan through the array write input[i] inside list 
 * whenever input[i]!=target element*/