package week2.day1;


	
	/**
     *  1) Input int [] and find number x
     *  2) output int
     *  3) data set--> {1, 1, 2, 2, 2, 2, 3}-->2,{-1,-1,0,2,3,4,}-->-1,{1,2,3,4}--> x=0
     *  4) check the element is empty
     *  5) initialize count=0
     *  6) iterate with each element check if the element present 
     *      if present then increase the count by 1
     *  7) Then print the count      
     */
	
	public class OccurrenceCounter {

	    public static int countOccurrences(int[] arr, int x) {
	        if (arr == null || arr.length == 0) {
	            return 0;
	        }

	        int count = 0;

	        for (int element : arr) {
	            if (element == x) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 1, 2, 2, 2, 2, 3};
	        int x = 2;
	        int count = countOccurrences(arr, x);
	        System.out.println("Count: " + count);
	    }
	}

