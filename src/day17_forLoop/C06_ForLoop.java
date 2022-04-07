package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {


       // verılen ıkı harf ve aralarındakı harflerı yazdıran
        // bır kod yazdırın


        char ilkHarf='a';
        char sonHarf='z';

        for (char i =ilkHarf; i <=sonHarf; i++) {
            System.out.print(i+" ");

        }

      double baslangıc=10;
        double bıtıs=20;
        double artıs=0.2;

        //baslangıc ve bıtıs sayıları arasında artıs mıktarı ıle olusacak
        // tum sayıları yazdırın

        for (double i =baslangıc; i <=bıtıs ; i++) {
            System.out.print(i + " ");

        }

    }
}
