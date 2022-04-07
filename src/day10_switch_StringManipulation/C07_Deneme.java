package day10_switch_StringManipulation;

import java.util.Scanner;

public class C07_Deneme {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("harf gırınız");
        char harf= scanner.next().toLowerCase().charAt(0);

        switch (harf){
            case 's':
                System.out.println("Software");break;
            case 'd':
                System.out.println("Developer");break;
            case 'e':
                System.out.println("Engineer");break;
            case 't':
                System.out.println("ın Testıng");break;
            default:
                System.out.println("gecerlı bır harf gırınız");

      break;
        }
    }
}
