package day17_forLoop;

public class C13_Deneme {
    public static void main(String[] args) {

         /*  ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        toplayip, sonucu yazdiran bir program yaziniz*/

        int sayı1=15;
        int sayı2=98;
        int toplam=0;

        for (int i =sayı1; i <=sayı2 ; i++) {

            toplam +=i;
            System.out.println(toplam);

        }




    }
}
