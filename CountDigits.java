package com.exercise.bll;

public class CountDigits {
	 static int countdigits(int n, int k)
	    {
	        if (n == 0)
	            return 0;
	  
	        // Extracting least
	        // significant digit
	        int digit = n % 10;
	        if (digit == k)
	            return 1 + countdigits(n / 10, k);
	  
	        return countdigits(n / 10, k);
	    }
	  
	    // Driver Code
	    public static void main(String[] args)
	    {
	        int n = 1000;
	        int k = 0;
	        System.out.println(countdigits(n, k));
	    }
	}


