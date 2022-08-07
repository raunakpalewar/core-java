import java.util.Scanner;

public class BasicIo{
	public static void main(String []args)

	{char charVal;
                  byte byteVal;
	short shortVal;
	int intVal;
	long longVal;
	float floatVal;
	double doubleVal;
	String strVal;

	 Scanner in = new Scanner(System.in);
        
        System.out.print("Enter charater value: ");
        charVal = in.next().charAt(0);
        
        System.out.print("Enter byte value: ");
        byteVal = in.nextByte();
        
        System.out.print("Enter short value: ");
        shortVal = in.nextShort();
        
        System.out.print("Enter integer value: ");
        intVal = in.nextInt();
        
        System.out.print("Enter long value: ");
        longVal = in.nextLong();
        
        System.out.print("Enter float value: ");
        floatVal = in.nextFloat();
        
        System.out.print("Enter double value: ");
        doubleVal = in.nextDouble();
        
        in.nextLine();   // Skip extra newline character
        
        System.out.print("Enter a String: ");
        strVal = in.nextLine();
        

        in.close();      // Close input stream (Scanner)
	
	System.out.println("you entered character:"      +charVal);
	System.out.println("you entered byte:"        +byteVal);
	System.out.println("you entered short"    +shortVal);
	System.out.println("you entered integer"   +intVal);
	System.out.println("you entered long"    +longVal);
	System.out.println("you entered float:"    +floatVal);
	System.out.println("you entered double:"    +doubleVal);
	System.out.println("you entered string: "       +strVal);
}
}


