package day07_ifElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_Haftaiçi_Haftasonu {
    public static void main(String[] args) {

      //  Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       // Ornek:  gun=Pazar output = “Hafta sonu”
       // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen birgün ismi yazınız");
        String günismi= scanner.next().toLowerCase();

        if (günismi.equals("pazar") ||günismi.equals("cumartesi")){
            System.out.println("girdiğiniz gün haftasono");
        }


        if (günismi.equals("pazartesi") || günismi.equals("salı")|| günismi.equals("carsamba") ||
         günismi.equals("persembe")  || günismi.equals("cuma")){

            System.out.println("girdiğiniz gün haftaiçi");
        }
    }
}
