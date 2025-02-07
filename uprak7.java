package com.tugaspayudi.uprak;

import java.util.Scanner;

public class uprak7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Harga Genteng: ");
        int genteng = scanner.nextInt();
        System.out.print("Masukkan Harga Pasir: ");
        int pasir = scanner.nextInt();
        System.out.print("Masukkan Harga Beton: ");
        int beton = scanner.nextInt();
        System.out.print("Masukkan Harga Batubata: ");
        int batubata = scanner.nextInt();

        var tbb = genteng + pasir + beton + batubata;
        if (tbb > 800000) {
            System.out.println("Kemahalan");
        } else if (tbb < 800000) {
            System.out.println("Harga Pas");
        }
    }
}
