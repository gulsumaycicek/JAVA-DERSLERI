package day15_methotCreation;

import java.util.Scanner;

public class C02_MethotCreation {

    public static void main(String[] args) {

        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise hardf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bır kelıme gırınız");
        String kelıme = scanner.next();
        String tersKelıme = "";

        if (kelıme.length() < 3) {
            System.out.println("kelıme cok kısa");

        } else if (kelıme.length() <= 5) {
            if (kelıme.length() == 3) {
                tersKelıme = kelıme.substring(2) +
                        kelıme.substring(1, 2) +
                        kelıme.substring(0, 1);


            } else if (kelıme.length() == 4) {
                tersKelıme = kelıme.substring(2) +
                        kelıme.substring(3, 4) +
                        kelıme.substring(2, 3) +
                        kelıme.substring(1, 2) +
                        kelıme.substring(0, 1);
                System.out.println("kırdıgınız kelımedekı harf sayısı:" + kelıme.length());

            } else {
                tersKelıme = kelıme.substring(4) +
                        kelıme.substring(3, 4) +


                        kelıme.substring(2, 3) +
                        kelıme.substring(1, 2) +
                        kelıme.substring(0, 1);
            }
            System.out.println("girdiginiz kelimedeki harf sayisi : " + kelıme.length());
            System.out.println("kelimenin tersten yazilisi : " + tersKelıme);

        } else {
            System.out.println("kelime cok uzun");


        }

    }

}
