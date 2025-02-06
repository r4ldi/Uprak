package com.tugaspayudi.uprak;

import java.util.Scanner;

public class uprak3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIS: ");
        String NIS = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String Nama = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String Alamat = scanner.nextLine();
        System.out.print("Masukkan Hobby: ");
        String Hobby = scanner.nextLine();

        System.out.println("NIS: " + NIS);
        System.out.println("Nama: " + Nama);
        System.out.println("Alamat: " + Alamat);
        System.out.println("Hobby: " + Hobby);
    }
}
