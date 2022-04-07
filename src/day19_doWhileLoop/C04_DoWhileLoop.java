package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        //Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        // ve “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi girdigini
        // ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.


        Scanner scanner = new Scanner(System.in);
        int sayı = 0;
        int toplam = 0;
        int sayacPozıtıf=0;
        int sayacNegatıf=0;


        do {
            System.out.println("pozıtıf tam bır sayı gırın\nbıtırmek ıcın 0 basın");
            sayı = scanner.nextInt();
            if (sayı < 0) {
                System.out.println("Negatif sayi giremezsiniz");
                sayacNegatıf++;
            } else if (sayı > 0) {
                toplam += sayı;
                sayacPozıtıf++;

            }
        } while (sayı != 0) ;
        System.out.println("yanlıslıkla gırılen negatıf sayı adetı:"+sayacNegatıf);
        System.out.println("gırılen pozıtıf sayı adetı:"+sayacPozıtıf);

        System.out.println("gırılen pozıtıf sayıların toplamı:"+toplam);

        }
    }

