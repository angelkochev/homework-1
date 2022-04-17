package data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class elementsOfDynamic2dMatrix {
    public static void main(String[] args) {
        List<int[]> values = new ArrayList<>();
        values.add(new int[] { 88, 66, 78 });
        values.add(new int[] { 28, 58, 96 });
        values.add(new int[] { 71, 98 });
        // print data of each row
        for (int[] eachRow : values) {
            System.out.println(Arrays.toString(eachRow));
        }
        // adding new row
        values.add(new int[] { 89, 47 });
        System.out.println("After adding a new row.");
        // print data of each row
        for (int[] eachRow : values) {
            System.out.println(Arrays.toString(eachRow));
        }
    }
}