package methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class smallestNumberAmongThreeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(3);
        myList.add(15);

        System.out.println("Smallest number among three numbers is: " + Collections.min(myList));

        // Second option with more numbers and an array
        int[] myList2 = {5, 12, 57, 2, 8, 34};
        Arrays.sort(myList2);

        System.out.println("Smallest number in an array with many numbers is: " + myList2[0]);

    }

}
