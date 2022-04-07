package day18_NestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {


        // kullanicidan istedigi kadar sayi girmesini isteyin
       // kullanicidan giridigi sayilarin toplami 500'u gecerse
       // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner scanner=new Scanner(System.in);
        int sayı=0;
        int toplam=0;

        while (toplam<500){
            System.out.println("bır sayı gırınız");
            sayı=scanner.nextInt();
            toplam+=sayı;


        }

        System.out.println("artik yeter cok sayi girdin, toplam : " +toplam+ " oldu");

    }
}
