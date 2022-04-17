package data_structures;

import java.util.ArrayList;
import java.util.Collections;

public class findBiggestElementOfAnArray {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(56);
        numbers.add(12);
        numbers.add(48);

        System.out.println(Collections.max(numbers));
    }
}
