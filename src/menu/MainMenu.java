package menu;

import java.util.Scanner;

import static method.CalculatorMethoder.*;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("1. Multiplication");
        System.out.println("2. Multiply");
        System.out.println("3. Division");
        System.out.println("4. Addition");
        System.out.println("********************************");
        System.out.print("Please Make A Choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                multiplication();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Wrong choice! Please choose from menu.");
        }


    }
}
