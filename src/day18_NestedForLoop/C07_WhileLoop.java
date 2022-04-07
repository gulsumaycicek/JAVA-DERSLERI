package day18_NestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

       // kullanıcıdan kac sayı toplamak ıstedıgını alın
        //bu sayıları alın ve bu sayıların toplamını ekrana tazdırın

        int sayıAdetı=5;

        Scanner scanner=new Scanner(System.in);
        int sayı=0;
        int toplam=0;



        for (int i =1; i <=sayıAdetı ; i++) {
            System.out.println("lutfen bır sayı gırınız");
            sayı=scanner.nextInt();
            toplam+=sayı;


        }
        System.out.println("gırılen "+sayıAdetı+"sayınıntoplamı:"+toplam);



        //while ile yapalım

        sayı=0;
        toplam=0;
        int sayac=1;

        while (sayac<=sayıAdetı){
            System.out.println("lutfen bır sayı gırınız");
            sayı=scanner.nextInt();
            toplam+=sayı;
            sayac++;
        }

        System.out.println("gırılen "+sayıAdetı+"sayınıntoplamı:"+toplam);
    }
}
