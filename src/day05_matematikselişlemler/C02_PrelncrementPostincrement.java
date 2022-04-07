package day05_matematikselişlemler;

import day04_dataCasting_Increrment.C02_Auto_Wedening;

public class C02_PrelncrementPostincrement {
    public static void main(String[] args) {

     int sayı1=10;

     int sayı2=20;

     int sayı3=30;


     sayı2=sayı1++;

        System.out.println(sayı1+","+sayı2+","+sayı3);

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        sayi2= sayi1++;
        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);
        sayi3=++sayi1;
        System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);
        System.out.println(sayi3++);


        System.out.println(--sayi2);







    }
}
