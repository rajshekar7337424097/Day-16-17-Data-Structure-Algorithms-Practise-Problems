package com.bl.permutation_string;

import java.util.Scanner;

public class PermutationString {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String you to permutate:");
		String inputStr = sc.next();
		System.out.println("Permutated String is :");
		permutationString(inputStr, "");
	}

	private static void permutationString(String inputStr, String result) {
		if (inputStr.length() == 0) {
			System.out.println(result+"");
			return;
		}
		for (int i = 0; i < inputStr.length(); i++) {
			char ch = inputStr.charAt(i);
			String leftSubstr = inputStr.substring(0, i);
			String rightSubstr = inputStr.substring(i + 1);
			String restSubStr = leftSubstr + rightSubstr;
			permutationString(restSubStr, result + ch);
			
		}
	}
}
