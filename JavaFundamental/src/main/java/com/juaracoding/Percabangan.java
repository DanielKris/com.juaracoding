package com.juaracoding;

import java.util.Locale;

public class Percabangan {
    public static void main(String[] args) {

        // Sting metod
        if (true){
            System.out.println("Statment IF");
        }else{
            System.out.println("Statment Else");
        }

        // Ganjil / Genap
        int angka = 6;
        if (angka %2==1){
            System.out.println("Ganjil");
        }else {
            System.out.println("Genap");
        }
        // Implementasi Login
        String username = "Daniel";
        String Password = "NamaSaya";
        String chUsername = username.toLowerCase();
        String chPassword = "daniel", validPassword = "namasaya";
        
            if(username.isEmpty() && Password.isEmpty()) {
                System.out.println(" Username dan Password Kosong");
                {
                    if (username.equals(username) && Password.equals(Password)) {
                        System.out.println("Login Berhasil");
                    } else {
                        System.out.println(" Username dan Password salah");
                    }

                    double salary = 1000;
                    char gender = 'L';
                    String status = "BM";
                    if (salary >= 1000) {
                        System.out.println("Wajib pajak (pph21)");
                        if (gender == 'L') {
                            System.out.println("Laki - Laki");
                            if (status == "BM") ;
                            System.out.println("Rumus pajak 10%");
                            System.out.println(salary * 10 / 100);
                        } else {
                            System.out.println("Rumus pajak Menikah 6%");
                            System.out.println(salary * 6 / 100);
                    }
                }
            }
        }
    }
}
