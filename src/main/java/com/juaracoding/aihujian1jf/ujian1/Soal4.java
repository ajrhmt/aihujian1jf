package com.juaracoding.aihujian1jf;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author ajirohimat aih a.k.a Aji Rohimat
Java Developer
Created on 03/04/24 14.46
@Last Modified 03/04/24 14.46
Version 1.0
*/

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        //Program input angka bebas, jika 0 keluar dari program
        Scanner zinput = new Scanner(System.in);

        while (true) {
            System.out.print("Masukan angka: ");
            int masukan_angka = input.nextInt();
            if (masukan_angka ==0) {
                System.out.print("Jika 0 maka keluar dari program");
                break;
            }
            System.out.println("Angka yang kamu input adalah: " + masukan_angka);
        }
    }
}
