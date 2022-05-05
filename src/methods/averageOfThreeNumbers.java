package methods;

public class averageOfThreeNumbers {

    static double a = 2;
    static double b = 8;
    static double c = 10;

    public static void main(String[] args) {
        System.out.println("The average of these three numbers is: " + avgNum(a, b, c));
    }

    public static double avgNum(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
