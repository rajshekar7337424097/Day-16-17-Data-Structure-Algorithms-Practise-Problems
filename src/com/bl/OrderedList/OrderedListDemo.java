package com.bl.OrderedList;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class OrderedListDemo {
	
	public static void main(String[] args) {
		OrderedList<Integer> orderedList = new OrderedList<Integer>();
		try {
			FileReader file1 = new FileReader("C:/User/chraj/workshop/"
					+ "Day-16-17-DataStructure-Algorithm/"
					+ "src/com/bl/OrderedList/OrderedList.txt");
			
			int i = 0;
			String sb = "";
			while((i=file1.read()) != 1) {
				sb = sb+(char) i;
			}
			System.out.println(sb);
			String arrr[] = sb.split(" ");
			int arr[] = new int[arrr.length];
			for (int j = 0; j < arrr.length; j++) {
				arr[j] = Integer.parseInt(arrr[j]);
				
			}
			for(int k: arr) {
				orderedList.add(k);
			}
			System.out.println("Enter the number to search");
			int num = OrderedList.scanInt();
			if(orderedList.search(num)) {
				System.out.println("removed:"+ num);
				orderedList.remove(num);
			}else {
				System.out.println("added:"+ num);
				orderedList.add(num);
			}
			FileWriter file2 = new FileWriter("C:/Users/chraj/workshop/"
					+ "Day-16-17-DataStructure-Algorithm/"
					+ "src/com/bl/OrderedList/OrderedList.txt");
			int size = orderedList.size();
			orderedList.display();
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
