package com.bl.questionFindNumber;

import java.util.Scanner;

public class QuestionFindNumberDemo {
	
	public static void main(String[] args) {
		
		QueationFindNumber questionFindNumber = new QueationFindNumber();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int range = (int) Math.pow(2, num);
		System.out.printf("Assume to take a number between 0 and range:", 0, num);
		int yourNum = questionFindNumber.search(0, range);
		System.out.println("Your number is %d :" +yourNum);
		sc.close();
	}

}
