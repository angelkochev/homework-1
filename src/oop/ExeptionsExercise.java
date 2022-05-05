package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExeptionsExercise {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E://myfile.txt");
        FileReader fr = new FileReader(file);
        System.out.println(file);
    }
}
