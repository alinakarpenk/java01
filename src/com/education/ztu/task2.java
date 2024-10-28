package com.education.ztu;

import java.util.Scanner;

public class task2 {
    public static void readConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 2 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum:" + (a + b));
        scanner.close();
    }
//    public static void main(String[] args) {
//        readConsole();
//    }
}
