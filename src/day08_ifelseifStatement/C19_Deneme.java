package day08_ifelseifStatement;

import java.util.Scanner;

public class C19_Deneme {
    public static void main(String[] args) {
      //girilen sayının kac basamaklı oldugunu yazdırın//

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int sayı=scanner.nextInt();

        if (sayı<10){

            System.out.println("girmiş oldugunuz sayı 1 basamaklıdır");
        }else if (sayı<100){
            System.out.println("girmiş oldugunuz sayı 2 basamaklıdır");
        }else if (sayı<1000){
            System.out.println("girmiş oldugunuz sayı 3 basamaklıdır");

        }else {
            System.out.println("girmiş oldugunuz sayı cok basamaklıdır");
        }
    }
}
