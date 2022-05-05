package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {

    final String name;
    final String sex;
    final String religion;
    final String language;
    String job;
    final String nationality;
    final String EGN;
    final String dateOfBirth;
    final String age;
    String country;

    public Person(String name, String sex, String religion, String language, String job, String nationality, String dateOfBirth, String age, String country) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.EGN = addEGN();
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.country = country;
    }

    public String addEGN(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your EGN: ");
        String input = userInput.nextLine();
        if(input.chars().count() != 10){
          throw new InputMismatchException(input.chars().count() + " digits means invalid EGN. Your EGN must be a 10 digits number.");
        }
        return input;
    }

    public static void main(String[] args) {
        Person person = new Person("Angel", "male", "Devil's voice", "Bulgarian", "QA", "Bg", "15.07.1984", "37", "Bulgaria");
    }
}
