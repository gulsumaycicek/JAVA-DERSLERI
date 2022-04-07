package day08_ifelseifStatement;

import java.util.Scanner;

public class C04_Emeklili {
    public static void main(String[] args) {


        //  Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen cinseyetibizi yazzınız+" +
                "\nKadın için K \nErkrk için E harfini giriniz");
        char cinsiyet = scanner.next().toLowerCase().charAt(0);

        System.out.println("lütfen yasinizi giriniz");
        double yaş = scanner.nextDouble();

        if (yaş < 0 || yaş > 120) {
            System.out.println("lütfen girdiğiniz yas degerını kontrol ediniz");
        } else if (yaş < 60) ;
        {

            System.out.println("emekli olamazsın \n Daha" + (60 - yaş) + "yıl çalışman lazım");


        }
        if (yaş < 0 || yaş > 120) {
            System.out.println("lutfen girdiginiz yas degerini kontrol edin");
        } else if (yaş < 65) {
            System.out.println("emekli olamazsin \nDaha " + (65 - yaş) + " yil calisman gerekir");
        } else {
            System.out.println("emekli olabilirsin");
        }



    }
}












