package operators;

public class printLargestNumber {
    public static void main(String[] args){
        int[] array = new int[] { 0, 1, 1, 2, 3, 1654, 5, 8, 13, 21, 34, 1000, 666, 42};
        int maxNumber = array[0];
        for (int i = 0; i< array.length; i++){
            if(array[i] > maxNumber)
                maxNumber = array[i];
        }
        System.out.println("Largest number in the array is: " + maxNumber);
    }
}
