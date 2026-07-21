
public class Logical {

    public static void main(String[] args) {
        // Logical operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));


        int age = 18;
        boolean voterID = true;

        if(age >= 18 && voterID){
            System.out.println("Eligible for vote");
        }else {
            System.out.println("Not eligible");
        }

    }
}
