package com.BalancingBrackets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a string: ");  
			String str= sc.nextLine();                 
			System.out.println("You have entered: "+str); 
			sc.close();
			
			//checking for input validity
			boolean validity = true;
			for (int i = 0; i < str.length(); i++)
			{
				char x = str.charAt(i);

				if (x == '(' || x == '[' || x == '{' || x == ')' || x == ']' || x == '}')
				{
					validity=true;
				}
				else
				{
					validity = false;
					System.out.println("Unexpected characters encountered. Only '(', ')', '{', '}', '[', ']' are allowed");
					break;
				}
			}
			
			if (validity == true) {
				Brackets bracket = new Brackets();
				
				if (bracket.BalanceCheck(str))
					System.out.println("The entered string '" + str+ "' is Balanced ");
				else
					System.out.println("The entered string '" +str+ "' is NOT balanced ");
			}
		}

	}

}
