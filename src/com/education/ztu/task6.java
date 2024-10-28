package com.education.ztu;

import java.util.Scanner;

public class task6 {
    public int[] calcul(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
    public static void Fib() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the n: ");
            int n = sc.nextInt();

            task6 task = new task6();
            int[] fibArray = task.calcul(n);
            int[] reversedFibArray = reverse(fibArray);
            System.out.println("Масив фібоначі:");
            print(fibArray);
            System.out.println("Перевернутий масив фібоначі:");
            print(reversedFibArray);
        }
    }


}
