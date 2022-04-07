package day06_concetenation_Operators;

public class C01_Concetenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Güzeldir";

        int sayı1=5;
        int sayı2=3;

        System.out.println(str1+sayı1+str2);

        System.out.println(sayı1-sayı2+str2+sayı1*sayı2);

        System.out.println(str1+(sayı1-sayı2)+(sayı1-sayı2));

        System.out.println(""+sayı1+sayı2+str2);


        // variable'larin degerlerini degistirmeden
        // asagidaki ifadeleri, bu variable'lari kullanarak yazdirin
        // Java5Guzel
       /// System.out.println(str1+sayi1+str2); // Java5Guzel
        // 2Guzel15
        //System.out.println(sayi1-sayi2+str2+sayi1*sayi2); // 2Guzel15
        // Java22
       ///// System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2)); // Java22
        // 53Guzel
      //  System.out.println(sayi1+sayi2+str2); //8Guzel
       // System.out.println(sayi1+ (sayi2+  str2)); // 53Guzel
       /// System.out.println(""+sayi1+sayi2+str2); // 53Guzel

        /*
        Eger tamamen sayilardan olusan bir String varsa ve biz bunu int'a cevirmek istersek
        Integer.valueOf(str)


        bir sayiyi String'e cevirmek istersem
        ""+sayi
         */

    }
}
