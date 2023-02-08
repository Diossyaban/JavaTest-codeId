package com.Logic.Day01;

import java.util.Scanner;

public class ComputeCircleAreaScan {
    public static void main(String[] args) {

        final double pi = 3.14159;
        //1. declare scanner object
        Scanner scanner = new Scanner(System.in);
        //2. define user input
        System.out.print("Enter radius : ");
        double radius = scanner.nextDouble();
        //3. hitung luas lingkaran
        double area = radius * radius * pi;
        //4. display luas lingkaran
        System.out.printf("Luas lingkaran dari radius %.0f = %.2f ", radius, area);

        scanner.close();

    }
}
