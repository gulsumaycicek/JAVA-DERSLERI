package day42_exceptions;

import java.util.Scanner;

public class C03_IIIegalArgumentException {

    public static void main(String[] args) {


/*
Kullanıcıdan yasını isteyin kullanıcı yas olarak negatif bir sayii,
0 veya 120'den buyuk bir sayi girerise
IllegalArgumentException olusacak sekilde bir program yaziniz.
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen yasınızi giriniz");

        int yas= scanner.nextInt();

        if (yas<=0 || yas>120){

            //System.out.println("Lutfen gecerli bir yas giriniz");
            //java bizim istedigimiz durumlarda exception firlatabilir

            throw new IllegalArgumentException();

        }else {
            System.out.println("uygun yas girdiniz tesekkkurler");
        }
    }
}
