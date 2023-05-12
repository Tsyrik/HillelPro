package lesson003;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task 1:");
        printFrom1to99WithFor();

        System.out.println("Task 2:");
        findFactorialWithFor();

        System.out.println("Task 3:");
        printFrom1to99WithWhile();

        System.out.println("Task 4:");
        findFactorialWithWhile();

        System.out.println("Task 5:");
        printFrom1to99WithDoWhile();

        System.out.println("Task 6:");
        findFactorialWithDoWhile();

        System.out.println("Task 7:");
        findXPowN();

        System.out.println("Task 8:");
        printSequence();

        System.out.println("Task 9:");
        multiplicationTable();

        System.out.println("Task 10:");
        oddNumbers();

        System.out.println("Task 11:");
        findMinInArray();

        System.out.println("Task 12:");
        findMaxInArray();

        System.out.println("Task 13:");
        switchMaxAndMinInArray();
    }

    private static void printFrom1to99WithFor() {
        for (int i = 1; i < 100; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void findFactorialWithFor() {
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    private static void printFrom1to99WithWhile() {
        int i = 1;
        while (i <= 99) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            ++i;
        }
    }

    private static void findFactorialWithWhile() {
        int n = 5;
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            ++i;
        }
        System.out.println(factorial);
    }

    private static void printFrom1to99WithDoWhile() {
        int i = 1;

        do {
            ++i;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } while (i < 99);
    }

    private static void findFactorialWithDoWhile() {
        int n = 5;
        int factorial = 1;
        int i = 1;

        do {
            ++i;
            factorial *= i;
        }
        while (i < n);
        System.out.println(factorial);
    }

    private static void findXPowN() {
        int x = 2;
        int n = 5;
        System.out.println(x + "^" + n + " = " + Math.pow(x,n));

        x = 2;
        n = 5;
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println(x + "^" + n + " = " + result);
    }

    private static void printSequence() {
        int number = 0;
        int difference = -5;
        for (int i = 0; i < 10; i++) {
            System.out.print(number + " ");
            number += difference;
        }
        System.out.println("");
    }

    private static void multiplicationTable() {
        System.out.print("Введіть число: ");
        int x = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + x + " = " + (i * x));
        }
    }

    private static void oddNumbers() {
        int[] arr = new int[10];
        int num = 1;
        for (int i = 0; i < 10; i++) {
            arr[i] = num;
            num += 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void findMinInArray() {
        int[] arr = {5, 2, 8, 1, 4};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    private static void findMaxInArray() {
        int[] arr = new int[10];
        int num = 1;
        for (int i = 0; i < 10; i++) {
            arr[i] = num;
            num += 2;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    private static void switchMaxAndMinInArray() {
        int[] arr = {4, -5, 0, 6, 8};
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            } else if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
        System.out.println(Arrays.toString(arr));
    }

}
