package day08_ifelseifStatement;

import java.util.Scanner;

public class C07_Deneme {
    public static void main(String[] args) {

        //kullanıcıdan maas ıcın bir teklif isteyin
        //teklif 80000 ustundeyse "kabul ediyorum"
        //60000-80000 arasında ise "konusabılırız"
        //60000 altıysa" maalesef kabul edemem"

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen maas teklifini giriniz");
        int teklif= scanner.nextInt();
        if (teklif>=80000){
            System.out.println("teklifi kabul ediyorum");
        }else if (teklif>=60000){
            System.out.println("konusa biliriz");
        }else {
            System.out.println("kabul etmiyorum");
        }


    }
}
