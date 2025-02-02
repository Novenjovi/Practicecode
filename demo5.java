//Task 1: Number divisible by 100
import java.util.Scanner;
class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num % 100 == 0) 
            System.out.println("Yes, it is divisible by 100");
        else
            System.out.println("No, it is not divisible by 100");
    }
}

//Task 2: Number divisible by 27
import java.util.Scanner;
public class Divisibly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num % 27 == 0) 
            System.out.println("Yes, it is divisible by 27");
        else 
            System.out.println("No, it is not divisible by 27");
    }
}
