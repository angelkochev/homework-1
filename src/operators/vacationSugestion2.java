package operators;

import java.util.Scanner;

public class vacationSugestion2 {
    public static void main(String[] args){
        System.out.println("Please enter you preferred type of vacation: ");
        Scanner myScanner = new Scanner(System.in);
        String vacation = myScanner.nextLine();

        if (vacation == "Mountain"){
            System.out.println("You are going to the mountains.");
        } else {
            System.out.println("You are going to the seaside.");
        }

    }
}
