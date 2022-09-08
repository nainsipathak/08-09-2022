package com.exercise.pll;

import java.util.Scanner;

import com.exercise.bll.CountDigits;

public class TestCountDigits {

	public static void main(String[] args) { 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n>0) 
			
		{
			CountDigits c= new CountDigits();
			System.out.println("total number of digits in:"+c.countDigits(n, n));
	}
else 
{
	System.out.println("Invalid input");
	sc.close();


	}

 }
}
 