
import java.util.*;

class Loop {

    public static void main(String[] args) {

        //? for loop
        // System.out.print("Enter a number: ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // for(int i = 1; i <= 10; i++){
        //    System.out.println(num + " * " + i + " = " + (num * i));
        // }
        //? while loop
        // int i = 1;
        // while(i <= 100){
        //     System.out.println("Pj is PANDU");
        //     i++;
        // }
//? taking marks
        System.out.print("Enter 1 or 0 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            System.out.print("Enter marks : ");
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks >= 89 && marks >= 60) {
                System.out.println("This is also Good");
            } else if (marks >= 59 && marks >= 0) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("This is Good too");
            }
        } else {
            System.out.println("Stopped");
        }
    }
}
