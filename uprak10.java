package com.tugaspayudi.uprak;

import java.util.Scanner;

public class uprak10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Umur: ");
        int umur = scanner.nextInt();

        if (umur >= 17 && umur < 96) {
            System.out.println("Bisa membuat usia");
        } else if (umur < 16) {
            System.out.println("Belum bisa dapat SIM");
        } else {
            System.out.println("Salah input usia!");
        }
    }
}
