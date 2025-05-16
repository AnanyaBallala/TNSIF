package com.TNSIF.CollectrionsTwo;

public class EmployeeDetails {
	public String name;
	public int age;
	public String sector;
	public EmployeeDetails(String name, int age, String sector){
		this.age=age;
		this.name=name;
		this.sector=sector;
	}
	public String toString(){
		return (name+" "+age+" "+sector);
	}
	
}
