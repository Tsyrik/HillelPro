package lesson002.task03;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Double> depositData = new ArrayList<Double>();
    private static double percentage;
    private static int durationInYears;


    public static void main(String[] args) {

        if (args.length == 3) {
            parceDataFromArgs(args);
            calculateDeposit();
            displayDepositResult(getAnnualSum());
        } else {
            System.out.println("Please check startup arguments");
        }

    }

    public static void parceDataFromArgs(String[] arguments) {
        depositData.add(Double.parseDouble(arguments[0]));
        percentage = Double.parseDouble(arguments[1]);
        durationInYears = Integer.parseInt(arguments[2]);
    }

    public static void calculateDeposit() {

        double monthlyInterestRate = (percentage / 12.0)/100;
        int numMonths = durationInYears * 12;

        for (int i = 0; i < numMonths; i++) {
            double interest = depositData.get(i) * monthlyInterestRate;
            depositData.add(depositData.get(i) + interest);
        }
    }

    public static ArrayList<Double> getAnnualSum() {
        ArrayList<Double> sum = new ArrayList<Double>();
        for (int i = 0; i < depositData.size(); i++) {
            if (i % 12 == 0) {
                sum.add(depositData.get(i));
            }

        }
        return sum;
    }

    public static void displayDepositResult(ArrayList<Double> data) {
        for (int i = 1; i < data.size(); i++) {
            System.out.printf("Total for %d the year  %.2f UAH %n", i, data.get(i));
            System.out.printf("Accrued interest per %d year %.2f UAH %n", i, data.get(i) - data.get(i - 1));
        }
    }
}