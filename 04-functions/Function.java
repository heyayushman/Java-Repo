
//     public static void printName(String name){
//         System.err.println("Hello " + name );
//     }
//     public static void main(String[] args){
//         System.err.print("Enter your name : ");
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         printName(name);
//     }
// }

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

public class Function{
    public static void Arithmetic(int a, int b){
        System.out.println("Sum = " + (a + b));
        System.out.println("Sub = " + (a - b));
        System.out.println("Multiply = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Mod = " + (a % b));
    }
    public static void main(String[] args){
        int a = 20, b = 5;
        Arithmetic(a, b);
    }
}