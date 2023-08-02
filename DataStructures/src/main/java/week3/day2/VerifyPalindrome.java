package week3.day2;



import org.junit.Test;
import org.junit.Assert;

//import junit.framework.Assert;

public class VerifyPalindrome {
	  public boolean isPalindrome(int x) {
		  
		  int newvalue=0,reversevalue=0,quotient=0,reminder;
		  int number=x;
		  
		  if(x<0)
		  {
			  return false;
		  }
		  if (x==1||x==2||x==3||x==4||x==5||x==6||x==7||x==8||x==9) {
			  return true;
		  }
	        while (number>=10) {
	        	
	        	reversevalue=reversevalue*10;
	        	quotient=number/10;
	        	reminder=number%10;
	        	newvalue=reminder*10;
	        	reversevalue=reversevalue+newvalue;
	        	number=quotient;
	        	      	
	        }
	        
	        reversevalue = reversevalue+quotient;
	        if(reversevalue==x)
	        {
	        	return true;
	        }
	        
	        return false;
	    }
	
	  @Test
	  public void verifyPalindrome()
	  {
		  Assert.assertEquals(true, isPalindrome(343));
	  }
	  @Test
	  public void verifyNotPalindrome()
	  {
		  Assert.assertEquals(false, isPalindrome(241));
	  }
	  
	  @Test
	  public void verifyNotPalindromeNeg()
	  {
		  Assert.assertEquals(false, isPalindrome(-111));
	  }
//	  
	  @Test
	  public void verifyPalindrome5Digit()
	  {
		  Assert.assertEquals(true, isPalindrome(34343));
	  }
	  
	  @Test
	  public void verifyNotPalindrome5Digit()
	  {
		  Assert.assertEquals(false, isPalindrome(34123));
	  }
	
}