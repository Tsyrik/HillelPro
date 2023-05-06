package Lesson003.Task001;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //subtask001();
        //subtask002();
        //subtask003();
        //subtask004();
        //subtask005();
        //subtask006();
        //subtask007();
        subtask008();
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
        int res = 1;
        for (int i = 1; i <= n; ++i) {
            res *= i;
        }
        System.out.println(res);
    }

    private static void subtask003() {
        int i = 1;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            ++i;
        }
    }

    private static void subtask004() {
        int n = 5;
        int res = 1;
        int i = 1;
        while (i <= n) {
            res *= i;
            ++i;
        }
        System.out.println(res);
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
        int res = 1;
        int i = 1;

        do {
            ++i;
            res *= i;
        }
        while (i < n);
        System.out.println(res);
    }

    private static void subtask007() {
        int x = 5;
        int n = 6;
        Math.pow(x,n);
    }

    private static void subtask008() {
        int x = scan.nextInt();
        System.out.printf("1*%s=%s\n",x, 1*x);
        System.out.printf("2*%s=%s\n",x, 2*x);
        System.out.printf("3*%s=%s\n",x, 3*x);
        System.out.printf("4*%s=%s\n",x, 4*x);
        System.out.printf("5*%s=%s\n",x, 5*x);
        System.out.printf("6*%s=%s\n",x, 6*x);
        System.out.printf("7*%s=%s\n",x, 7*x);
        System.out.printf("8*%s=%s\n",x, 8*x);
        System.out.printf("9*%s=%s\n",x, 9*x);
        System.out.printf("10*%s=%s\n",x, 10*x);
    }

}
