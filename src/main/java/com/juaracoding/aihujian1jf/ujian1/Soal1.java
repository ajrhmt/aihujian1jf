package com.juaracoding.aihujian1jf;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author ajirohimat aih a.k.a Aji Rohimat
Java Developer
Created on 03/04/24 11.36
@Last Modified 03/04/24 11.36
Version 1.0
*/

import java.util.Scanner;

public class Soal1 {
    //Soal1 Variable Input dan Output
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        //Input jumlah (qty) dari pengguna
        System.out.print("Masukan input jumlah (qty): ");
        int qty = Input.nextInt();

        // Input harga peritem
        System.out.print("Masukan harga peritem: ");
        double harga = Input.nextDouble();

        //Menghitung jumlah
        double jumlah = qty * harga;

        //Mencetak hasil
        System.out.println("qty: " + qty);
        System.out.println("harga:" + harga);
        System.out.println("jumlah" + jumlah);

    }
}
