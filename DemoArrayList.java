package com.TNSIF.Collections.Demo;
import java.util.ArrayList;
import java.util.List;
public class DemoArrayList {
public static void main(String [] args){
	List<Integer> ll=new ArrayList<Integer>();
	ll.add(67);
	ll.add(1876);
	ll.add(1,89);
	//ll.add("hiii");
	/*ll.add(90.87f);*/
	ll.remove(0);
	
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	System.out.println(ll.contains(1876));
	System.out.println(ll.get(0));
	
	for(int i:ll){
		System.out.println(i);
	}
	ll.clear();
	
}
}


