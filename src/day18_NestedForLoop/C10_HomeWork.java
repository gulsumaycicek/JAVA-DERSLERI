package day18_NestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class C10_HomeWork {
    public static void main(String[] args) {

         {
            // bilgisayara 1 ile 100 arasinda bir sayi tutturun
            // kullanicidan bu sayiyi tahmin etmesini isteyin
            // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
            // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin


            Random rnd=new Random();
            int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur


             Scanner scanner=new Scanner(System.in);
             int tahmin=0;
             int sayac=1;


             while (sayi !=tahmin){
                 System.out.println("lutfen bır sayı gırınız");
                 tahmin= scanner.nextInt();

                 if (tahmin>sayi){
                     System.out.println("daha kucuk bır sayı soylemelısın");

                 }else if (tahmin<sayi){
                     System.out.println("Daha buyuk sayı soylemelısın");


                 }
                 sayac++;

                 System.out.println("tuttugum sayıyı"+(sayac-1)+"tahmınde bulununuz");

             }


        }
    }
}
