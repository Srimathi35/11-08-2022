package com.collection.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
     List<String> words = new ArrayList<String>();
		
        
		words.add("Mango");  
		words.add("Apple");  
		words.add("Orange");  
		words.add("Guava");
		words.add("Kiwi");
		words.add("Banana");
		words.add("Cherry");
		words.add("Peach");
		words.add("Grape");
	
		
		printWord(words);

	}

	public static void printWord(List<String> words)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the word length");
		
		int length=sc.nextInt();
		
		
		for (int i=0;i<words.size();i++) {
			
		String n=words.get(i);
		
		if(n.length()==length)
			{
				System.out.println(n);
			}
		}
	}
}
