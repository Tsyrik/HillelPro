package Lesson003.Task001;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        subtask001();
        subtask002();
        subtask003();
        subtask004();
        subtask005();
        subtask006();
        subtask007();
        subtask008();
        subtask009();
        subtask010();
        subtask011();
        subtask012();
        subtask013();
    }

    private static void subtask001() {
        for (int i = 1; i < 100; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void subtask002() {
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    private static void subtask003() {
        int i = 1;
        while (i <= 99) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            ++i;
        }
    }

    private static void subtask004() {
        int n = 5;
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            ++i;
        }
        System.out.println(factorial);
    }

    private static void subtask005() {
        int i = 1;

        do {
            ++i;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } while (i < 99);
    }

    private static void subtask006() {
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

    private static void subtask007() {
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

    private static void subtask008() {
        int number = 0;
        int difference = -5;
        for (int i = 0; i < 10; i++) {
            System.out.print(number + " ");
            number += difference;
        }
        System.out.println("");
    }

    private static void subtask009() {
        System.out.print("Введіть число: ");
        int x = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + x + " = " + (i * x));
        }
    }

    private static void subtask010() {
        int[] arr = new int[10];
        int num = 1;
        for (int i = 0; i < 10; i++) {
            arr[i] = num;
            num += 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void subtask011() {
        int[] arr = {5, 2, 8, 1, 4};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    private static void subtask012() {
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

    private static void subtask013() {
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
