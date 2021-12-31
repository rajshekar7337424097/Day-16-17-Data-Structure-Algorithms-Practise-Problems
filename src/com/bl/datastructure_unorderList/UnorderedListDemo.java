package com.bl.datastructure_unorderList;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class UnorderedListDemo {
	public static void main(String[] args) {
		UnorderedList<String> unOrderedList = new UnorderedList<>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		try {
			@SuppressWarnings("resource")
			FileReader file1 = new FileReader("C:/Users/chraj/workshop/"
					+ "Day-16-17-DataStructure-Algorithm/"
					+ "src/com/bl/datastructure_unorderList/Unordered.txt");
			int i = 0;
			String sb = "";
			while ((i = file1.read()) != -1) {
				sb = sb + (char) i;
			}
			String arr[] = sb.split("");
			for (int j = 0; j < arr.length -1; j++) {
				unOrderedList.add(arr[j]);
			}

			System.out.println("Enter a word to Search");
			String word = sc.nextLine();
			if(unOrderedList.search(word)) {
				unOrderedList.remove(word);
				System.out.println("Word removes from the List");
			}else {
				unOrderedList.add(word);
				System.out.println("Word added into the List");
			}
			unOrderedList.display();
			int size = unOrderedList.size();
			FileWriter file2 = new FileWriter("C:/Users/chraj/workshop/"
					+ "Day-16-17-DataStructure-Algorithm/"
					+ "src/com/bl/datastructure_unorderList/Unordered.txt");
			for (int h = 0; h <= size -1; h++) {
				file2.write(unOrderedList.pop(0)+"");
			}
			file2.close();

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
