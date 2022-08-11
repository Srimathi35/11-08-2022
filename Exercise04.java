package com.collection.demo;

import java.util.ArrayList;

public class Exercise04 {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Cow");
        
		for(String animal : animals) {
			System.out.println(animal);
		}
		

		animals.add(3,"Horse");
		System.out.println(animals);
		}
	}


