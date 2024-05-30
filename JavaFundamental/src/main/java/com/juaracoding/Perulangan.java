package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        // hasil = 1 - 9 karna 9 kurang dari 10
        for (int i = 0; i < 10; i++) {
            System.out.println("lap ke " + i);
        }
        System.out.println("-----1-----");
        // hasil = 9 - 1 ( dari Terbesar ke terkecil )
        for (int i = 9; i > 0; i--) {
            System.out.println("lap ke " + i);
        }
        System.out.println("-----2-----");
        // pengulagan Nilai Genap atau Ganjil
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 1) {
                System.out.println("Ganjil: " + i);
            } else {
                System.out.println("Genap: *" + i);
            }

            System.out.println("-----3-----");
            // pengulagan Nilai Genap atau Ganjil cara lain
            for (int j = 1; j < 10; j++) {
                // tanpa if
                System.out.println(j);
                j++;
            }
        }
        System.out.println("-----4-----");
        // 1*3*5*7*9
        for (int x = 1; x < 10; x++) {
            if (x % 2 != 0) { // 1 != 0
                System.out.println(x);
            } else {
                System.out.println("*");
            }
            //*****
            //*****
            //*****
            //*****
            //*****

            System.out.println("-----5-----");
            int sisi = 5;
            for (int i = 0; i < sisi; i++) {
                for (int j = 0; j < sisi; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("-----6-----");
            //*
            //**
            //***
            //****
            //*****
            for (int i = 0; i < sisi; i++) { // baris pertama
                for (int j = 0; j <= i; j++) { //
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("-----7-----");
            //*****
            //****
            //***
            //**
            //*
            for (int i = sisi; i > 0; i--) { // baris pertama 5-1 > 0
                for (int j = i; j > 0; j--) { // 5-1 >0
                    System.out.print("*");
                }
                System.out.println();
            }
            // Break and Continue
            // 12345 (Break if i == 6)
            // 12345 (Continue if i == 6)78910
            System.out.println("-----8-----");
            for (int i = 1; i <= 10; i++) {
                if (i == 6) {
                    break;
                }
                System.out.print(i);
            }
        }
        System.out.println("-----9-----");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.print(i);
        }
        int b = 1;
        while (b <= 10) {
            System.out.print(b);
            b++;
            if (b == 6) break;
        }
        int c = 1;
        while (c < 10) {
            c++;
            if (c == 6) continue;
            System.out.print(c);
        }
        System.out.println("-----10-----");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input Angka : ");
            int angka = scanner.nextInt();
            if (angka == 0) break;
        }
        while (true) {
            System.out.println("Username: ");
                String username = scanner.next();
            System.out.println("Password: ");
                String password = scanner.next();
                    boolean isLogin = username.equals("Daniel") && password.equals("Namasaya");
                    String result = isLogin ? "Login Berhasil" : "Invalid Login";
                    System.out.println(result);
                    if (isLogin) break;
        }
    }
}