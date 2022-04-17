package data_structures;

import java.util.Collections;
import java.util.LinkedList;

public class reverseOrderOfElementsInLinkedListAlgorithm {
    public static void main(String[] args) {
        LinkedList<Integer> myElements = new LinkedList();
        myElements.add(1);
        myElements.add(2);
        myElements.add(3);
        myElements.add(4);
        myElements.add(5);

       Collections.reverse(myElements);
     /*  for(int i : myElements){
           for(i = 0; i < myElements.size(); i--);
       }
     */

        System.out.println("Reversed order of the LinkedList is: " + myElements);
    }

}
