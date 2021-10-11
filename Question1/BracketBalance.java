package com.GreatLearning.MentoredLabSession3.Question1;

import java.util.*;

public class BracketBalance {

	// function to check if brackets are balanced
	public static boolean areBracketsBalanced(String expr)
	{
		//      Using Stack class
		Stack<Character> st = new Stack<>();

		// Traversing the Expression
		for (int i = 0; i < expr.length(); i++)
		{
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{')
			{
				// Push the element in the stack
				st.push(x);
				continue;
			}

			if (st.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = st.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = st.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = st.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (st.isEmpty());
	}



}
