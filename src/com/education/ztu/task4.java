package com.education.ztu;

import java.util.Scanner;

public class task4 {
    private static int calculate(int num1, int num2) {
        int g = 1;
        int min = Math.min(num1, num2);
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                g = i;
            }
        }
        return g;
    }
    public static int GCD() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter 2 nums: \n");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            return calculate(num1, num2);
        }
    }
}
