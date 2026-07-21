
import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();

        System.out.print("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 for quotient : ");
        int op = sc.nextInt();

        switch(op){
            case 1 -> System.out.println("Addition:"+ (a + b));
            case 2 -> System.out.println("Sub:"+ (a - b));
            case 3 -> System.out.println("Product:"+ (a * b));
            case 4 -> {if(b == 0){
                    System.out.println("Division is not possible with zero");
                }else {
                    System.out.println("Division:"+ (a / b));
                }
                }
            case 5 -> System.out.println("Quotient:"+ (a % b));
            default -> System.out.println("Invalid Value !");
        }

    }
}