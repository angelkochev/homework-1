package data_structures;

public class elementsOf2dMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        arr[3][0] = 10;
        arr[3][1] = 11;
        arr[3][2] = 12;

        System.out.println("These are all elements of the given matrix: ");

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
