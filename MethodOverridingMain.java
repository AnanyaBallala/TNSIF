package com.TNSIF.RunPolymorphism.Module;

public class MethodOverridingMain {
	public static void main(String [] args){
	Methodoverriding a;
	a=new Dog();
	a.sound();
	a=new Lion();
	a.sound();
}
}
