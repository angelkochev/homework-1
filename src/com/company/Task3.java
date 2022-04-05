package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Submit the length of the base:");
        double base = Double.parseDouble(userInput.nextLine());

        System.out.println("Submit the length of the height:");
        double height = Double.parseDouble(userInput.nextLine());

        double area = (base * height) / 2;
        System.out.println("Area of triangle is " + area + " cm2.");
    }
}
