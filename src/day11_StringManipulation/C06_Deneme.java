package day11_StringManipulation;

import java.util.Scanner;

public class C06_Deneme {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen  bır cumle gırınız");
        String cumle=scanner.nextLine();



        System.out.println("lutfen bır kelıme gırınız");
        String kelime=scanner.next();
        int index=cumle.indexOf("kelıme");

        if (index<0){
            System.out.println("girdiginiz kelime cumlede kullanılmamıstır");
        }else if(cumle.indexOf(kelime,index+1)<0){
            System.out.println("girdiginiz kelime cumlede 1 kere kullanılmıstır");
        }else {
            System.out.println("girdiginiz kelime cumlede birden fazla kullanılmıstır");
        }
    }
}
