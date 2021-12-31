package com.bl.customizeMessageDemontration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	String firstName;
	String fullName;
	String contactNumber;
	String date;
	String message = "Hello <<name>>, We have your full name as "
			+ "<<full name>> in our system. \n Your contact number is "
			+ "91-xxxxxxxxxx. \nPlease, let us know in cae of any clarification. \n Thank you BridgeLabz 01/01/2016.";

	public void start() {
		getUserInfo();
		replace("<<name>>", firstName);
		replace("<<full name>>", fullName);
		replace("xxxxxxxxxx", contactNumber);
		replace("01/01/2016",date);
		System.out.println(message);
	}

	private void getUserInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name:");
		firstName = sc.nextLine();
		System.out.println("Enter your Full Name:");
		fullName = sc.nextLine();
		System.out.println("Enter your Contact number :");
		contactNumber = sc.nextLine();
		System.out.println("Enter date in dd/mm/yyyy format:");
		date = sc.nextLine();
		sc.close();
	}

	private void replace(String stringtoReplace, String replacement) {
		Pattern pattern = Pattern.compile(stringtoReplace);
		Matcher matcher = pattern.matcher(message);
		message = matcher.replaceFirst(replacement);
	}

	public static void main(String[] args) {
		Regex regex = new Regex();
		regex.start();
	}
}
