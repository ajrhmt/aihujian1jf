package com.juaracoding.aihujian1jf;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author ajirohimat aih a.k.a Aji Rohimat
Java Developer
Created on 03/04/24 12.24
@Last Modified 03/04/24 12.24
Version 1.0
*/

import java.util.Scanner;

public class Soal2 {
    //Soal2 program String
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        //Input kalimat
        System.out.print("Input Kalimat: ");
        String kalimat = Input.nextLine();

        //Result kalimat
        int JumlahKata = kalimat.length();
        String HurufKapital = kalimat.toUpperCase();
        String HurufKecil = kalimat.toLowerCase();
        String TigaHurufAkhir = kalimat.substring(JumlahKata - 3);

        //Menampilkan hasil
        System.out.println("jumlah kata: " + JumlahKata);
        System.out.println("HurufKapital " + HurufKapital);
        System.out.println("HurufKecil " + HurufKecil);
        System.out.println("TigaHurufAkhir " + TigaHurufAkhir);
    }
}
