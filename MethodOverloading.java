package com.TNSIF.CompilePolymorphism.Module;

public class MethodOverloading {
	public static class Calc{
		public static int add(int a, int b){
			return a+b;
		}
		
		public static float add(float a, float b){
			return a+b;
		}
	}
}
