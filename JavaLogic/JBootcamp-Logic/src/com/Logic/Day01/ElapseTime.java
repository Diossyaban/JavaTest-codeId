package com.Logic.Day01;

import java.util.Scanner;

public class ElapseTime {
    public static void main(String[] args) {
        //konversi jumlah bilangan integer ke hari, jam, menit dan second
        //dimana inputran integer harus lebih dari 1.000.000
        //contoh : input 1.000.000, output => 11 hari 13 jam 46 menit dan 40 detik
        // tips : use / (pembagi) & %(sisa hasil bagi)

        Scanner scanner = new Scanner(System.in);
        //1. deklarasikan variable yang relevan
        int number,sisa;
        int hari, jam, menit,detik;
        //2. simpan imputan detik di variabel number
        System.out.print("masukan bilangan integer : ");
        number = scanner.nextInt();
        //3. hitung jumlah hari, 1 hari = 24jam, 1jam = 60menit, 1 menit = 60 detik, 1hari=24*3600 = 86.400s
        //simpan sisa hasil bagi di variable sisa
        hari = number/86400;
        sisa = number % 86400;

        //4. hitung jumlah jam, dihitung dari sisa hasil bagi step3 dibagi 3600
        jam = sisa/3600;
        sisa = sisa%3600;
        //5.hitung jumlah menit, dihitung dari sisa hasil bagi step4 dibagi 60
        menit = sisa/60;
    

        //6.hitung jumlah detik, dihitung dari sisa hasil bagi step5
        detik = sisa % 60;

        //7.display output
        System.out.println(hari +" Hari " + jam + " jam "+menit +" menit " + detik + "detik");
        //8. close scanner
        scanner.close();
    }
}
