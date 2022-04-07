package day17_forLoop;

import java.util.Scanner;

public class c14_Deneme {



        /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13       */
    // public static void main(String[] args) {
    //     int sum=0;
    //     for(int i=100; i>0; i--){
    //         if(i%13==0){
    //             System.out.println(i);
    //             sum=sum+i;
    //         }
    //     }
    //     System.out.println("0 - 100 arasında 13 ile bölünebilen sayıların toplamı : "+sum);


    public static void main(String[] args) {

        /*

               A
              BBB
             CCCCC
            DDDDDDD
           EEEEEEEEE
         */

        int n = 6;
        for (int i = 1, p = 'A'; i < n; i++, p++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p);
            }
            for (int j = 1; j < i; j++) {
                System.out.print((char) p);
            }
            System.out.println();
        }
    }
}





