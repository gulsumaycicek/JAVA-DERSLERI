package day07_ifElseStatement;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen yaşinizi giriniz");
        int yas= scanner.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");

        } else {
            System.out.println("emekli olamazsın");

        }
    }
}
