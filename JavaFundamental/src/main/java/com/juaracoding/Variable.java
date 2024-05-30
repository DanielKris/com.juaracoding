package com.juaracoding;

public class Variable {
    public static void main(String[] args) {
        System.out.print("Tolong dibantu ya");
        System.out.print("Nanti jadi apa");
        // cara 1
        //int id = 1;

        // cara ke 2
        // int id;
        // id = 1;

        // 2 pangkat 7 = 2x2x2x2x2x2x2 = 128 - 1 = 127
        // 8 bit // bit != byte // 8 bit == 1 byte
        // 100 Mbps = 12.5 MBps // file 25 MB = 2 detik download
        // biner = 0 dan 1 // 127 = 01111111
        // 1001 (biner) = 9 (desimal)

        byte sizeCart = 100;

        float nilai = 88.90f;

        double transfer = 1000.504;
        System.out.println(transfer);
        System.out.println(transfer);
        System.out.printf("%.2f %.2f\n", transfer, nilai);
        System.out.printf("%.2f %.2f", transfer, nilai);

        char predikat = 'A';
        System.out.println(predikat);

        //string path = "\"D:\Galery\Architecture & Design\pipa-2.jpg\"";
        // System.out.println(path);

        // Tipe data primitif dan non primitif (tipe data objek)
        //boolean isLogin = true;
        //System.out.println(isLogin);

        String nama = "Daniel";
        int noTlp = 123456789;
        byte umur = 27;
        float tinggi = 170;
        String alamat = "GBA 1 BLOK B";
        System.out.println("Nama : " + nama);
        System.out.println("No Hp : " + noTlp);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Alamat: " + alamat);


        // Automatic casting / implicit
        short data1 = 457;
        double doubleData = data1;
        System.out.println(doubleData);

        char data2 = 'W';
        long dataLong = data2;
        System.out.println(dataLong);

        // manual casting / explicit
        long data3 = 9223372036854775000l;
        int dataInt = (int) data3;
        System.out.println(dataInt);
        }
    }


