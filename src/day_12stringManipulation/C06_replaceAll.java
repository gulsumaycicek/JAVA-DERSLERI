package day_12stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ısmınızı ve soyısmınızı gırınız");
        String ısımsoyısım=scan.nextLine();

        System.out.println(ısımsoyısım.replaceAll("\\S","*"));

    }
}
