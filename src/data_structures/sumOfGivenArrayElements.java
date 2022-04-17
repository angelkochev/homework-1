package data_structures;

import java.util.ArrayList;

public class sumOfGivenArrayElements {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(21);
        numbers.add(16);
        numbers.add(2);
        int sum = 0;

        for(int i=0; i < numbers.size(); i++){
            sum = sum + numbers.get(i);
        }
        System.out.println("Sum of all elements is: " +sum);
    }

}
