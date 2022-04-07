package day17_forLoop;

import java.util.Scanner;

public class C12_Deneme {
    public static void main(String[] args) {

        //Kullanıcıdan bir String isteyin ve Stringi tersine çeviren bir method yazdırın


        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bır kelıme gırınız");
        String kelıme= scanner.next();
        String ters=tersıneCevırme(kelıme);

        System.out.println(ters);


    }

    private static String tersıneCevırme(String kelıme) {

        String ters=" ";
        for (int i =kelıme.length()-1; i>=0 ; i--) {
            ters = ters + kelıme.charAt(i);
        }
        return ters;
    }
}
