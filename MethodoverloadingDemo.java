package com.basic;

class Casio
{
	int num1,num2;
	String operations;
	Public Casio()
	{
		num1=0;
		num2=9;
		operations="studying";
	}
	public void addition(int i,int j)
	{
		System.out.println(num1+num2);
	}
	
}

public class MethodoverloadingDemo {
	public static void main(String[] args)
	{
	
	Casio obj=new Casio();
	obj.addition();
	}

}
