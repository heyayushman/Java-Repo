
import java.util.*;

class WhileLoop{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        // while(i <= 10){
        //     System.out.println(x + " * " + i + " = " + (x * i));
        //     i++;
        // }

        //print sum of n natural numbers

        int sum = 0;
        while(i <= num){
            sum += i;
            i++;
        }
        System.err.println("Sum of N natural numbers : " + sum);


        //do-while

        // do { 
        //     System.out.println(x + " * " + i + " = " + (x * i));
        //     i++;
        // } while (i <= 10);
    }
}