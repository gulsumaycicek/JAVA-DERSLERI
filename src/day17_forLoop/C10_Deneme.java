package day17_forLoop;

import java.util.Scanner;

public class C10_Deneme {
    public static void main(String[] args) {

        //Kullanıcıdan 10'dan küçük bir tamsayı isteyin ve girilen sayının faktoriyelini bulun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi=scan.nextInt();

        int faktoriyel=1;

        for (int i=sayi; i>0;i--){
            faktoriyel=faktoriyel*i;
        }

        System.out.println(faktoriyel);


    }
}
