package operators;

import java.util.Scanner;

public class isEligibleToWork {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your age:");
        int userAge = userInput.nextInt();

        if (userAge  >= 16) {
            System.out.println("You are eligible to work.");
        } else {
           System.out.println("You are NOT eligible to work!");
        }

    }

}

