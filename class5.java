/*Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
*/
package com.basic;

class Student{
	int roll_no;
	int number;
	String name;
	String address;
	Student(){
		System.out.println("print data");
	}
	
}

public class Class5 {
	public static void main(String[] args) {
	
		Student obj1=new Student();
		Student obj2=new Student();
		
		obj1.roll_no=2;
		obj1.name="john";
		obj1.number=645546;
		//obj1.address="jhkfdkld";
		
		obj2.roll_no=3;
		obj2.name="sam";
		obj2.number=55556546;
		obj2.address="jhdfdkld";
		
		System.out.println(obj1.roll_no + obj1.name + obj1.number + obj1.address +"\n" +obj2.roll_no + obj2.name + obj2.number + obj2.address);
	}

}
