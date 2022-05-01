package com.BalancingBrackets;

//Java program for checking
//balanced brackets
import java.util.*;

public class Brackets {

	public boolean BalanceCheck(String input)
	{
		
		Stack<Character> stack = new Stack<Character>();

	//Pushing opening bracket into a stack
		for (int i = 0; i < input.length(); i++)
		{
			char x = input.charAt(i);

			if (x == '(' || x == '[' || x == '{')
			{
				// Push the opening brackets into a stack
				stack.push(x);
				continue;
			}
			
			// If current character is not opening bracket, then it must be closing. So stack cannot be empty at this point.
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		return (stack.isEmpty());
	}

	
}
