package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = userInput.nextLine();

        System.out.println("Enter your second name:");
        String secondName = userInput.nextLine();

        System.out.println("Enter your third name:");
        String thirdName = userInput.nextLine();

        System.out.println("Your full name is "+ firstName + " " + secondName + " " + thirdName);

    }
}