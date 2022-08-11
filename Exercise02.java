package com.collection.demo;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {

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
		
		for(String word:words) {
			
			if(word.length()==5)
			{
				System.out.println(word);
			}
		}
	}

	
}
