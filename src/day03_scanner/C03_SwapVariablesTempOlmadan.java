package day03_scanner;

public class C03_SwapVariablesTempOlmadan {
    public static void main(String[] args) {
          // Verilen sayi1 ve sayi2 variable’larinin degerlerini
      //  ucuncu bir variable kullanmadan degistiren (SWAP)
      //  bir program yazin//


            int sayi1= 30;
            int sayi2=20;
            System.out.println("Swap tan önce sayı1 : " + sayi1 + " " + "sayi2 : " + sayi2);
            sayi1= sayi1+sayi2;//sayı1=30
            sayi2=sayi1-sayi2;//sayı2=10
            sayi1=sayi1-sayi2;//sayı1=20
            System.out.println("Swap tan sonra sayı1 : " +sayi1 +" " + "sayı2 " +sayi2);

        }
    }

