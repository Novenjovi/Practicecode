//Task 1 : Compare 2 random numbers 
import java.util.*;
class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();
      
        if (num1 > num2) 
        {
            System.out.println("Bigger number is " + num1);
        } 
        else if (num2 > num1) 
        {
            System.out.println("Bigger number is " + num2);
        } 
        else {
            System.out.println("Numbers are equal");
        }
        scanner.close();
    }
}

//Task 2 : Comparision  Operations 
import java.util.Scanner;
class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " < " + num2 + "  is " + (num1 < num2));
        System.out.println(num1 + " <= " + num2 + " is " + (num1 <= num2));
        System.out.println(num1 + " > " + num2 + "  is " + (num1 > num2));
        System.out.println(num1 + " >= " + num2 + " is " + (num1 >= num2));
        System.out.println(num1 + " == " + num2 + " is " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " is " + (num1 != num2));
        scanner.close();
    }
}
