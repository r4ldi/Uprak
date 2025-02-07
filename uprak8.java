package com.tugaspayudi.uprak;

import java.util.Scanner;

public class uprak8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Warna: ");
        String warna = scanner.next();

        switch (warna) {
            case "merah" :
                System.out.println("Bahaya");
                break;
            case "kuning" :
                System.out.println("Darurat");
                break;
            case "hijau" :
                System.out.println("Aman");
                break;
            default:
                System.out.println("Salah Warna!");
        }
    }
}
