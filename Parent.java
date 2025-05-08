package com.TNSIF.Hierarchial;

public class Parent {
void display(){
	System.out.println("i am the parent");
}
}
class Childone extends Parent{
	void one(){
		System.out.println("i am the fst child");
	}
}
class Childtwo extends Parent{
	void two(){
		System.out.println("i am the scnd child");
	}
}