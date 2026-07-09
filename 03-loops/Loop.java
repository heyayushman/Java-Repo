import java.util.*;
class Loop {
    public static void main(String[] args) {

        //? for loop

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
           System.out.println(num + " * " + i + " = " + (num * i));
        }

        //? while loop

        // int i = 1;
        // while(i <= 100){
        //     System.out.println("Pj is PANDU");
        //     i++;
        // }


    }
}