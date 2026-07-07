import java.util.*; 


class FirstClass {
    public static void main(String args[]) {
        // String name = "John Doe";
        // int age = 25;
        // float height = 5.9f;
        // Character initial = 'J';
        // System.out.println("Hello, " + name + "! Welcome to Java programming.");
        // System.out.println("You are " + age + " years old.");
        // System.out.println("Your height is " + height + " feet.");
        // System.out.println("Your initial is " + initial + ".");
        

        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.println("*****");
        
        //* Print a star * and two star on next line

        // System.out.print("*\n");
        // System.out.print("**\n");

        // int a = 50;
        // int b = 5;

        // int sum = a + b;
        // System.out.println("Sum = " + sum);

        // int mul = a * b;
        // System.out.println("Product = " + mul);


        // float cal = (a * b) / (a - b);
        // System.out.println(cal);

        // name = "Tony Stark";

        // System.out.println(name);


        //? **********************************User Input ************************************
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();

        System.out.print(firstName);

        
        sc.close();
        
    }
}

//! Reading different data types

// Scanner sc = new Scanner(System.in);

// int age = sc.nextInt();        // Integer
// double salary = sc.nextDouble(); // Decimal number
// float marks = sc.nextFloat();    // Float
// char grade = sc.next().charAt(0); // Character
// String word = sc.next();          // Single word
// String line = sc.nextLine();      // Entire line

// sc.close();