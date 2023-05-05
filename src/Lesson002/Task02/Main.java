package Lesson002.Task02;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        showResult(getAverage(getNumbers()));
    }

    private static ArrayList<Double> getNumbers() {
        return getDoubleFromScanner();
    }

    private static ArrayList<Double> getDoubleFromScanner() {
        scan.useLocale(Locale.US);
        ArrayList<Double> res = new ArrayList<Double>();

        System.out.println("Please input number to add it to calculations or press enter to calculate:");
        while (true) {
            if (scan.hasNextDouble()) {
                res.add(scan.nextDouble());
                scan.nextLine();
            } else {
                System.out.println("ERROR VALUE! Please enter a number");
                scan.nextLine();
                continue;
            }
            System.out.println("Add more numbers? Y/N");
            if (scan.hasNext("Y")) {
                scan.nextLine();
            } else if (scan.hasNext("N")) {
                break;
            }
        }
        return res;
}

    private static double getAverage(ArrayList<Double> list) {
        double sum = 0;
        for (double element : list) {
            sum += element;
        }
        return (sum) / list.size();
    }

    private static void showResult(double result) {
        System.out.printf("Average of yours two numbers is: %f", result);
    }
}