import java.util.Scanner;

class Cal{
	
	public void sum(int a,int b){
	System.out.println("Sum="+(a+b));
	}

	public void sub(int a,int b){
	System.out.println("Sum="+(a-b));
	}
	public void mul(int a,int b){
	System.out.println("Sum="+(a*b));
	}
	public void dif(int a,int b){
	System.out.println("Sum="+(a/b));
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to my calculator");
		Scanner s = new Scanner(System.in);
		Cal obj=new Cal();
		System.out.println("Enter two numbers(a>b):");
		int num1=s.nextInt();
		int num2=s.nextInt();
		
		
		System.out.print("1.SUM\n2.SUB\n3.MULTIPLY\n4.Division\nCHOICE:");
		int n=s.nextInt();
		
			switch(n){
			case 1:
			obj.sum(num1,num2);
			break;

			case 2:
			obj.sub(num1,num2);
			break;

			case 3:
			obj.mul(num1,num2);
			break;
		
			case 4:
			obj.dif(num1,num2);
			break;
		
			
			}
		
	}


}