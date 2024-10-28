package com.education.ztu;

import java.util.Scanner;

public class task5 {
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 0) {
            System.out.println("Error");
        } else {
            int sum = 0;
            while (a != 0) {
                sum += a % 10;
                a = a / 10;
            }
            System.out.println(sum);
            sc.close();
        }
    }

}
