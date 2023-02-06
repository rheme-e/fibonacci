package Giris;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Değer Giriniz:");
        int n = inp.nextInt();
        int i = 1, sayi1 = 1, sayi2 = 0, sonuc = 0;
        while (i < n) {
            sonuc = sayi1 + sayi2;
            sayi2 = sayi1;
            sayi1 = sonuc;
            i++;
            System.out.print(sonuc + ",");
        }

    }
}
