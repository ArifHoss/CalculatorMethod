package menu;

import java.util.Scanner;

import static method.CalculatorMethoder.*;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println("********************************");
            System.out.println("1. Multiplication");
            System.out.println("2. Multiply");
            System.out.println("3. Division");
            System.out.println("4. Addition");
            System.out.println("5. Subtraction");
            System.out.println("6. Remainder");
            System.out.println("0. Exit");
            System.out.println("********************************");
            System.out.print("Please Make A Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    repeat = false;
                    break;

                case 1:
                    multiplication();
                    break;

                case 2:
                    multiply();
                    break;

                case 3:
                    division();
                    break;

                case 4:
                    addition();
                    break;

                case 5:
                    subtraction();
                    break;

                case 6:
                    remainder();
                    break;

                default:
                    System.out.println("Wrong choice! Please choose from menu.");
            }
        }


    }
}
