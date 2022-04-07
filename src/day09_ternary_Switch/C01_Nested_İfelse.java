package day09_ternary_Switch;

import java.util.Scanner;

public class C01_Nested_İfelse {
    public static void main(String[] args) {

        //  Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
       // bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
       // çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
             //   Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı tam bir sayı giriniz");
        int sayı= scanner.nextInt();
        if (sayı<1000 || sayı>9999){

            System.out.println("lutfen 4 basamaklı tam sayı giriniz");

        }else if (sayı%5==0){

        if (sayı%10==0){
            System.out.println("bese bolune bilen çift sayı");

        }else {
            System.out.println("bese bolüne bilen tek sayı");

        }
            }
        }
    }

