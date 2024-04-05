package com.juaracoding.aihujian1jf;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author ajirohimat aih a.k.a Aji Rohimat
Java Developer
Created on 03/04/24 12.50
@Last Modified 03/04/24 12.50
Version 1.0
*/

import java.util.Scanner;

public class Soal3 {
    //Program pemesanan tiket
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        //Input hari dan jumlah
        System.out.print("Pilih hari: ");
        int hari = Input.nextInt();
        System.out.print("jumlah: ");
        int jumlah = Input.nextInt();

        //Output qty, harga satuan, dan total bayar
        System.out.println("qty: " + jumlah);
        int PilihHari = 0;
        if (hari == 0) {
            PilihHari = 30000; // Weekday
            System.out.println("Harga Satuan:Rp. " + PilihHari);
        } else if (hari == 1) {
            PilihHari = 45000;// Weekend
            System.out.println("Harga Satuan:Rp. " + PilihHari);
        } else {
            System.out.print("hari yang dapat dipilih [0] weekday, [1] weekend");
            System.exit(0);
        }

        //menghitung total bayar
        double TotalBayar = jumlah * PilihHari;

        //Menampilkan hasil
        System.out.println("Total Bayar " + TotalBayar);
    }
}
