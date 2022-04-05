package com.company;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter length of Side A:" );
        double sideA = Double.parseDouble(myObj.next());

        System.out.println("Enter length of Side B:" );
        double sideB = Double.parseDouble(myObj.next());

        System.out.println("Enter length of Side B:" );
        double sideC = Double.parseDouble(myObj.next());

        double sumABC = sideA + sideB + sideC;
        System.out.println("The surface is: " + sumABC );
    }
}