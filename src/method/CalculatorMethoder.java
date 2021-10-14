package method;

import java.util.Scanner;

public class CalculatorMethoder {
    static Scanner scanner = new Scanner(System.in);

    public static void multiplication() {
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

    }

    public static void multiply() {
        System.out.print("Enter Number: ");
        int x = scanner.nextInt();
        System.out.print("Enter Number: ");
        int y = scanner.nextInt();
        int result = x * y;
        System.out.println("Multiply " + x + " * " + y + " = " + result);
    }

    public static void division() {
        System.out.print("Enter Number: ");
        int x = scanner.nextInt();
        System.out.print("Enter Number: ");
        int y = scanner.nextInt();
        int result = x / y;
        System.out.println("Division " + x + " / " + y + " = " + result);


    }

    public static void addition(){
        System.out.print("Enter Number: ");
        int x = scanner.nextInt();
        System.out.print("Enter Number: ");
        int y = scanner.nextInt();
        int result = x + y;
        System.out.println("Addition " + x + " + " + y + " = " + result);

    }
   public static void subtraction(){
       System.out.print("Enter Number: ");
       int x = scanner.nextInt();
       System.out.print("Enter Number: ");
       int y = scanner.nextInt();
       int result = x - y;
       System.out.println("Subtraction " + x + " - " + y + " = " + result);
   }

   public static void remainder(){
       System.out.print("Enter Number: ");
       int x = scanner.nextInt();
       System.out.print("Enter Number: ");
       int y = scanner.nextInt();
       int result = x % y;
       System.out.println("Addition " + x + " % " + y + " = " + result);
   }

}
