package com.Logic.Day01;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        // user input 3 bilangan integer dari scanner, lalu hitung nilai rata - ratanya
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan 3 bilangan bebas : ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double average = (num1 + num2 + num3)/3;
        System.out.printf("hasilnya %.2f", average);

        scanner.close();


    }
}
