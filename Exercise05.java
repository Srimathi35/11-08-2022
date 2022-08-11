package com.collection.demo;

import java.util.LinkedList;

public class Exercise05 {

	public static void main(String[] args) {
		
		LinkedList<String> languages = new LinkedList<>();
		
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("Python");
		languages.add("Perl");
		languages.add("Ruby");
		
		for(String language : languages)
		System.out.println(language);
		
		languages.remove(5);
		System.out.println(languages);
		
		languages.remove("Kotlin");
		System.out.println(languages);
		

	   LinkedList<String> l1= new LinkedList<>();
	   
	   l1.add("Python");
	   l1.add("Ruby");
	   l1.add("Perl");
       
	   languages.removeAll(l1);
	   System.out.println(languages);
	   
	   languages.clear();
	   System.out.println(languages);
	}
	   
} 
