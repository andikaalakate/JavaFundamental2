/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.battuta.javafundamental2;

/**
 *
 * @author kurokidaizaya
 * Nama     : Andika Pratama
 * NIM      : 110225013
 * Prodi    : Sistem Informasi
 * Semester : 3
 * Kelas    : Pagi
 * Matkul   : Pemrograman Berbasis Objek (PBO)
 */
import java.util.Scanner;

public class PembalikKalimat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();

        // Analisis kalimat
        System.out.println("\n=== Analisis Kalimat ===");
        System.out.println("Jumlah karakter: " + kalimat.length());
        System.out.println("Karakter tanpa spasi: "
                + kalimat.replaceAll(" ", "").length());

        if (!kalimat.isEmpty()) {
            System.out.println("Karakter pertama: " + kalimat.charAt(0));
            System.out.println("Karakter terakhir: "
                    + kalimat.charAt(kalimat.length() - 1));
        } else {
            System.out.println("Kalimat masih kosong.");
        }

        // Membalikkan kalimat dan mengubahnya menjadi huruf kapital
        String hasil = new StringBuilder(kalimat)
                .reverse()
                .toString()
                .toUpperCase();

        System.out.println("Kalimat terbalik: " + hasil);

        scanner.close();
    }
}