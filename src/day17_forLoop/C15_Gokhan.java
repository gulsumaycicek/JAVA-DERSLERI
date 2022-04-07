package day17_forLoop;

import java.util.Scanner;

public class C15_Gokhan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str = scanner.next();
        for (int i = 0; i <str.length(); i++){
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
        }

    }
}


