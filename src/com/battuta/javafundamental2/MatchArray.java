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
public class MatchArray {
    public static void main(String[] args) {
        // Array satu dimensi untuk nama tim
        String[] namaTim = {
            "Tim 1",
            "Tim 2",
            "Tim 3"
        };

        // Array dua dimensi untuk skor setiap pertandingan
        int[][] skor = {
            {10, 15},
            {12, 8},
            {9, 14}
        };

        // Menampilkan rekapitulasi secara manual
        System.out.println("=== Rekapitulasi Skor Turnamen ===");

        System.out.println("\nNama Tim: " + namaTim[0]);
        System.out.println("Match 1: " + skor[0][0]);
        System.out.println("Match 2: " + skor[0][1]);

        System.out.println("\nNama Tim: " + namaTim[1]);
        System.out.println("Match 1: " + skor[1][0]);
        System.out.println("Match 2: " + skor[1][1]);

        System.out.println("\nNama Tim: " + namaTim[2]);
        System.out.println("Match 1: " + skor[2][0]);
        System.out.println("Match 2: " + skor[2][1]);

        // Menghitung total skor Tim 1 pada indeks ke-0
        int totalSkor = skor[0][0] + skor[0][1];

        System.out.println("\nTotal skor Tim 1: " + totalSkor);
    }
}