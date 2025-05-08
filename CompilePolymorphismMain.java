package com.TNSIF.CompilePolymorphism.Module;

import com.TNSIF.CompilePolymorphism.Module.MethodOverloading.Calc;

public class CompilePolymorphismMain {
public static void main(String [] args){
	Calc obj=new Calc();
	System.out.println(obj.add(3.4f,89.8f));
	System.out.println(obj.add(34,898));
	
}
}
