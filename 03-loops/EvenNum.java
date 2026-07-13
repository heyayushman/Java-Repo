import java.util.*;

class EvenNum {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }   
    }
}