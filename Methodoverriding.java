package com.TNSIF.RunPolymorphism.Module;

public class Methodoverriding {
	public void sound(){
		System.out.println("Animal makes sound");
		
	}
	
}
 class Dog extends Methodoverriding{
	public void sound(){
		System.out.println("dog barks");
	}
}
 class Lion extends Methodoverriding{
	public void sound(){
		System.out.println("Lion roars");
	}
}