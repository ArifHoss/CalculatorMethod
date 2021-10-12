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

}
