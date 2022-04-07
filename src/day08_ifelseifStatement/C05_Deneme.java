package day08_ifelseifStatement;

import java.util.Scanner;

public class C05_Deneme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String günİsmi = scanner.next().toLowerCase();

        if (günİsmi.equals("cuma")) ;
        {

            System.out.println("müslimanlar için kutsal gün");
        }

        if (günİsmi.equals("cumartesi")) ;
        {
            System.out.println("hitirsiyanlar için kutsal güm");
        }

        if (günİsmi.equals("pazar")) ;
        {
            System.out.println("yahudiler için kutsal gün");
        }
    }
}