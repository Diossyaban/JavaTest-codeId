package com.Logic.Day01;

public class ComputeCircleArea {
    public static void main(String[] args) {
        //kasus hitung luas area lingkaran, dimana rumus luas lingkaran = radius^2 * pi
        //pi= 3.14159

        //1. declare variable radius & Area
        double radius=10,area;
        final double pi = 3.14159;
        //2. hitung luas lingkaran dan simpan hasilnya di variable area
        area = radius * radius * pi;
        //display area
        System.out.println("Luas lingkaran " + area);
    }
}
