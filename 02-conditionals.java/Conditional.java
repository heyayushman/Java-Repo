
import java.util.*;

class Conditional {

    public static void main(String[] args) {
        // System.out.print("Enter your age : ");

        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age > 18){
        //     System.out.print("You're eligible to vote");
        // }else {
        //     System.out.print("You're not eligible to vote..!"); 
        // }
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        // if(num % 2 == 0 || num == 0){
        //     System.out.print("Number is even");
        // }else {
        //     System.out.print("Number is odd");
        // }
        //? Switch
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        // if (a == b) {
        //     System.out.println("Equal");
        // } else {
        //     if (a > b) {
        //         System.out.println("a is greater");
        //     } else {
        //         System.out.println("a is lesser");
        //     }
        // }

        System.out.print("Enter 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division, 5 for modulo: ");
        int op = sc.nextInt();
        
        switch(op) {
            case 1:
                System.out.print("Sum = " + (a + b));
                break;
            case 2:
                System.out.print("Sub = " + (a - b));
                break;
            case 3:
                System.out.print("Product = " + (a * b));
                break;
            case 4:
                if(b == 0){
                    System.out.print("Zero is not allowed..!");
                }
                else {
                    System.out.print("Division = " + (a / b));
                }
                break;
            case 5:
                System.out.print("Mod = " + (a % b));
                break;
            default:
                System.err.println("Invalid Input");
        }
    }
}
