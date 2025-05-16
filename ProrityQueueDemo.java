package com.TNSIF.CollectrionsTwo;

//import java.util.LinkedList;
import java.util.PriorityQueue;

public class ProrityQueueDemo {
	public static void main(String [] args){
		PriorityQueue <Integer> ll=new PriorityQueue<Integer>();
		ll.add(90);
		ll.add(85);
		ll.add(56);
		ll.add(108);
		for(int x:ll){
			System.out.println(x);
		}
	}
}
