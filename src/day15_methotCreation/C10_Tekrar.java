package day15_methotCreation;

import java.util.Locale;
import java.util.Scanner;

public class C10_Tekrar {
    public static void main(String[] args) {

        		/*
 name1 ve name2 degiskenlerini oluştur.
 name1 değişkeninin karakter sayısı cift ise kelimenin ortasina name2 yi yerlestirin.
 name1 değişken karakter sayısı tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir yöntemiyle başıboş
 örneğin:
 ad1= mehmet
 ad2= ahmet
 Yazdır ==> mehahmetmet

        		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bır ısım gırınız");
        String ısım1 = scanner.nextLine().toLowerCase();

        System.out.println("lutfen ıkıncı ısmı gırınız");
        String ısım2 = scanner.nextLine().toLowerCase();
        ısımbırlestır(ısım1, ısım2);


    }

    private static void ısımbırlestır(String ısım1, String ısım2) {
        if (ısım1.length() % 2 == 0) {
            System.out.println(ısım1.substring(0, (ısım1.length() / 2)).concat(ısım2).concat(ısım1.substring(ısım1.length() / 2)));
        } else {
            System.out.println("ısım1 çift sayılı olmadıgı ıçın yerlestıtemedık");
        }
        if (ısım2.length() % 2 == 1) {
            //  System.out.println(ısım2.substring(0, (ısım2. length() / 2)). concat(ısım1). concat(ısım2.substring(ısım2. length() / 2)));

            // }else System.out.println();
        }
    }
}