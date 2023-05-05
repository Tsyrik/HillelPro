package Lesson002.Task01;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        showResult(getAverage(getNumbers()));
    }

    private static ArrayList<Double> getNumbers() {
        ArrayList<Double> inputValues = new ArrayList<Double>();

        System.out.println("Please input first number:");
        inputValues.add(getDoubleFromScanner());
        System.out.println("Please input second number:");
        inputValues.add(getDoubleFromScanner());

        return inputValues;
    }

    private static double getDoubleFromScanner() {
        scan.useLocale(Locale.US);
        double res;
        while (true) {
            if (scan.hasNextDouble()) {
                res = scan.nextDouble();
                break;
            } else {
                System.out.println("ERROR VALUE! Please enter a number");
                scan.nextLine();
            }
        }
        return res;
    }

    private static double getAverage(ArrayList<Double> list) {
        return (list.get(0) +list.get(1))/ list.size();
    }

    private static void showResult(double result) {
        System.out.printf("Average of yours two numbers is: %f", result);
    }
}