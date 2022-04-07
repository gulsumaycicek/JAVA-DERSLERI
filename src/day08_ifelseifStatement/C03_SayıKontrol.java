package day08_ifelseifStatement;

import java.util.Scanner;

public class C03_SayıKontrol {
    public static void main(String[] args) {

        //Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
        //isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        //sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz");

        double sayı1 = scanner.nextDouble();
        double sayı2 = scanner.nextDouble();

        //sayıların ikiside pozitif ise sayıların toplamını yazdırın

        if (sayı1 > 0 && sayı2 > 0) {

            System.out.println("girdiğiniz iki sayi da pozitif olduğundan toplamları="+sayı1+sayı2);

        }else if (sayı1<0&&sayı2<0){

            System.out.println("girdiğiniz iki sayıda negatif olduğundan çarpımları="+sayı1*sayı2);

        }else if (sayı1*sayı2<0){

            System.out.println("farklı işaretlerde olan sayılarla işlem yapamazsınız");

        }else {

            System.out.println("sıfır carpma işleminde yutan elemandır");
        }
    }

    }