/**
 * Java program to read input using Scanner class
 */
import java.util.Scanner;

public class BasicIO1 {

    public static void main(String[] args) {
        
        /*
         * Declare all basic data types variable
         */
        char 	charVal;
        
        byte 	byteVal;
        short 	shortVal;
        int 	intVal;
        long 	longVal;
    
        float 	floatVal;
        double 	doubleVal;
        
        String  strVal;
        

        /* Create Scanner object */
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

        

        /*
         * Print value of all variable
         */
        System.out.println("You entered character: " + charVal);
        System.out.println("You entered byte: "      + byteVal);
        System.out.println("You entered short: "     + shortVal);
        System.out.println("You entered integer: "   + intVal);
        System.out.println("You entered long: "      + longVal);
        System.out.println("You entered float: "     + floatVal);
        System.out.println("You entered double: "    + doubleVal);
        System.out.println("You entered String: "    + strVal);
    }

}

/*
Note: System.out.print() method print string in same line. Whereas System.out.println() method print string and moves cursor to new line.

You might be wondering why I have used extra in.nextLine();
 at line no 56. This is because nextDouble() 
read next double value
 from input stream ignoring the new line character. 
Hence to eat that new line character
 I have used a dummy nextLine() function.

*/