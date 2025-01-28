//Task 1 : Print Hello World
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//Task 2 : Add 2 numbers randomly
import java.util.*;
class randomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;
        int sum = num1 + num2;
        System.out.println("Numbers are: " + num1 + " and " + num2);
        System.out.println("Sum: " + sum);
    }
}

