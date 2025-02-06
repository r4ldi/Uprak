package com.tugaspayudi.uprak;

import java.util.Scanner;

public class uprak4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Panjang: ");
        int p = scanner.nextInt();
        System.out.print("Masukkan Lebar: ");
        int l = scanner.nextInt();

        var hasil = p * l;
        System.out.println("Hasil: " + hasil);
    }
}
