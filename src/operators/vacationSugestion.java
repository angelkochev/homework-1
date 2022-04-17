package operators;

import java.util.Scanner;

public class vacationSugestion {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter you preferred type of vacation: ");

        String preferredVacation = String.valueOf(userInput); //= userInput.toString();

        switch (preferredVacation) {

            case "Mountain":
                System.out.println("You chose Mountain.");
                break;

            case "Beach" :
                System.out.println("You chose Beach.");
                break;

            default:
                System.out.println("There is no information for this type of vacation.");
        }

    }
}