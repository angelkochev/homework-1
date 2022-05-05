package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideToZeroExeption {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = userInput.nextInt();
        System.out.println("Enter second number: ");
        b = userInput.nextInt();

        try {
            System.out.println("Result after dividing is: " + (a / b));
        } catch (Exception e) {
            System.out.println("Dividing by zero is not correct / allowed.");
        }
    }
}