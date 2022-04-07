package day13_stringManipulation;

import java.util.Scanner;

public class C06_Deneme {
    public static void main(String[] args) {


    //Kullanıcıdan ısım ısteyın.Eger
     //isim a harfı ıcerıyorsa "gırdıgınız ısım a harfı ıcerıyor"
     //isim Z harfı ıcerıyorsa "gırdıgınız ısım Zharfı ıcerıyor"
     //ikiside yoksa "gırdıgınız ısım a ve Z harfı ıcermıyor"yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen ısmınızı gırınız");
        String isim= scanner.next();


        if (isim.contains("a")){
            System.out.println("gırdıgınız ısım  a harfı ıcerıyor");

        }else if (isim.contains("Z")){
            System.out.println("gırdıgınız ısım Z harfı ıcerıyor");

        }else {
            System.out.println("gırdıgınız ısım a veya Z harfı ıcermıyor");
        }

    }
}
