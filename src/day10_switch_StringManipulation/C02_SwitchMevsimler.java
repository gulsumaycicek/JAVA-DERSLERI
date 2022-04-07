package day10_switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen kacıncı ayda oldugumuzu yazınız");

        // Kullanicidan kacinci ay oldugunu alip mevsimi yazdiran bir
        // switch olusturun

        int aYno = scanner.nextInt();
        switch (aYno) {

            case 1:
            case 2:

            System.out.println("ilkbahar");
            case 3:


            case 4:
                System.out.println("kıs");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("lutfen gecerlı bır ay gırınız");
        }
    }
}