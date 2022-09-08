package com.exercise.bll;

import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
    
        int firstNum, secondNum;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter an integer: ");
        firstNum = sc.nextInt();
         
        System.out.println("Enter another integer larger than the first one: ");
        secondNum = sc.nextInt();
        
        int even = 0;
        int sumE = 0;
        int odd = 0;
        int sumO = 0;
        int count = 1;
        
         
 
        while (firstNum <= secondNum)
        {
            if (firstNum % 2 ==0)
                sumE = sumE + firstNum ;
            else
                sumO = sumO + firstNum;
        }
         
        System.out.println("Even numbers: " + sumE);
        System.out.println("Sum of even numbers = ");
        System.out.println("Odd numbers: " + sumO);
        System.out.println("Sum of odd numbers = ");
    
	sc.close();
	}
 }



    


