package com.TNSIF.CollectrionsTwo;

//import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.List;
public class EmployeeImplementation {
	public static void main(String [] args){
List <EmployeeDetails> ll=new LinkedList<EmployeeDetails>();
ll.add(new EmployeeDetails("kunal",90,"public"));
for(EmployeeDetails x:ll){
	System.out.println(x);
}
}
}
