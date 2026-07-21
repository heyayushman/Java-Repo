public class Unary{
    public static void main(String[] args){
        int a = 6, b = 5, result;
        result = 20/5*2;
        System.out.println("Post-increment : " + (a++));
        System.out.println("Pre-increment : " + (++a));

        System.out.println("Post-decrement : " + (b--));
        System.out.println("Pre-decrement : " + (--b));

        System.out.println(result);
    }
}