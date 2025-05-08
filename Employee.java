package com.TNSIF.MultiInheritance;



public class Employee {
	void Work(){
		System.out.println("Employee works");
	}
	

}
class Developer extends Employee{
	void WriteCode(){
		System.out.println("Employee writes code");
	}
	

}
class FrontEndDev extends Developer{
	void addStyles(){
		System.out.println("works in front end");
	}
}
class Junior extends FrontEndDev{
	void intern(){
		System.out.println("Works under Frontend dev");
	}
}