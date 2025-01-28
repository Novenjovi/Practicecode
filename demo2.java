//Task 1 : Add 2 numbers get the present from user
import java.util.*;
class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        scanner.close();
    }
}

//Task 2 : Add 3 numbers get the input from user
import java.util.*;
class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Third number: ");
        int num3 = scanner.nextInt();
        int Sum = num1 + num2 + num3;
        System.out.println("The total sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + Sum);
        scanner.close();
    }
}



