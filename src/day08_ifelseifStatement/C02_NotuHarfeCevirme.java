package day08_ifelseifStatement;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {

        //Kullanicidan 100 uzerinden notunu isteyin..

      //  Not’u harf sistemine cevirip yazdirin//

        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen notunuzu giriniz");

        double notSayı= scanner.nextDouble();

        if (notSayı<50){
            System.out.println("notunuz D");
        }else if (notSayı>=50&& notSayı<60){
            System.out.println("notunuz C");
        }else if (notSayı>60&& notSayı<80){
            System.out.println("notunuz B");

        } else{
            System.out.println("notunuz A");
        }
    }
    }
