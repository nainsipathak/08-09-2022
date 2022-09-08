package com.exercise.bll;

public class CountDigits {
	 public static int countDigits(int n, int k)
	    {
	        if (n == 0)
	            return 0;
	  
	        // Extracting least
	        // significant digit
	        int digit = n % 10;
	        if (digit == k)
	            return 1 + countDigits(n / 10, k);
	  
	        return countDigits(n / 10, k);
	    }
}  
	 


