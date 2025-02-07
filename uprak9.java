package com.tugaspayudi.uprak;

import java.util.Scanner;

public class uprak9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka 1: ");
        int a1 = scanner.nextInt();
        System.out.print("Masukkan Angka 2: ");
        int a2 = scanner.nextInt();
        System.out.print("Pilih Operator(+,-,*,/): ");
        String op = scanner.next();

        switch (op) {
            case "+":
                System.out.println("Hasil: " + (a1 + a2));
                break;
            case "-":
                System.out.println("Hasil: " + (a1 - a2));
                break;
            case "*":
                System.out.println("Hasil: " + (a1 * a2));
                break;
            case "/":
                System.out.println("Hasil: " + (a1 / a2));
                break;
        }
    }
}
