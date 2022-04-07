package day10_switch_StringManipulation;

import java.util.Scanner;

public class C05_Deneme {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen gun ısmı gırınız");
        int gunIsmı= scanner.nextInt();

        switch (gunIsmı){

            case 1:
                System.out.println("pazartesı"); break;
            case 2:
                System.out.println("salı");break;
            case 3:
                System.out.println("carsamba");break;
            case 4:
                System.out.println("persembe");break;
            case 5:
                System.out.println("cuma");break;
            case 6:
                System.out.println("cumartesı");break;
            case 7:
                System.out.println("pazar");break;
            default:
                System.out.println("gecerlı bır gun ısmı gırınız");




        }
    }
}
