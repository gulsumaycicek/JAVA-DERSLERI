package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        //kullanıcının ismini ve soyismini alıp aralarında bir boşluk oluşturarak aşagidaki sekılde yazdırın
        //isim- soyisim:

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜTFEN İSMİNİZİ YAZIN");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("isim_ soyisim:" +isim+" " + soyisim);

    }
}
