package day14_stringManipulation;

import java.util.Scanner;

public class C08_Deneme {
    public static void main(String[] args) {

        		/* GÖREV:
 Kullanicidan e-posta girişi çakın
 @ isareti icer "gecerli bir e-posta girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
 @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabı girinini" yazdirin
       ORNEK:
 Gİrİş : techproed.com ÇIKIŞI : "gecerli bir e-posta girin "
 Gİrİş : techproed@hotmail.com ÇIKIŞI : "Lutfen gmail hesabınizi girin"
       */




        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir mail adresi giriniz.");
        String mail=scan.next();

        if (!mail.contains("@")){
            System.out.println("Geçerli bir mail adresi giriniz.");
        }else if (!mail.endsWith("@gmail.com")){
            System.out.println("Lütfen gmail adresi giriniz.");
        }else if (mail.endsWith("@gmail.com")){
            System.out.println("Mailiniz onaylandı");
        }else {
            System.out.println("Lütfen geçerli mail giriniz.");
        }
        }
    }

