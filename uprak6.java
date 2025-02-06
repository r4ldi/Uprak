package com.tugaspayudi.uprak;

import java.util.Scanner;

public class uprak6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Badan: ");
        int tb = scanner.nextInt();

        if (tb > 168 && tb < 220) {
            System.out.println("Tinggi Badan Ideal");
        } else if (tb < 168) {
            System.out.println("Tinggi Badan Tidak Ideal");
        } else if (tb > 220) {
            System.out.println("Anda tidak mungkin setinggi itu");
        } else {
            System.out.println("Inputan salah!");
        }
    }
}
