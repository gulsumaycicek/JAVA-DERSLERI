package day18_NestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan toplamak ıstedıgı sayıları alın
        //ve kullanıcı 0 basıncaya kadar devam edın
        //kullanıcı 0 a bastıgında
        //gırdıgı tum sayıların toplamını yazdırın


        Scanner scanner = new Scanner(System.in);
        int sayı = 0;
        int toplam = 0;
/*
        for (int i = 1; i <1000000 ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayi==0){
             break;
            } else {
                toplam+=sayi;
            }
        }
         */



        sayı=1;
        toplam=0;

        while (sayı!=0){
            System.out.println("sayı gırınız");
            sayı=scanner.nextInt();
            toplam+=sayı;
        }

        System.out.println(toplam);

        // baslangic,bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir
        // ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir



    }

    }

