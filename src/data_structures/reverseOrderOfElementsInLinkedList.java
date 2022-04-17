package data_structures;

import java.util.Collections;
import java.util.LinkedList;

public class reverseOrderOfElementsInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> myElements = new LinkedList();
        myElements.add(1);
        myElements.add(2);
        myElements.add(3);
        myElements.add(4);

        Collections.reverse(myElements);
        System.out.println("Reversed order of the LinkedList is: " + myElements);
    }

}
