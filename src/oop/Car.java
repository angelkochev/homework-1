package oop;

public class Car {

    String name;
    String color;
    int releaseYear;
    int horsePower;
    boolean secondHand;

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car(String name, String color, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.secondHand = secondHand;
        this.releaseYear = -1;
        this.horsePower = -1;
    }

    public Car(String name, String color, int releaseYear, int horsePower) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = false;
    }

    public Car(String name, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public Car() {
        this.name = "N/A";
        this.color = "N/A";
    }

    public static void main(String[] args) {
        Car myCar = new Car("Honda", "black", 1997, 92);
        System.out.println("My car is: " + myCar.name + " " + myCar.color + " " + myCar.releaseYear + " " + myCar.horsePower + " " + myCar.secondHand);

        Car myCar2 = new Car();
        System.out.println("My second car is: " + myCar2.name + " " + myCar2.color);
    }
}
