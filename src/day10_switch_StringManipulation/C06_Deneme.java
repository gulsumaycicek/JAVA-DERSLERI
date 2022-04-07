package day10_switch_StringManipulation;

import java.util.Scanner;

public class C06_Deneme {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bır sayı gırınız");
        int sayı= scanner.nextInt();

        switch (sayı){
            case 10:
                System.out.println("ıkı basamaklı en kucuk sayı");break;
            case 100:
                System.out.println("uc basamaklı en kucuk sayı");break;
            case 1000:
                System.out.println("dort basamaklı en kucuk sayı");break;
            default:
                System.out.println("gırdıgın sayıyı degıstır");

        }
    }
}
