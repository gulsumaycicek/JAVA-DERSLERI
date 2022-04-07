package day08_ifelseifStatement;

import java.util.Scanner;

public class C01_İfElseİf {
    public static void main(String[] args) {

        //girilen bir karekterin,harf olup olmadıgını kontrol edelim//

        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen bir karekter giriniz");

        char karakter= scanner.next().charAt(0);

        if ((karakter>='A' && karakter<='Z')  || (karakter>='a' && karakter<='z')){
            System.out.println("Girdiginiz karakter bir harf");
        } else {
            System.out.println("Girdiginiz karakter harf degil");


        }
    }



    }

