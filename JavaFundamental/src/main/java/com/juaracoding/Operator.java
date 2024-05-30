package com.juaracoding;

public class Operator {
    public static void main(String[] args) {
        int modulus = 9 % 3; // sisa pembagian = 0, con: 5 % 2 = 1 (sisa 1 )
        System.out.println(modulus);

        int x = 2;
        int num1 = 10 * x++; //suffix
        System.out.println(num1);

        int y = 2;
        int num2 = 10 * ++y; // prefix
        System.out.println(num2);

        // operator assigment
        int a = 10;
        a += 5; // a = a + 5
        System.out.println(a);

        // operator pembandingan
        boolean hasil = 5 <= 6;
        System.out.println(hasil);

        int hasilBitwise = 10 | 12 ;
        System.out.println(hasilBitwise);

        boolean opLogika = true && false;
        System.out.println(opLogika);

    }
}
