package com.TNSIF.TypesOfVar.Main;
import com.TNSIF.TypesOfVariables.TypeOfVar;


public class Main {
	public static void main(String[] args){
		
		TypeOfVar obj=new TypeOfVar();
		obj.numone=40;
		int res=obj.numone;
		System.out.println("instance var:"+res);
		obj.display();
		System.out.println("Static: "+TypeOfVar.numtwo);
	}

}
