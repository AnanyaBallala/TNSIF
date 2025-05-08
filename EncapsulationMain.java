package com.TNSIF.Encapsulation;

public class EncapsulationMain {
	public static void main(String [] args){
		DemoEncapsulation obj=new DemoEncapsulation();
		obj.setEid(1000);
		int id=obj.getEid();
		System.out.println(id);
		obj.setename("gopi");
		String result=obj.getename();
		System.out.println(result);
	}

}
