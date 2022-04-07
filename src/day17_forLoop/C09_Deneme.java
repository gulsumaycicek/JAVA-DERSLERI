package day17_forLoop;

import java.util.Scanner;

public class C09_Deneme {
    public static void main(String[] args) {

        //Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
        // bir method olusturun.




        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz.");
        String kelime=scan.next();
        String ters= tersineCevirme(kelime);

        System.out.println(ters);

    }

    private static String tersineCevirme(String kelime) {
        String ters="";
        for (int i =kelime.length()-1; i >= 0; i--) {
            ters=ters+kelime.charAt(i);
        }
        return ters;
    }

    }

