package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    public static void main(String[] args) {


        // Kullanicidan istedigi kadar sayiyi alip toplayan bir program yaziniz
        // toplam 500'u gecerse programi bitirsin veya
        // kullanici bitirmek istediginde Q'ya basmalidir


        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        do {
            System.out.println("Lutfen toplamak istediginiz sayiyi giriniz \n bitirmek icin Q'ya basiniz");
            int sayi = 0;
            try {
                sayi = scan.nextInt();

                toplam += sayi;
            } catch (InputMismatchException e) {

                String hatalıGiris=scan.next();
                if (hatalıGiris.equalsIgnoreCase("q")){
                    System.out.println("girdiginiz sayıların toplamı:"+toplam);
                 break;
                }else {
                    System.out.println("hatalı sayı girdiniz");
                }

            }



        } while (toplam < 500);
    }
}
