package com.GreatLearning.MentoredLabSession3.Question1;

import java.util.Scanner;


public class BalanceBracketDriver {

	// Driver code
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BracketBalance pc = new BracketBalance();

		// Declaring no. of Brackets
		System.out.println("Enter Brackets To Check Wether They Are Balanced Or Not");
		String expr = sc.next();
		System.out.println();

		// Function call
		if (BracketBalance.areBracketsBalanced(expr))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}

}


//([[{}]])
// ([[{}]]))
