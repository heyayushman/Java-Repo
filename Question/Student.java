

import java.util.Scanner;

public class Student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter student registration number: ");
        int usn = sc.nextInt();
        
        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        System.out.print("Enter student course: ");
        String course = sc.next();

        System.out.println("Student Details");

        System.out.println("Student Name: " + name);
        System.out.println("Student Reg No: " + usn);
        System.out.println("Student Age: " + age);
        System.out.println("Student Course: " + course);


    }
}