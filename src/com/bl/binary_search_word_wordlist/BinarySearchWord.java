package com.bl;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class BinarySearchWord {
	public static String[] fileRead(File file) throws IOException {
		String word = "";
		ArrayList<String> s1 = new ArrayList<String>();
		FileReader fileReader = new FileReader(file);
		int c;
		while((c = fileReader.read()) != -1) {
			if (c == 32) {
				s1.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) c);
			}
		}
		fileReader.close();
		String[] search = new String[s1.size()];
		s1.toArray(search);
		return search;
	}

	public static void main(String[] args) {
		try {
			File file = new File("C:/Users/chraj/Fellowship-java/subString.txt");
			String str[] = fileRead(file);
			for (String search : str) {
				System.out.println(search);

			}
			System.out.println("Enter word to search");
			String search = Search.sc.nextLine();
			int n = Search.binary(str, search);
			if (n > 0) {
				System.out.println("found");
			}else {
				System.out.println("not found");
			}
			Search.sc.close();
	} catch (Exception e) {
			System.out.println(e);
		}	
	}

}
