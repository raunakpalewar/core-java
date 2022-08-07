package com.basic;
import java.util.Scanner;

class Area
{
	int length,breath;
	public void setDim()
	{
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
		breath=sc.nextInt();
	}
	public void getArea()
	{
		System.out.println("area is : "+length*breath);
	}
}

public class Classes {
	
	public static void main(String[] args) {
		//int length,breath;
		
		Area obj=new Area();
		obj.setDim();
		obj.getArea();
		
	
	}

}
