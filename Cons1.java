/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
*/

package com.basic;

class Student{
	String name;
	int roll_no;
	
	//Student()
	//{
		//System.out.println("Enter the name and roll no \n");
	//}
}

public class Class2 {
	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.name="john";
		obj.roll_no=2;
		
		System.out.println(obj.name+obj.roll_no);
	}

}
