package com.exercise.bll;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		final String account_pin="ABCD22";
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(count<=3) {
			count++;
			System.out.println("Enter your pin:");
			String pin= sc.next();
			
			if(pin.equals(account_pin)) {
				
				System.out.println("Correct,Welcome back");	
			}
			
				else {
					System.out.println("Incorrect,try again");
				}
					
				if(count==3) {
				System.out.println("Sorry but you have locked out");
				}
		
	 }
		sc.close();
   }
 }

		


