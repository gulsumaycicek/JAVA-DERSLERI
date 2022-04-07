package day17_forLoop;

import java.util.Scanner;

public class C11_Deneme {
    public static void main(String[] args) {

        //kullanıcıdan bır strıng ısteyın ve tersden yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bır kelıme gırınız");
        String str= scanner.next();

        for (int i =str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));

        }


    }
}
