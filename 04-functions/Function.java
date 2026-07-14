
import java.util.Scanner;


public class Function {
    public static void printName(String name){
        System.err.println("Hello " + name );
    }
    public static void main(String[] args){
        System.err.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printName(name);
    }
}

/**
//*Method	    Description
nextBoolean()	Reads a boolean value from the user
nextByte()	    Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	    Reads a float value from the user
nextInt()	    Reads a int value from the user
nextLine()	    Reads a String value from the user
nextLong()	    Reads a long value from the user
nextShort()	    Reads a short value from the user
 */