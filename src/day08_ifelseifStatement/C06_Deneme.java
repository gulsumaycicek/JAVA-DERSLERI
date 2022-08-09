package day08_ifelseifStatement;

import java.util.Scanner;

public class  C06_Deneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karekter giriniz");
        char karakter=scan.next().toUpperCase().charAt(0);

        if (karakter>='A'&& karakter<='Z'){
            System.out.println("Girtiginiz karekter harftir");

        }else if (karakter>='a'&& karakter<='z'){
            System.out.println("Girdiğiniz karekter harftir");
        }else {
            System.out.println("Girdiginiz karekter harf değildir");
        }
    }
}
